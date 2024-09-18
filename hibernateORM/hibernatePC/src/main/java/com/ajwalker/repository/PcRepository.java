package com.ajwalker.repository;

import com.ajwalker.entity.Pc;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class PcRepository extends RepositoryManager<Pc,Long> {
    private final EntityManagerFactory emf;
    public PcRepository() {
        super(Pc.class);
        emf =  Persistence.createEntityManagerFactory("pu-hibernate");
    }

    public List<Pc> findByUserID(Long userID) {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pc> criteriaQuery = builder.createQuery(Pc.class);
        Root<Pc> root = criteriaQuery.from(Pc.class);
        criteriaQuery.select(root).where(builder.equal(root.get("user_id"), userID));



        return em.createQuery(criteriaQuery).getResultList();

    }
}
