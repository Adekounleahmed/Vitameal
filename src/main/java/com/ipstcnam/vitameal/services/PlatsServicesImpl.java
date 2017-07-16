package com.ipstcnam.vitameal.services;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;

import com.ipstcnam.vitameal.dao.ComposantPlatDao;
import com.ipstcnam.vitameal.dao.IngredientDao;
import com.ipstcnam.vitameal.dao.PlatDao;
import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.entity.Ingredient;
import com.ipstcnam.vitameal.entity.Plat;
import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK;
import com.ipstcnam.vitameal.forms.LigneIngredient;
import com.ipstcnam.vitameal.forms.PlatForm;
import com.ipstcnam.vitameal.listeners.ApplicationListener;

@Stateful
public class PlatsServicesImpl implements PlatsServices {
	
	private PlatDao platDao;
	private ComposantPlatDao composantPlatDao;
	private IngredientDao ingredientDao;
	
	private EntityManager em = ApplicationListener.getEmf().createEntityManager();
	
	public PlatsServicesImpl() {
		platDao = new PlatDao(em);
		composantPlatDao = new ComposantPlatDao(em);
		ingredientDao = new IngredientDao(em);
	}
	
	@Override
	public void creerNouveauPlat(PlatForm platForm) {
		Plat plat = new Plat();
		plat.setNom(platForm.getNomPlat());
		platDao.create(plat);
		
		for (int i = 0; i < platForm.numberOfLigneIngredient(); i++) {
			LigneIngredient ligneIngredient = platForm.getLigneIngredients(i);
			
			Ingredient ingredient = new Ingredient();
			ingredient.setNom(ligneIngredient.getNomIngredient());
			ingredientDao.creer(ingredient);
			
			ComposantPlat composantPlat = new ComposantPlat();
			composantPlat.setPlat(plat);
			composantPlat.setIngredient(ingredient);
			composantPlat.setQuantite(ligneIngredient.getQuantiteIngredient());
			composantPlat.setUnite(ligneIngredient.getUniteIngredient());
			composantPlatDao.creer(composantPlat);
		}		
	}

	@Override
	public void modifierPlat(PlatForm platForm) {
		for (ComposantPlat composantPlat : composantPlatDao.findByPlatId(platForm.getIdPlat())) {
			Integer idIngredient = composantPlat.getIngredient().getId();
			if (!platForm.contain(idIngredient)) {
				composantPlatDao.delete(composantPlat);
			}
		}
		
		Plat plat = platDao.findById(platForm.getIdPlat());		
		
		if (!plat.getNom().equals(platForm.getNomPlat())) {
			plat.setNom(platForm.getNomPlat());
			platDao.update(plat);
		}
		
		for (int i = 0; i < platForm.numberOfLigneIngredient(); i++) {
			LigneIngredient ligneIngredient = platForm.getLigneIngredients(i);
			
			if (ligneIngredient.getIdIngredient() != null) {
				Ingredient ingredient = ingredientDao.findById(ligneIngredient.getIdIngredient());
				if (!ingredient.getNom().equals(ligneIngredient.getNomIngredient())) {
					ingredient.setNom(ligneIngredient.getNomIngredient());
					ingredientDao.update(ingredient);
				}
				
				ComposantPlatPK composantPlatPK = new ComposantPlatPK();
				composantPlatPK.setIngredientId(ingredient.getId());
				composantPlatPK.setPlatId(plat.getId());
				ComposantPlat composantPlat = composantPlatDao.findByPk(composantPlatPK);
				
				if (composantPlat.getQuantite() != ligneIngredient.getQuantiteIngredient()) {
					composantPlat.setQuantite(ligneIngredient.getQuantiteIngredient());
					composantPlatDao.update(composantPlat);
				}
				if (composantPlat.getUnite() != ligneIngredient.getUniteIngredient()) {
					composantPlat.setUnite(ligneIngredient.getUniteIngredient());
					composantPlatDao.update(composantPlat);
				}
				
			} else {
				Ingredient ingredient = new Ingredient();
				ingredient.setNom(ligneIngredient.getNomIngredient());
				ingredientDao.creer(ingredient);
				
				ComposantPlat composantPlat = new ComposantPlat();
				composantPlat.setPlat(plat);
				composantPlat.setIngredient(ingredient);
				composantPlat.setQuantite(ligneIngredient.getQuantiteIngredient());
				composantPlat.setUnite(ligneIngredient.getUniteIngredient());
				composantPlatDao.creer(composantPlat);
			}

		}
		
		
		
	}

	@Override
	public void supprimerPlat(PlatForm platForm) {
		for (ComposantPlat composantPlat : composantPlatDao.findByPlatId(platForm.getIdPlat())) {
				composantPlatDao.delete(composantPlat);
		}
		
		Plat plat = platDao.findById(platForm.getIdPlat());
		platDao.delete(plat);
	}

	@Override
	public List<Plat> consulterPlats() {
		return platDao.findAll();
	}

	@Override
	public Plat consulterPlat(Integer idPlat) {
		return platDao.findById(idPlat);
	}

	@Override
	public List<ComposantPlat> consulterComposantsPlat(Integer idPlat) {
		return composantPlatDao.findByPlatId(idPlat);
	}

	@Override
	public List<Ingredient> consulterIngredientsPlat(Integer idPlat) {
		return null; //TODO
	}

	@Override
	public List<Ingredient> consulterIngredients() {
		return ingredientDao.findAll();
	}

}
