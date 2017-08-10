package com.ipstcnam.vitameal.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-16T17:25:31.245+0200")
@StaticMetamodel(Aliment.class)
public class Aliment_ {
	public static volatile SingularAttribute<Aliment, Integer> alimentID;
	public static volatile SingularAttribute<Aliment, String> nom;
	public static volatile CollectionAttribute<Aliment, ComposantPlat> composantPlats;
	public static volatile SingularAttribute<Aliment, Famille> famille;
	public static volatile SingularAttribute<Aliment, Forme> forme;
	public static volatile SingularAttribute<Aliment, Texture> texture;
}
