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
 * Cette classe représente un ingrédient utilisé dans les plats.
 * 
 * @author Nicolas Symphorien
 */
@Entity
public class Ingredient implements Serializable {
	private static final long serialVersionUID = -3859003130804553755L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String nom;
	
	@ManyToOne
	private Famille famille;
	
	@ManyToOne
	private Forme forme;
	
	@ManyToOne
	private Texture texture;

	@OneToMany(mappedBy="ingredient")
	private Collection<ComposantPlat> composantPlats;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
