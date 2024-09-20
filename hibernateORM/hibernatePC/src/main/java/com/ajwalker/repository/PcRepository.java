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
    public PcRepository() {
        super(Pc.class);
    }
}
