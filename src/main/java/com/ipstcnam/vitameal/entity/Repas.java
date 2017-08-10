package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
@Table(name="repas")
public class Repas implements Serializable {
	private static final long serialVersionUID = 915272151586418923L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int repasID;
	private int typeRepas;

	public Repas() {
		// Constructeur par defaut
	}

	public int getRepasID() {
		return repasID;
	}

	public void setRepasID(int id) {
		repasID = id;
	}

	public int getTypeRepas() {
		return typeRepas;
	}

	public void setTypeRepas(int unTypeRepas) {
		typeRepas = unTypeRepas;
	}
}
