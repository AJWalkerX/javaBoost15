package com.ajwalker;

import com.ajwalker.entity.Musteri;
import com.ajwalker.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtility.getSessionFactory().openSession();

        Musteri musteri = new Musteri("semih");

        Transaction tx = session.beginTransaction();
        session.persist(musteri);

        tx.commit();
        session.close();
    }
}