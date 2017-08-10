package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.ipstcnam.vitameal.beans.enums.UniteIngredient;
import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK;

/**
 * <p>
 * Cette classe représente un composant d'un plat. Elle correspond à une
 * association entre un plat et un aliment et donne la quantité en une unité
 * de mesure de cet aliment dans le plat.
 * </p>
 * <p>
 * L'identifiant de cette entité une clé composite entre un plat et un
 * aliment ({@link ComposantPlatPK}).
 * </p>
 * 
 * @see Aliment
 * @see Plat
 * 
 * @author Nicolas Symphorien
 */
@Entity
public class ComposantPlat implements Serializable {

	private static final long serialVersionUID = 5909069262091283363L;

	@EmbeddedId
	private ComposantPlatPK pk = new ComposantPlatPK();

	@MapsId("platID")
	@ManyToOne
	private Plat plat;

	@MapsId("alimentID")
	@ManyToOne
	private Aliment aliment;

	private float quantite;

	@Enumerated(EnumType.ORDINAL)
	private UniteIngredient unite;

	public ComposantPlatPK getPk() {
		return pk;
	}

	public void setPk(ComposantPlatPK pk) {
		this.pk = pk;
	}

	public float getQuantite() {
		return quantite;
	}

	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}

	public UniteIngredient getUnite() {
		return unite;
	}

	public void setUnite(UniteIngredient unite) {
		this.unite = unite;
	}

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public Aliment getIngredient() {
		return aliment;
	}

	public void setIngredient(Aliment aliment) {
		this.aliment = aliment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
		ComposantPlat other = (ComposantPlat) obj;
		if (pk == null) {
			if (other.pk != null)
				return false;
		} else if (!pk.equals(other.pk))
			return false;
		return true;
	}

}
