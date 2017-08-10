package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medecin
 *
 */
@Entity
public class Medecin implements Serializable {
	private static final long serialVersionUID = -282607767674718598L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer medecinID;
	private String nom;
	private String prenom;

	public Medecin() {
		super();
	}
   
	public void setMedecinID(Integer id) {
		medecinID = id;
	}

	public Integer getMedecinID() {
		return medecinID;
	}

	public void setNom(String unNom) {
		nom = unNom;
	}

	public String getNom() {
		return nom;
	}

	public void setPrenom(String unPrenom) {
		prenom = unPrenom;
	}

	public String getPrenom() {
		return prenom;
	}
}
