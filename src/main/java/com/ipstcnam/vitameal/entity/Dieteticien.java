package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Dieteticien
 *
 */
@Entity
public class Dieteticien implements Serializable {
	private static final long serialVersionUID = 4290062697935509195L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer dieteticienID;
	private String nom;
	private String prenom;

	public Dieteticien() {
		super();
	}
   
	public void setDieteticienID(Integer id) {
		dieteticienID = id;
	}

	public Integer getDieteticienID() {
		return dieteticienID;
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
