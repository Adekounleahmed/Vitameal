package com.ipstcnam.vitameal.entity.pk;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DATEPROFILPATIENT database table.
 * 
 */
@Embeddable
public class DateprofilpatientPK implements Serializable {
	private static final long serialVersionUID = -7952852880953068373L;

	@Column(insertable=false, updatable=false)
	private long contrainteID;

	@Column(insertable=false, updatable=false)
	private long dieteticienID;

	@Column(insertable=false, updatable=false)
	private long medecinID;

	@Column(insertable=false, updatable=false)
	private long patientID;

	public long getContrainteID() {
		return this.contrainteID;
	}
	public void setContrainteID(long contrainteid) {
		this.contrainteID = contrainteid;
	}
	public long getDieteticienID() {
		return this.dieteticienID;
	}
	public void setDieteticienID(long dieteticienid) {
		this.dieteticienID = dieteticienid;
	}
	public long getMedecinID() {
		return this.medecinID;
	}
	public void setMedecinID(long medecinid) {
		this.medecinID = medecinid;
	}
	public long getPatientID() {
		return this.patientID;
	}
	public void setPatientID(long patientid) {
		this.patientID = patientid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DateprofilpatientPK)) {
			return false;
		}
		DateprofilpatientPK castOther = (DateprofilpatientPK)other;
		return 
			(this.contrainteID == castOther.contrainteID)
			&& (this.dieteticienID == castOther.dieteticienID)
			&& (this.medecinID == castOther.medecinID)
			&& (this.patientID == castOther.patientID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.contrainteID ^ (this.contrainteID >>> 32)));
		hash = hash * prime + ((int) (this.dieteticienID ^ (this.dieteticienID >>> 32)));
		hash = hash * prime + ((int) (this.medecinID ^ (this.medecinID >>> 32)));
		hash = hash * prime + ((int) (this.patientID ^ (this.patientID >>> 32)));
		
		return hash;
	}
}