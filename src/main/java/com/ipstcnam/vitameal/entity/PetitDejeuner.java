package com.ipstcnam.vitameal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:12:01
 */
@Entity
public class PetitDejeuner extends Menu {
	private static final long serialVersionUID = -761674093631213169L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int petitDejeunerID;

	public PetitDejeuner(){
		super();
	}
}