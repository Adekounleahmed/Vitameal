package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * Crustacès
 * Fruits à coque
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
public class Familles implements Serializable {
	private static final long serialVersionUID = -4249784159307216186L;
	@Id
	private String famille;

	public Familles(){
		famille = "";
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

}