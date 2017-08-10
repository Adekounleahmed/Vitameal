package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.ipstcnam.vitameal.entity.pk.MenuPK;

import java.util.Date;


/**
 * The persistent class for the MENU database table.
 * 
 */
@Entity
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 701698929486570826L;

	@EmbeddedId
	private MenuPK id;
	@MapsId("repasID")
	@ManyToOne
	private Repas repas;
	@MapsId("groupePatientsID")
	@ManyToOne
	private GroupePatients groupePatients;

	@Temporal(TemporalType.DATE)
	private Date dateMenu;

	public MenuPK getId() {
		return id;
	}

	public void setId(MenuPK id) {
		this.id = id;
	}

	public Date getDateMenu() {
		return dateMenu;
	}

	public void setDateMenu(Date uneDate) {
		dateMenu = uneDate;
	}

	public Repas getRepas() {
		return repas;
	}

	public void setRepas(Repas unRepas) {
		repas = unRepas;
	}

	public GroupePatients getGroupePatients() {
		return groupePatients;
	}

	public void setGroupePatients(GroupePatients unGroupePatients) {
		groupePatients = unGroupePatients;
	}
}
