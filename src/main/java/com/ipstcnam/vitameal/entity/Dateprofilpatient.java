package com.ipstcnam.vitameal.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.ipstcnam.vitameal.entity.pk.DateprofilpatientPK;

import java.util.Date;


/**
 * The persistent class for the DATEPROFILPATIENT database table.
 * 
 */
@Entity
@NamedQuery(name="Dateprofilpatient.findAll", query="SELECT d FROM Dateprofilpatient d")
public class Dateprofilpatient implements Serializable {
	private static final long serialVersionUID = 8453298656809586828L;

	@EmbeddedId
	private DateprofilpatientPK id;

	@Temporal(TemporalType.DATE)
	private Date dateProfil;
	@Temporal(TemporalType.DATE)
	private Date dateValidation;
	@MapsId("contrainteID")
	@ManyToOne
	private Contrainte contrainte;
	@MapsId("dieteticienID")
	@ManyToOne
	private Dieteticien dieteticien;
	@MapsId("medecinID")
	@ManyToOne
	private Medecin medecin;
	@MapsId("patientID")
	@ManyToOne
	private Patient patient;

	public DateprofilpatientPK getId() {
		return this.id;
	}

	public void setId(DateprofilpatientPK id) {
		this.id = id;
	}

	public Date getDateProfil() {
		return this.dateProfil;
	}

	public void setDateProfil(Date dateprofil) {
		this.dateProfil = dateprofil;
	}

	public Date getDateValidation() {
		return this.dateValidation;
	}

	public void setDateValidation(Date datevalidation) {
		this.dateValidation = datevalidation;
	}

	public Contrainte getContrainte() {
		return contrainte;
	}

	public void setContrainte(Contrainte contrainte) {
		this.contrainte = contrainte;
	}

	public Dieteticien getDieteticien() {
		return dieteticien;
	}

	public void setDieteticien(Dieteticien dieteticien) {
		this.dieteticien = dieteticien;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
