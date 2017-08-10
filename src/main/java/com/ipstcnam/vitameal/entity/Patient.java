package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ipstcnam.vitameal.beans.enums.Genre;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class Patient implements Serializable {
	private static final long serialVersionUID = -8348352333261399356L;
	private int age;
	private int chambre;
	private String nom;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer patientID;
	private int poids;
	private String prenom;
	private String service;
	@Enumerated(EnumType.STRING)
	private Genre sexe;
	private int taille;
	private GroupePatients formeGroupePatient;

	public Patient(){
		age = 0;
		chambre = 0;
		nom = "";
		poids = 0;
		prenom = "";
		service = "";
		taille = 0;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getChambre() {
		return chambre;
	}

	public void setChambre(int chambre) {
		this.chambre = chambre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPatientID() {
		return patientID;
	}

	public void setPatientID(Integer id) {
		patientID = id;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Genre getSexe() {
		return sexe;
	}

	public void setSexe(Genre sexe) {
		this.sexe = sexe;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public GroupePatients getFormeGroupePatient() {
		return formeGroupePatient;
	}

	public void setFormeGroupePatient(GroupePatients formeGroupePatient) {
		this.formeGroupePatient = formeGroupePatient;
	}

}