package com.ajwalker.repository;

import com.ajwalker.entity.Ogrenci;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class OgrenciRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public OgrenciRepository() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("pu_hibernate");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void save(Ogrenci ogrenci) {
		entityManager.getTransaction().begin();
		entityManager.persist(ogrenci);
		entityManager.getTransaction().commit();
	}
	// SELECT * FROM tblogrenci
	public List<Ogrenci> findAll(){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Ogrenci> criteria = builder.createQuery(Ogrenci.class); // Sorgudan geri dönecek tip belirtilen kısım.
		Root<Ogrenci> root = criteria.from(Ogrenci.class); // Sorgudaki fromdan sonraki kısma denk gelir.
		criteria.select(root); // select * işlemine karşılık gelir.
		
		return entityManager.createQuery(criteria).getResultList();
	}
}