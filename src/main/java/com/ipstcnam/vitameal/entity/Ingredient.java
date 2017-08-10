package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @version 1.0
 * @created 09-août.-2017 09:33:00
 */
@Entity
public class Ingredient implements Serializable {
	private static final long serialVersionUID = 8311577336946300310L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String nom;
	@ManyToMany
	@JoinTable(name="IngredientCompose",
		joinColumns={@JoinColumn(name="ingredientID", referencedColumnName="id", foreignKey=@ForeignKey(name="FK_Ing_IngredientCompose"), nullable=false)},
		inverseJoinColumns={@JoinColumn(name="alimentID", foreignKey=@ForeignKey(name="FK_Aliment_IngredientCompose"), nullable=false)})
	private List<Aliment> compose;
	@ManyToMany
	@JoinTable(name="IngredientConstitue",
		joinColumns={@JoinColumn(name="ingredientID", referencedColumnName="id", foreignKey=@ForeignKey(name="FK_Ingredient_Constitue"), nullable=false)},
		inverseJoinColumns={@JoinColumn(name="contrainteID", foreignKey=@ForeignKey(name="FK_Contraint_IngConstitue"), nullable=false)})
	private List<Contrainte> etablit;

	public Ingredient(){
		nom = "";
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer unId) {
		id = unId;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Aliment> getCompose() {
		return compose;
	}

	public void setCompose(List<Aliment> desAliments) {
		compose = desAliments;
	}

	public List<Contrainte> getEtablit() {
		return etablit;
	}

	public void setEtablit(List<Contrainte> desContraintes) {
		etablit = desContraintes;
	}
}