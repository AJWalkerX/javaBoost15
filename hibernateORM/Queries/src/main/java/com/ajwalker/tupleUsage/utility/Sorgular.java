package com.ajwalker.tupleUsage.utility;

import com.ajwalker.tupleUsage.entity.Urun;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;

import java.util.Arrays;
import java.util.List;

public class Sorgular {
    private EntityManagerFactory emf;
    private EntityManager em;
    private CriteriaBuilder cb;

    public Sorgular() {
        emf = Persistence.createEntityManagerFactory("URUN");
        em = emf.createEntityManager();
        cb = em.getCriteriaBuilder();
    }

    public void findAll() {
        CriteriaQuery<Urun> cq = cb.createQuery(Urun.class);
        Root<Urun> root = cq.from(Urun.class);
        cq.select(root);
        List<Urun> uruns = em.createQuery(cq).getResultList();
        for (Urun urun : uruns) {
            System.out.println(urun);
        }
    }

    public void findByColumn() {
        CriteriaQuery<String> cq = cb.createQuery(String.class);
        Root<Urun> root = cq.from(Urun.class);
        cq.select(root.get("ad"));
        List<String> uruns = em.createQuery(cq).getResultList();
        for (String urun : uruns) {
            System.out.println(urun);
        }
    }

    public void selectManyColumn(){
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Urun> root = cq.from(Urun.class);
        Path<String> adPath = root.get("ad");
        Path<Double> fiyatPath = root.get("fiyat");
        cq.select(cb.array(adPath, fiyatPath));
        List<Object[]> uruns = em.createQuery(cq).getResultList();
        for (Object[] urun : uruns) {
            System.out.println(Arrays.toString(urun));
        }
    }

    public void usingTuple(){
        CriteriaQuery<Tuple> criteriaQuery = cb.createTupleQuery();
        Root<Urun> root = criteriaQuery.from(Urun.class);
        Path<String> adPath = root.get("ad");
        Path<Double> fiyatPath = root.get("fiyat");

//        criteriaQuery.multiselect(adPath, fiyatPath);
        criteriaQuery.select(cb.tuple(adPath, fiyatPath));
        List<Tuple> uruns = em.createQuery(criteriaQuery).getResultList();
        for (Tuple urun : uruns) {
            System.out.println("ad: " + urun.get(adPath));
            System.out.println("fiyat: " + urun.get(fiyatPath));
            System.out.println("---------------------------------");
        }
    }

    public void usingWhere(){
        CriteriaQuery<Urun> criteriaQuery = cb.createQuery(Urun.class);
        Root<Urun> root = criteriaQuery.from(Urun.class);
        criteriaQuery.select(root);
        criteriaQuery.where(cb.like(root.get("ad"),"%a%"));
        List<Urun> uruns = em.createQuery(criteriaQuery).getResultList();
        for (Urun urun : uruns) {
            System.out.println("ad: "+ urun.getAd());
            System.out.println("fiyat: "+ urun.getFiyat());
            System.out.println("------------------------------");
        }
    }
}
