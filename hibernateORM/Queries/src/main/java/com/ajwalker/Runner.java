package com.ajwalker;

import com.ajwalker.entity.Adres;
import com.ajwalker.entity.Departman;
import com.ajwalker.entity.Personel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;

import java.util.List;

public class Runner {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("URUN");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();
    public static void main(String[] args) {
        entityManager.getTransaction().begin();
        addDemoData();

//        findByDepartman("yazılım");
//        findByIlce("karşıyaka");
//        findPersonelByUnvan("front-end");
//        findAllPersonelByMudurName("Alex");
//        groupByDepartman();
        listAllPersonel();
        groupByUnvan();
        entityManager.close();
        entityManagerFactory.close();


    }

    //* 1- Adı verilen bir departmanda çalışan personelleri listesi - (ad  > like  + ignoreCase)
    /*
    * SELECT p.* FROM tbldepartman d
    * JOIN tblpersonel p ON d.id = p.departman_id
    * WHERE departman.ad LIKE = ?
    */
    private static void findByDepartman(String departmanAdi){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Personel> cq = cb.createQuery(Personel.class);
        Root<Personel> personelRoot = cq.from(Personel.class);
        Join<Personel, Departman> departmanJoin = personelRoot.join("departman");

        cq.select(personelRoot);
        cq.where(cb.like(cb.lower(departmanJoin.get("ad")), "%" + departmanAdi.toLowerCase() + "%"));
        entityManager.createQuery(cq).getResultList().forEach(personel -> {
            System.out.println("Personel ismi   : " + personel.getAd()+ " "+ personel.getSoyad());
            System.out.println("Personel mass   : " + personel.getMaas());
            System.out.println("Personel unvan  : " + personel.getUnvan());
            System.out.println("----------------------------------------------------------------");
        });

    }

    //* 2- Belli bir ilde ikamet eden personellerin listesi
    /*
     * SELECT p.* FROM tbladres a
     * JOIN tblpersonel p ON a.personel_id = p.id
     * WHERE a.ilce LIKE = ?
     */
    private static void findByIlce(String ilce){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Adres> cq = cb.createQuery(Adres.class);
        Root<Adres> adresRoot = cq.from(Adres.class);
        Join<Adres, Personel> personelJoin = adresRoot.join("personel");

        cq.select(adresRoot);
        cq.where(cb.like(cb.lower(adresRoot.get("ilce")), "%" + ilce.toLowerCase() + "%"));

        entityManager.createQuery(cq).getResultList().forEach(adres -> {
            Personel personel = adres.getPersonel(); // assuming Adres has a getPersonel() method
            System.out.println("Personel ismi   : " + personel.getAd() + " " + personel.getSoyad());
            System.out.println("----------------------------------------------------------------");
        });

    }
    //* 3- Adını verdiğim Müdür ile çalışan personellerin listesi
    /*
     * SELECT p.* FROM tbldepartman d
     * JOIN tblpersonel p ON p.departman_id = d.id
     * WHERE d.id IN
     * (SELECT d.id FROM tbldepartman d
     * JOIN tblpersonel p ON p.departman_id = d.id
     * WHERE p.ad LIKE = ?)
     */
    private static void  findAllPersonelByMudurName(String mudurName){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Personel> cq = cb.createQuery(Personel.class);
        Root<Personel> personelRoot = cq.from(Personel.class);
        cq.select(personelRoot)
                .where(cb.like(cb.lower(personelRoot.get("ad")), "%" + mudurName.toLowerCase() + "%"));

        Personel singleResult = entityManager.createQuery(cq).getSingleResult();

        if (singleResult.getId().equals(singleResult.getDepartman().getYetkiliID())) {
            singleResult.getDepartman().getPersonelList().forEach(singlePersonel -> {
                System.out.println("Personel ismi: " + singlePersonel.getAd() + " " + singlePersonel.getSoyad());
                System.out.println("----------------------------------------------------------------");
            });
        }


    }

    //* 4- Belli bir ünvana sahip personellerin listesi.
    /*
    * SELECT * FROM tblpersonel
    * WHERE unvan LIKE = %?%
    */
    private static void findPersonelByUnvan(String unvan){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Personel> cq = cb.createQuery(Personel.class);
        Root<Personel> personelRoot = cq.from(Personel.class);

        cq.select(personelRoot).where(cb.like(cb.lower(personelRoot.get("unvan")),"%"+ unvan.toLowerCase() + "%"));
        entityManager.createQuery(cq).getResultList().forEach(personel -> {
            System.out.println("Personel ismi   : " + personel.getAd() + " " + personel.getSoyad());
            System.out.println("-----------------------------------------------------------------");
        });
    }

    // * 5- departmanlarda çalışan personellerin sayıları -> bilgiişlem: 5, insankaynakları: 3 gibi
    private static void groupByDepartman(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Departman> cq = cb.createQuery(Departman.class);
        Root<Departman> departmanRoot = cq.from(Departman.class);
        cq.select(departmanRoot);
        entityManager.createQuery(cq).getResultList().forEach(departman -> {
            System.out.println("Departman ismi : " + departman.getAd());
            System.out.println("Çalışan sayısı: " + departman.getPersonelList().size());
            System.out.println("------------------------------------------------------------------");
        });
    }
    //* 6- ünvanlarına göre personel sayıları
    private static void groupByUnvan(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> cq = cb.createQuery(Tuple.class);
        Root<Personel> personelRoot = cq.from(Personel.class);

        cq.multiselect(personelRoot.get("unvan"), cb.count(personelRoot))
                .groupBy(personelRoot.get("unvan"));

        List<Tuple> results = entityManager.createQuery(cq).getResultList();

        for (Tuple result : results) {
            String unvan = result.get(0, String.class);
            Long count = result.get(1, Long.class);
            System.out.println("Unvan: " + unvan + ", Count: " + count);
        }
    }

    /*
     *7- personel Listesi;
     * id: 44
     * ad: Muhammet
     * ünvan: Eğitmen
     * departmanı: Yazılım
     * müdür: Ayhan
     * -------------
     * şeklinde bir çıktı verin.
     */
    private static void listAllPersonel(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Departman> cq = cb.createQuery(Departman.class);
        Root<Departman> departmanRoot = cq.from(Departman.class);
        cq.select(departmanRoot);
        entityManager.createQuery(cq).getResultList().forEach(departman -> {
            Personel first = departman.getPersonelList().stream().filter(personel -> personel.getId().equals(departman.getYetkiliID())).toList().getFirst();
            System.out.println("Mudur: " + first.getAd());
            System.out.println("Departman ismi : " + departman.getAd());
            System.out.println("Calışanlar:");
            departman.getPersonelList().forEach(personel -> {
                System.out.println("id: " + personel.getId());
                System.out.println("ad: " + personel.getAd() + " " + personel.getSoyad());
                System.out.println("unvan: " + personel.getUnvan());

            });

            System.out.println("-----------------------------------------------------------------");
        });
    }

    private static void addDemoData(){


        Departman departman = Departman.builder().ad("Yazılım").yetkiliID(1L).aciklama("Açıklama").build();

        Personel müdür = Personel.builder().ad("Alex").soyad("Walker").unvan("Müdür").maas("3271893821").departman(departman).build();
        Personel personel = Personel.builder().ad("Ahmet").soyad("Ünal").unvan("Yazılımcı").maas("50090").departman(departman).build();
        Personel personel2 = Personel.builder().ad("Mehmet").soyad("Kenet").unvan("Front-End").maas("53090").departman(departman).build();
        Personel personel3 = Personel.builder().ad("Kerim").soyad("Gelizoğlu").unvan("Front-End").maas("51090").departman(departman).build();

        departman.setPersonelList(List.of(müdür, personel, personel2, personel3));

        Adres adres = Adres.builder().il("İzmir").ilce("Karşıyaka").telefon("123").acikAdres("...").ad("Alex'in adresi").personel(müdür).build();
        Adres adres2 = Adres.builder().il("Eskişehir").ilce("Tepebaşı").telefon("123").acikAdres("...").ad("Alex'in adresi2").personel(müdür).build();

        müdür.setAdresList(List.of(adres, adres2));

        entityManager.persist(departman);
        entityManager.persist(müdür);
        entityManager.persist(personel);
        entityManager.persist(personel2);
        entityManager.persist(personel3);
        entityManager.persist(adres);
        entityManager.persist(adres2);
        entityManager.getTransaction().commit();
    }
}
