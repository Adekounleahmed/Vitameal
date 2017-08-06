package com.ipstcnam.vitameal.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.entity.Menu;
import com.ipstcnam.vitameal.listeners.ApplicationListener;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:03:39
 */
@Stateless
public class MenuDAO implements Serializable {
	private static final long serialVersionUID = -4945611379817104748L;
	@PersistenceContext(unitName="com.ipstcnam.vitameal.jpa")
	private transient EntityManager em;
    private static final Logger logger = LogManager.getLogger(MenuDAO.class);

	public MenuDAO(){
		em = ApplicationListener.getEmf().createEntityManager();
	}

	public void creer(Menu leMenu) {
		em.getTransaction().begin();
		try {
			em.persist(leMenu);
			em.getTransaction().commit();
			logger.info("Ajout effectué avec succés.");
		} catch(Exception e) {
			em.getTransaction().rollback();
			logger.error("Une erreur est survenue lors de l'ajout : " + e.getMessage());
			logger.error(e);
		}
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu> menus() {
		String jpqlQuery = "select menus from Menu menus";
		Query query = em.createQuery(jpqlQuery);
		return query.getResultList();
	}
}