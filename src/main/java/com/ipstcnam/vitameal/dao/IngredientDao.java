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

import com.ipstcnam.vitameal.entity.Aliment;
import com.ipstcnam.vitameal.entity.Plat;

/**
 * DAO des entités {@link Aliment}.
 * 
 * @author Nicolas Symphorien
 *
 */
@Stateless
public class IngredientDao implements Serializable {
	private static final long serialVersionUID = -7830864526566789037L;
	private static final Logger logger = LogManager.getLogger(IngredientDao.class);
	
	transient private EntityManager em; // FIXME ATTENTION l'entity manager ne doit etre utiliser que par la couche DAO
										// FIXME refactoring a faire pour l'appel du meme entity manager par les DAO
										// FIXME solution possible : injection de dépendance
	
	public IngredientDao(EntityManager em) {
		this.em = em;
	}
	
	public void creer(Aliment aliment) {
		em.getTransaction().begin();
		try {
			em.persist(aliment);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l'ajout d'un ingrédient en base de données", e);
		}
	}

	public void update(Aliment aliment) {
		em.getTransaction().begin();
		try {
			em.merge(aliment);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l'édition d'un ingrédient en base de données", e);
		}
	}

	public Aliment findById(Integer idIngredient) {
		return em.find(Aliment.class, idIngredient);
	}

	public List<Aliment> findAll() {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<Aliment> criteriaQuery = criteriaBuilder.createQuery(Aliment.class);
		Root<Aliment> ingredientRoot = criteriaQuery.from(Aliment.class);
		criteriaQuery.select(ingredientRoot);
		
		TypedQuery<Aliment> typedQuery = em.createQuery(criteriaQuery);		
		return typedQuery.getResultList();
	}

}

