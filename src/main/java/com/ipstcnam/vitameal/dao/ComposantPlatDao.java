package com.ipstcnam.vitameal.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.entity.ComposantPlat_;
import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK;
import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK_;

/**
 * DAO des entités {@link ComposantPlat}.
 * 
 * @author Nicolas Symphorien
 *
 */
@Stateless
public class ComposantPlatDao implements Serializable {
	private static final long serialVersionUID = -7830864526566789037L;
	private static final Logger logger = LogManager.getLogger(ComposantPlatDao.class);
	
	transient private EntityManager em;
	
	public ComposantPlatDao(EntityManager em) {
		this.em = em;
	}
	
	public void creer(ComposantPlat composantPlat) {
		em.getTransaction().begin();
		try {
			em.persist(composantPlat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l'ajout d'un composant plat en base de données", e);
		}
	}
	
	public ComposantPlat findByPk(ComposantPlatPK composantPlatPK) {
		return em.find(ComposantPlat.class, composantPlatPK);
	}

	public List<ComposantPlat> findByPlatId(Integer idPlat) {
		CriteriaQuery<ComposantPlat> criteriaQuery = findBy(idPlat, ComposantPlatPK_.platId);
		
		TypedQuery<ComposantPlat> typedQuery = em.createQuery(criteriaQuery);		
		return typedQuery.getResultList();
	}
	
	public List<ComposantPlat> findByIngredientId(Integer idIngredient) {
		CriteriaQuery<ComposantPlat> criteriaQuery = findBy(idIngredient, ComposantPlatPK_.ingredientId);
		
		TypedQuery<ComposantPlat> typedQuery = em.createQuery(criteriaQuery);		
		return typedQuery.getResultList();
	}
	
	public void update(ComposantPlat composantPlat) {
		em.getTransaction().begin();
		try {
			em.merge(composantPlat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l'édition d'un composant plat en base de données", e);
		}
	}

	private CriteriaQuery<ComposantPlat> findBy(Integer idToFind, SingularAttribute<ComposantPlatPK, Integer> persistanceId) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<ComposantPlat> criteriaQuery = criteriaBuilder.createQuery(ComposantPlat.class);
		Root<ComposantPlat> platRoot = criteriaQuery.from(ComposantPlat.class);
		criteriaQuery.select(platRoot);
		criteriaQuery.where(criteriaBuilder.equal(platRoot.get(ComposantPlat_.pk).get(persistanceId), idToFind));
		return criteriaQuery;
	}

	public void delete(ComposantPlat composantPlat) {
		em.getTransaction().begin();
		try {
			em.remove(composantPlat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de la suppression d'un composant plat en base de données", e);
		}
		
	}

	

}

