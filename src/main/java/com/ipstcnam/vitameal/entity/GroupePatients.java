package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class GroupePatients implements Serializable {
	private static final long serialVersionUID = -611125065500023143L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int groupePatientsID;
	private String nom;
	//private List<Patient> estFormeParPatient;
	//private List<Contrainte> estAffecteParContrainte;
	@OneToMany
	@JoinColumn(name="groupePatientsID")
	private List<Menu> consommeMenu;

	public GroupePatients(){
		nom = "";
	}
	
	public GroupePatients(String unNom, int unID) {
		nom = unNom;
		groupePatientsID = unID;
	}

	public int getGroupePatientsID() {
		return groupePatientsID;
	}
	
	public void setNom(String unNom) {
		nom = unNom;
	}
	
	public String getNom() {
		return nom;
	}
/*
	public List<Patient> getEstFormeParPatient() {
		return estFormeParPatient;
	}

	public void setEstFormeParPatient(List<Patient> estFormeParPatient) {
		this.estFormeParPatient = estFormeParPatient;
	}

	public List<Contrainte> getEstAffecteParContrainte() {
		return estAffecteParContrainte;
	}

	public void setEstAffecteParContrainte(List<Contrainte> estAffecteParContrainte) {
		this.estAffecteParContrainte = estAffecteParContrainte;
	}
*/
	public List<Menu> getConsommeMenu() {
		return consommeMenu;
	}

	public void setConsommeMenu(List<Menu> consommeMenu) {
		this.consommeMenu = consommeMenu;
	}
}