package com.ipstcnam.vitameal.forms;

import com.ipstcnam.vitameal.beans.enums.UniteIngredient;

public class LigneIngredient {
	private Integer idIngredient;
	private String nomIngredient;
	private float quantiteIngredient;
	private UniteIngredient uniteIngredient;

	public LigneIngredient(Integer idIngredient, String nomIngredient, float quantiteIngredient,
			UniteIngredient uniteIngredient) {
		this.idIngredient = idIngredient;
		this.nomIngredient = nomIngredient;
		this.quantiteIngredient = quantiteIngredient;
		this.uniteIngredient = uniteIngredient;
	}
	
	public boolean isNewLine() {
		return idIngredient == null;
	}

	public Integer getIdIngredient() {
		return idIngredient;
	}

	public String getNomIngredient() {
		return nomIngredient;
	}

	public float getQuantiteIngredient() {
		return quantiteIngredient;
	}

	public UniteIngredient getUniteIngredient() {
		return uniteIngredient;
	}

}
