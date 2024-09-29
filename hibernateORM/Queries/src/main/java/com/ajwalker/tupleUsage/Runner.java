package com.ajwalker.tupleUsage;

import com.ajwalker.tupleUsage.entity.Urun;
import com.ajwalker.tupleUsage.utility.Sorgular;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Runner {
    public static void main(String[] args) {
//        Test();
//        new Sorgular().findAll();
//        new Sorgular().findByColumn();
//        new Sorgular().selectManyColumn();
//        new Sorgular().usingTuple();
//        new Sorgular().usingWhere();
    }

    private static void Test() {
        /**
         * gerekli kayıtları oluşması için başlangıç komutları
         */
//        new UrunImpl().createUrun();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("URUN");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Urun> cq = cb.createQuery(Urun.class);
        Root<Urun> root = cq.from(Urun.class);
//        cq.select(root.get("ad")); //SELECT as FROM tbl_urun
        cq.select(root);
        em.createQuery(cq).getResultList().forEach(System.out::println);
        em.close();
        emf.close();
        System.out.println("UYGULAMA BİTTİ.");
    }
}
