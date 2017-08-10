package com.ipstcnam.vitameal.entity;

import com.ipstcnam.vitameal.beans.enums.UniteIngredient;
import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-14T16:00:25.624+0200")
@StaticMetamodel(ComposantPlat.class)
public class ComposantPlat_ {
	public static volatile SingularAttribute<ComposantPlat, ComposantPlatPK> pk;
	public static volatile SingularAttribute<ComposantPlat, Plat> plat;
	public static volatile SingularAttribute<ComposantPlat, Aliment> aliment;
	public static volatile SingularAttribute<ComposantPlat, Float> quantite;
	public static volatile SingularAttribute<ComposantPlat, UniteIngredient> unite;
}
