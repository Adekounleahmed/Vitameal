package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Cette classe représente un plat utilisé dans les menus.
 * 
 * @author Nicolas Symphorien
 */
@Entity
public class Plat implements Serializable {

	private static final long serialVersionUID = -8641846010466974430L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String nom;

	private Integer nombreService;

	private Integer periode;

	private boolean maximum;

	@OneToMany(mappedBy = "plat")
	private Collection<ComposantPlat> composantPlats;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<ComposantPlat> getComposantPlats() {
		return composantPlats;
	}

	public void setComposantPlats(Collection<ComposantPlat> composantPlats) {
		this.composantPlats = composantPlats;
	}

	public Integer getNombreService() {
		return nombreService;
	}

	public void setNombreService(Integer nombreService) {
		this.nombreService = nombreService;
	}

	public Integer getPeriode() {
		return periode;
	}

	public void setPeriode(Integer periode) {
		this.periode = periode;
	}

	public boolean isMaximum() {
		return maximum;
	}

	public void setMaximum(boolean maximum) {
		this.maximum = maximum;
	}

}
