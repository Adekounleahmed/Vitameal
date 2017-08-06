package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
public class Textures implements Serializable {
	private static final long serialVersionUID = 6795878918890786479L;
	/**
	 * Maintenue
	 * Modifiée
	 */
	@Id
	private String texture;

	public Textures(){
		texture = "";
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

}