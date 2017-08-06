package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
public class Formes implements Serializable {
	private static final long serialVersionUID = 310033201334184283L;
	/**
	 * Liquide
	 * Solide
	 * Gélifiée
	 */
	@Id
	private String forme;

	public Formes(){
		forme = "";
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}
}