package com.ipstcnam.vitameal.beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-11T20:07:14.522+0200")
@StaticMetamodel(ProfilPatient.class)
public class ProfilPatient_ {
	public static volatile SingularAttribute<ProfilPatient, Long> idPatient;
	public static volatile SingularAttribute<ProfilPatient, String> prenom;
	public static volatile SingularAttribute<ProfilPatient, String> nom;
	public static volatile SingularAttribute<ProfilPatient, Boolean> sexe;
	public static volatile SingularAttribute<ProfilPatient, Integer> age;
	public static volatile SingularAttribute<ProfilPatient, Integer> poids;
	public static volatile SingularAttribute<ProfilPatient, Integer> taille;
	public static volatile SingularAttribute<ProfilPatient, String> allergies;
	public static volatile SingularAttribute<ProfilPatient, String> contreIndications;
	public static volatile SingularAttribute<ProfilPatient, Boolean> diabete;
	public static volatile SingularAttribute<ProfilPatient, Boolean> colesterol;
	public static volatile SingularAttribute<ProfilPatient, Boolean> hypertension;
}
