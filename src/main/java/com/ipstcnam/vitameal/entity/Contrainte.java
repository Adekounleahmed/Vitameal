package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ipstcnam.vitameal.beans.enums.Nature;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class Contrainte implements Serializable {
	private static final long serialVersionUID = -3279023412729822774L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int contrainteID;
	@Enumerated(EnumType.STRING)
	private Nature nature;
	private String nom;
	private Forme forme;
	private Famille famille;
	private Texture texture;

	public Contrainte(){
		nature = Nature.Ma;
		nom = "";
	}

	public Nature getNature() {
		return nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public int getContrainteID() {
		return contrainteID;
	}

	public void setContrainteID(int id) {
		contrainteID = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Forme getForme() {
		return forme;
	}

	public void setForme(Forme forme) {
		this.forme = forme;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}
}