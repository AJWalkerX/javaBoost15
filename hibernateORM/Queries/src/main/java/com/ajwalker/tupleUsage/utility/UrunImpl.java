package com.ajwalker.tupleUsage.utility;

import com.ajwalker.tupleUsage.entity.Ozellik;
import com.ajwalker.tupleUsage.entity.Resim;
import com.ajwalker.tupleUsage.entity.Urun;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class UrunImpl {

    public void createUrun(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("URUN");
        EntityManager em = emf.createEntityManager();

        Resim resim1 = Resim.builder().ad("asus_1").url("https://picsum.photos/100/100").build();
        Resim resim2 = Resim.builder().ad("asus_2").url("https://picsum.photos/100/100").build();

        Urun urun = Urun.builder()
                .ad("Asus Laptop")
                .fiyat(125999d)
                .resimler(List.of(resim1,resim2))

                .build();

        em.getTransaction().begin();
//        em.persist(resim1);
//        em.persist(resim2);
        em.persist(urun);
        Ozellik ozellik1 = Ozellik.builder().ad("i7 cpu").aciklama("").urun(urun).build();
        Ozellik ozellik2 = Ozellik.builder().ad("64gb ram").aciklama("").urun(urun).build();
        em.persist(ozellik1);
        em.persist(ozellik2);

        Resim resim3 = Resim.builder().ad("apple_1").url("https://picsum.photos/100/100").build();
        Resim resim4 = Resim.builder().ad("apple_2").url("https://picsum.photos/100/100").build();
        Resim resim5 = Resim.builder().ad("apple_3").url("https://picsum.photos/100/100").build();
        Resim resim6 = Resim.builder().ad("apple_4").url("https://picsum.photos/100/100").build();

        Urun urun2 = Urun.builder()
                .ad("Mac Studio")
                .fiyat(225999d)
                .resimler(List.of(resim3,resim4,resim5,resim6))

                .build();
        em.persist(urun2);
        Ozellik ozellik3 = Ozellik.builder().ad("AppleChip 32/78").aciklama("").urun(urun2).build();
        Ozellik ozellik4 = Ozellik.builder().ad("128gb ram").aciklama("").urun(urun2).build();
        Ozellik ozellik5 = Ozellik.builder().ad("1Tb ssd").aciklama("").urun(urun2).build();

        em.persist(ozellik3);
        em.persist(ozellik4);
        em.persist(ozellik5);
        em.getTransaction().commit();
        em.close();
    }
}
