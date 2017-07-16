package com.ipstcnam.vitameal.entity.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.entity.Ingredient;
import com.ipstcnam.vitameal.entity.Plat;

/**
 * Clé composite de l'entité ComposantPlat entre un ingrédient et un plat.
 * 
 * @see ComposantPlat
 * @see Ingredient
 * @see Plat
 * 
 * @author Nicolas Symphorien
 *
 */
@Embeddable
public class ComposantPlatPK implements Serializable {

	private static final long serialVersionUID = 91100405592885502L;
	
	private Integer platId;
	
	private Integer ingredientId;

	public Integer getPlatId() {
		return platId;
	}

	public void setPlatId(Integer platId) {
		this.platId = platId;
	}

	public Integer getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Integer ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredientId == null) ? 0 : ingredientId.hashCode());
		result = prime * result + ((platId == null) ? 0 : platId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComposantPlatPK other = (ComposantPlatPK) obj;
		if (ingredientId == null) {
			if (other.ingredientId != null)
				return false;
		} else if (!ingredientId.equals(other.ingredientId))
			return false;
		if (platId == null) {
			if (other.platId != null)
				return false;
		} else if (!platId.equals(other.platId))
			return false;
		return true;
	}

}
