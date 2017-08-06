package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class AlimentsBase implements Serializable {
	private static final long serialVersionUID = 8311577336946300310L;
	/**
	 * Blé
	 * Gluten
	 * Sel
	 * Poivre
	 * Arachide
	 * Soja
	 * Lait
	 */
	@Id
	private String alimentBase;

	public AlimentsBase(){
		alimentBase = "";
	}

	public String getAlimentBase() {
		return alimentBase;
	}

	public void setAlimentBase(String alimentBase) {
		this.alimentBase = alimentBase;
	}
}