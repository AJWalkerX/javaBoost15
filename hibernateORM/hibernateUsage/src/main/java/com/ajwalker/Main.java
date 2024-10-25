package com.ajwalker;

import com.ajwalker.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory puHibernate = Persistence.createEntityManagerFactory("pu_hibernate");
        EntityManager em = puHibernate.createEntityManager();
        User user = new User("Barış","Demirci","dsadq@gmail",
                "ahmed0","123",
                LocalDate.of(1999, 10,1),
                LocalTime.of(10,01),"dkasşlkdaskl");

        em.getTransaction().begin();
//        User user = em.find(User.class, 1L);
        user.setName("ahmet");
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
}