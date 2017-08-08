package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Natures nature;
	private String nom;
	private Forme forme;
	private Famille famille;
	private Texture texture;
	private List<AlimentsBase> alimentsBase;
	private List<GroupePatients> affecteGroupePatient;

	public Contrainte(){
		nature = Natures.Maladie;
		nom = "";
	}

	public Natures getNature() {
		return nature;
	}

	public void setNature(Natures nature) {
		this.nature = nature;
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

	public List<AlimentsBase> getAlimentsBase() {
		return alimentsBase;
	}

	public void setAlimentsBase(List<AlimentsBase> alimentsBase) {
		this.alimentsBase = alimentsBase;
	}

	public List<GroupePatients> getAffecteGroupePatient() {
		return affecteGroupePatient;
	}

	public void setAffecteGroupePatient(List<GroupePatients> affecteGroupePatient) {
		this.affecteGroupePatient = affecteGroupePatient;
	}
}