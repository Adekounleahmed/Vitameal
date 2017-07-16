package com.ipstcnam.vitameal.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-16T17:25:31.245+0200")
@StaticMetamodel(Ingredient.class)
public class Ingredient_ {
	public static volatile SingularAttribute<Ingredient, Integer> id;
	public static volatile SingularAttribute<Ingredient, String> nom;
	public static volatile CollectionAttribute<Ingredient, ComposantPlat> composantPlats;
	public static volatile SingularAttribute<Ingredient, Famille> famille;
	public static volatile SingularAttribute<Ingredient, Forme> forme;
	public static volatile SingularAttribute<Ingredient, Texture> texture;
}
