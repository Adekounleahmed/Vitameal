package com.ipstcnam.vitameal.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.entity.GroupePatients;
import com.ipstcnam.vitameal.listeners.ApplicationListener;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:03:39
 */
@Stateless
public class GroupePatientsDAO implements Serializable {
	private static final long serialVersionUID = 8580620909894506979L;
	@PersistenceContext(unitName="com.ipstcnam.vitameal.jpa")
	private transient EntityManager em;

	public GroupePatientsDAO(){
		em = ApplicationListener.getEmf().createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<GroupePatients> groupesPatients() {
		String jpqlQuery = "SELECT c FROM GroupePatients c";
		Query query = em.createQuery(jpqlQuery);
		return query.getResultList();
	}
	
	public GroupePatients getGroupePatientsByName(String leNom) {
		String jpqlQuery = String.format("SELECT c FROM GroupePatients c WHERE c.nom='%s'", leNom);
		Query query = em.createQuery(jpqlQuery);
		return (GroupePatients) query.getSingleResult();
	}

	public GroupePatients getGroupePatientsByID(int unID) {
		String jpqlQuery = String.format("SELECT c FROM GroupePatients c WHERE c.groupePatientsID='%1$d'", unID);
		Query query = em.createQuery(jpqlQuery);
		return (GroupePatients) query.getSingleResult();
	}
}