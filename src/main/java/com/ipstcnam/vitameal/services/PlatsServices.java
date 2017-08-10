package com.ipstcnam.vitameal.services;

import java.util.List;

import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.entity.Aliment;
import com.ipstcnam.vitameal.entity.Plat;
import com.ipstcnam.vitameal.forms.PlatForm;

public interface PlatsServices {
	public void creerNouveauPlat(PlatForm platForm);
	public void modifierPlat(PlatForm platForm);
	public void supprimerPlat(PlatForm platForm);
	public List<Plat> consulterPlats();
	
	public Plat consulterPlat(Integer idPlat);
	public List<ComposantPlat> consulterComposantsPlat(Integer idPlat);
	public List<Aliment> consulterIngredientsPlat(Integer idPlat);
	public List<Aliment> consulterIngredients();
}
