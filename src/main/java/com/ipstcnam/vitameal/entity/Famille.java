package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Crustacés
 * Fruits à coque
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class Famille implements Serializable {
	private static final long serialVersionUID = 6727950214310787991L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String nom;

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
