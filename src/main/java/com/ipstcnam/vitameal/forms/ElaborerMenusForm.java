package com.ipstcnam.vitameal.forms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.beans.ElaborationMenus;
import com.ipstcnam.vitameal.dao.GroupePatientsDAO;
import com.ipstcnam.vitameal.entity.GroupePatients;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:03:39
 */
public class ElaborerMenusForm {
	private static final String CHAMP_GROUPE_PATIENT = "p_groupe_patient";
	private static final String CHAMP_DATE = "p_date";
	private static final String CHAMP_PETIT_DEJEUNER = "p_petit_dejeuner";
	private static final String CHAMP_DEJEUNER = "p_dejeuner";
	private static final String CHAMP_DINER = "p_diner";
    private static final Logger logger = LogManager.getLogger(ElaborerMenusForm.class);

	private ElaborationMenus elaborationMenus;

	public ElaborerMenusForm(){
		elaborationMenus = new ElaborationMenus();
	}

	public boolean traiterFormulaire(HttpServletRequest request) {
		boolean saisieOK;
		String idGroupePatients = request.getParameter(CHAMP_GROUPE_PATIENT);
		GroupePatientsDAO groupesPatients = new GroupePatientsDAO();
		GroupePatients groupePatientsSelectionne = groupesPatients.getGroupePatientsByID(Integer.parseInt(idGroupePatients));
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		Date laDate = null;
		try {
			laDate = df.parse(request.getParameter(CHAMP_DATE));
		} catch(Exception e) {
			logger.error("Erreur sur la date : " + e.getMessage());
			logger.error(e);
		}
		String valParam;
		valParam = request.getParameter(CHAMP_PETIT_DEJEUNER);
		int imenu = 0;
		if ((valParam != null && valParam.trim().length() != 0) && (valParam.equals("on"))) {
			imenu += 1;
		}
		valParam = request.getParameter(CHAMP_DEJEUNER);
		if ((valParam != null && valParam.trim().length() != 0) && (valParam.equals("on"))) {
			imenu += 2;
		}
		valParam = request.getParameter(CHAMP_DINER);
		if ((valParam != null && valParam.trim().length() != 0) && (valParam.equals("on"))) {
			imenu += 4;
		}
		if ((laDate != null) && (imenu != 0)) {
			elaborationMenus.elaborerMenu(groupePatientsSelectionne, laDate, imenu);
			saisieOK = true;
		} else {
			saisieOK = false;
		}
		return saisieOK;
	}
}