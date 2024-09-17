package com.ajwalker.utility;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    private static SessionFactory sessionFactory;

    static{
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.out.println("Hibernate SessionFactory creation failed..."+ e.getMessage());
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
