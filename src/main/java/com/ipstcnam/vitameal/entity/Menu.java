package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
@Table(name="menus")
public class Menu implements Serializable {
	private static final long serialVersionUID = 915272151586418923L;
	private Date date;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int menuID;
	//private List<Plat> estConstitue;
	private GroupePatients estConsommeParGroupePatient;

	public Menu() {
		// Constructeur par defaut
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public GroupePatients getEstConsommeParGroupePatient() {
		return estConsommeParGroupePatient;
	}

	public void setEstConsommeParGroupePatient(GroupePatients estConsommeParGroupePatient) {
		this.estConsommeParGroupePatient = estConsommeParGroupePatient;
	}
/*
	public List<Plat> getEstConstitue() {
		return estConstitue;
	}

	public void setEstConstitue(List<Plat> estConstitue) {
		this.estConstitue = estConstitue;
	}
*/
}