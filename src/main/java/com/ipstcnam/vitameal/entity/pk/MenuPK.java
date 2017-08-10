package com.ipstcnam.vitameal.entity.pk;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MENU database table.
 * 
 */
@Embeddable
public class MenuPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long repasID;

	@Column(insertable=false, updatable=false)
	private long groupePatientsID;

	public MenuPK() {
	}
	public long getRepasID() {
		return this.repasID;
	}
	public void setRepasID(long repasid) {
		this.repasID = repasid;
	}
	public long getGroupePatientsID() {
		return this.groupePatientsID;
	}
	public void setGroupePatientsID(long groupepatientsid) {
		this.groupePatientsID = groupepatientsid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MenuPK)) {
			return false;
		}
		MenuPK castOther = (MenuPK)other;
		return 
			(this.repasID == castOther.repasID)
			&& (this.groupePatientsID == castOther.groupePatientsID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.repasID ^ (this.repasID >>> 32)));
		hash = hash * prime + ((int) (this.groupePatientsID ^ (this.groupePatientsID >>> 32)));
		
		return hash;
	}
}