package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Cette classe représente un aliment utilisé dans les plats.
 * 
 * @author Nicolas Symphorien
 */
@Entity
public class Aliment implements Serializable {
	private static final long serialVersionUID = -3859003130804553755L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer alimentID;
	
	private String nom;
	
	@ManyToOne
	private Famille famille;
	
	@ManyToOne
	private Forme forme;
	
	@ManyToOne
	private Texture texture;

	@OneToMany(mappedBy="aliment")
	private Collection<ComposantPlat> composantPlats;

	public Integer getAlimentID() {
		return alimentID;
	}

	public void setAlimentID(Integer id) {
		this.alimentID = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
