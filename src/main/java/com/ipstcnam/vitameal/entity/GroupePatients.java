package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
	private Integer groupePatientsID;
	private String nom;
	@ManyToMany(mappedBy="affecte")
	private List<Contrainte> estAffectePar;
	@OneToMany
	@JoinColumn(name="groupePatientsID")
	private List<Repas> consommeRepas;

	public GroupePatients(){
		nom = "";
	}
	
	public GroupePatients(String unNom, int unID) {
		nom = unNom;
		groupePatientsID = unID;
	}

	public void setGroupePatientsID(Integer id) {
		groupePatientsID = id;
	}
	
	public Integer getGroupePatientsID() {
		return groupePatientsID;
	}
	
	public void setNom(String unNom) {
		nom = unNom;
	}
	
	public String getNom() {
		return nom;
	}

	public List<Contrainte> getEstAffectePar() {
		return estAffectePar;
	}

	public void setEstAffectePar(List<Contrainte> desContraintes) {
		estAffectePar = desContraintes;
	}

	public List<Repas> getConsommeRepas() {
		return consommeRepas;
	}

	public void setConsommeRepas(List<Repas> consommeRepas) {
		this.consommeRepas = consommeRepas;
	}
}