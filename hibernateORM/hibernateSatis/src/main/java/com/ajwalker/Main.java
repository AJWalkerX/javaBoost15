package com.ajwalker;

import com.ajwalker.entity.Musteri;
import com.ajwalker.entity.Satis;
import com.ajwalker.enums.ECinsiyet;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory puHibernate = Persistence.createEntityManagerFactory("hiber01");
        EntityManager em = puHibernate.createEntityManager();
        Musteri ahmet = new Musteri("Ahmet");
        ahmet.setCinsiyet(ECinsiyet.ERKEK);
        Musteri mehmet = new Musteri("Mehmet");

        Satis satis1 = new Satis(1L,"telefon");
        Satis satis2 = new Satis(1L,"Makarna");
        Satis satis3 = new Satis(2L,"Kurutma makinesi");

        em.getTransaction().begin();
        em.persist(ahmet);
        em.persist(mehmet);
        em.persist(satis1);
        em.persist(satis2);
        em.persist(satis3);
        em.getTransaction().commit();
        em.close();

    }
}