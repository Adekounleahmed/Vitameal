package com.ipstcnam.vitameal.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.entity.Plat;

/**
 * DAO des entités {@link Plat}.
 * 
 * @author Nicolas Symphorien
 *
 */
@Stateless
public class PlatDao implements Serializable {
	private static final long serialVersionUID = -5676123578912282186L;
	private static final Logger logger = LogManager.getLogger(PlatDao.class);
	
	transient private EntityManager em;
	
	public PlatDao(EntityManager em) {
		this.em = em;
	}
	
	public void create(Plat plat) {
		em.getTransaction().begin();
		try {
			em.persist(plat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l'ajout d'un plat en base de données", e);
		}
	}
	
	public List<Plat> findAll() {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<Plat> criteriaQuery = criteriaBuilder.createQuery(Plat.class);
		Root<Plat> platRoot = criteriaQuery.from(Plat.class);
		criteriaQuery.select(platRoot);
		
		TypedQuery<Plat> typedQuery = em.createQuery(criteriaQuery);		
		return typedQuery.getResultList();
	}
	
	public Plat findById(Integer idPlat) {
		return em.find(Plat.class, idPlat);
	}

	public void update(Plat plat) {
		em.getTransaction().begin();
		try {
			em.merge(plat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l' édition d'un plat  en base de données", e);
		}
	}

	public void delete(Plat plat) {
		em.getTransaction().begin();
		try {
			em.remove(plat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de la suppression d'un plat en base de données", e);
		}
		
	}

}
