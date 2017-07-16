package com.ipstcnam.vitameal.forms;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ipstcnam.vitameal.beans.enums.ActionPlatEnum;
import com.ipstcnam.vitameal.beans.enums.UniteIngredient;
import com.ipstcnam.vitameal.forms.exception.MalformedFormException;

public class PlatForm {

	private ActionPlatEnum action;
	private Integer idPlat;
	private String nomPlat;
	private List<LigneIngredient> ligneIngredients;

	public PlatForm(HttpServletRequest request) throws MalformedFormException {
		this.action = parseActionPlat(request.getParameter("action"));

		this.idPlat = parseInteger(request.getParameter("p_idPlat"));
		this.nomPlat = request.getParameter("p_nomPlat");

		String[] idIngredients = request.getParameterValues("p_idIngredient");
		String[] nomIngredients = request.getParameterValues("p_nomIngredient");
		String[] quantiteIngredients = request.getParameterValues("p_quantiteIngredient");
		String[] uniteIngredients = request.getParameterValues("p_uniteIngredient");
		
		if (!ActionPlatEnum.supprimer.equals(action)) {
			validateIngredientParameter(idIngredients, nomIngredients, quantiteIngredients, uniteIngredients);
	
			this.ligneIngredients = new ArrayList<>();
			for (int i = 0; i < nomIngredients.length; i++) {
				Integer idIngredient = parseInteger(idIngredients[i]);
				String nomIngredient = nomIngredients[i];
				float quantiteIngredient = parseFloat(quantiteIngredients[i]);
				UniteIngredient uniteIngredient = parseUniteIngredient(uniteIngredients[i]);
	
				LigneIngredient ligneIngredient = new LigneIngredient(idIngredient, nomIngredient, quantiteIngredient,
						uniteIngredient);
				this.ligneIngredients.add(ligneIngredient);
			}
		}
	}

	private ActionPlatEnum parseActionPlat(String actionPlatValue) throws MalformedFormException {
		ActionPlatEnum actionPlat = ActionPlatEnum.valueOf(actionPlatValue);
		if (actionPlat == null) {
			throw new MalformedFormException(actionPlatValue + " devrais etre dans l'enum ActionPlatEnum");
		}
		return actionPlat;
	}

	private Integer parseInteger(String string) throws MalformedFormException {
		try {
			if (string.isEmpty()) {
				return null;
			}
			return Integer.parseInt(string);
		} catch (NumberFormatException ex) {
			throw new MalformedFormException(string + " devrais etre un entier", ex);
		}
	}

	private UniteIngredient parseUniteIngredient(String uniteIngredientValue) throws MalformedFormException {
		UniteIngredient uniteIngredient = UniteIngredient.valueOf(uniteIngredientValue);
		if (uniteIngredient == null) {
			throw new MalformedFormException(uniteIngredientValue + " devrais etre dans l'enum UniteIngredient");
		}
		return uniteIngredient;
	}

	private void validateIngredientParameter(String[] idIngredient, String[] nomIngredients,
			String[] quantiteIngredients, String[] uniteIngredients) throws MalformedFormException {
		MalformedFormException exception = new MalformedFormException(
				"Il n'y as pas le bon nombre de parametre pour les ingredient");
		
		if (idIngredient == null || nomIngredients == null || quantiteIngredients == null || uniteIngredients == null) {
			throw exception;
		}
		if (idIngredient.length != nomIngredients.length) {
			throw exception;
		}
		if (nomIngredients.length != quantiteIngredients.length) {
			throw exception;
		}
		if (quantiteIngredients.length != uniteIngredients.length) {
			throw exception;
		}

	}

	private float parseFloat(String string) throws MalformedFormException {
		try {
			return Float.parseFloat(string);
		} catch (NumberFormatException ex) {
			throw new MalformedFormException(string + " devrais etre un flottant", ex);
		}

	}

	public ActionPlatEnum getAction() {
		return action;
	}

	public void setAction(ActionPlatEnum action) {
		this.action = action;
	}

	public Integer getIdPlat() {
		return idPlat;
	}

	public String getNomPlat() {
		return nomPlat;
	}

	public int numberOfLigneIngredient() {
		return ligneIngredients.size();
	}

	public LigneIngredient getLigneIngredients(int index) {
		return ligneIngredients.get(index);
	}

	public boolean contain(Integer idIngredient) {
		for (LigneIngredient ligneIngredient : ligneIngredients) {

			Integer idIngredientLigne = ligneIngredient.getIdIngredient();
			if (idIngredientLigne != null && idIngredientLigne.equals(idIngredient)) {
				return true;
			}
		}
		return false;
	}

}
