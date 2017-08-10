package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

import com.ipstcnam.vitameal.beans.enums.MinMax;

/**
 * Cette classe représente un plat utilisé dans les repas.
 * 
 * @author Nicolas Symphorien
 */
@Entity
public class Plat implements Serializable {
	private static final long serialVersionUID = -8641846010466974430L;

	private String categorie;
	@Enumerated(EnumType.STRING)
	private MinMax minMax;
	private Integer nombreService;
	private String nom;
	private Integer periode;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer platID;
	@ManyToMany
	@JoinTable(name="Constituer",
		joinColumns=@JoinColumn(name="platID", foreignKey=@ForeignKey(name="FK_Plat_Constituer"), nullable=false),
		inverseJoinColumns=@JoinColumn(name="repasID", foreignKey=@ForeignKey(name="FK_Repas_Constituer"), nullable=false))
	private List<Repas> constitue;

	@OneToMany(mappedBy = "plat")
	private Collection<ComposantPlat> composantPlats;

	public Integer getPlatID() {
		return platID;
	}

	public void setPlatID(Integer id) {
		this.platID = id;
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
		return minMax == MinMax.Max;
	}

	public MinMax getMinMax() {
		return minMax;
	}

	public void setMinMax(MinMax maximum) {
		minMax = maximum;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String uneCategorie) {
		categorie = uneCategorie;
	}

	public List<Repas> getConstitue() {
		return constitue;
	}

	public void setConstitue(List<Repas> desRepas) {
		constitue = desRepas;
	}
}
