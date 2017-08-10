package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.ipstcnam.vitameal.beans.enums.Nature;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class Contrainte implements Serializable {
	private static final long serialVersionUID = -3279023412729822774L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer contrainteID;
	private String nom;
	@Enumerated(EnumType.STRING)
	private Nature nature;
	private Forme forme;
	private Famille famille;
	private Texture texture;
	@ManyToMany(mappedBy="etablit")
	private List<Ingredient> estIssue;
	@ManyToMany
	@JoinTable(name="Affecter",
		joinColumns={@JoinColumn(name="contrainteID", foreignKey=@ForeignKey(name="FK_Contrainte_Affecter"), nullable=false)},
		inverseJoinColumns={@JoinColumn(name="groupePatientsID", foreignKey=@ForeignKey(name="FK_GroupePatients_Affecter"), nullable=false)})
	private List<GroupePatients> affecte;

	public Contrainte() {
		nature = Nature.Ma;
		nom = "";
	}

	public Nature getNature() {
		return nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public Integer getContrainteID() {
		return contrainteID;
	}

	public void setContrainteID(Integer id) {
		contrainteID = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Forme getForme() {
		return forme;
	}

	public void setForme(Forme forme) {
		this.forme = forme;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public List<Ingredient> getEstIssue() {
		return estIssue;
	}

	public void setEstIssue(List<Ingredient> desIngredients) {
		estIssue = desIngredients;
	}

	public List<GroupePatients> getAffecte() {
		return affecte;
	}

	public void setAffecte(List<GroupePatients> desGroupePatients) {
		affecte = desGroupePatients;
	}
}