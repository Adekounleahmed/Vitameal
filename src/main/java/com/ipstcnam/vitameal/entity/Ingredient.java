package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @version 1.0
 * @created 09-août.-2017 09:33:00
 */
@Entity
public class Ingredient implements Serializable {
	private static final long serialVersionUID = 8311577336946300310L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String nom;

	public Ingredient(){
		nom = "";
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer unId) {
		id = unId;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}