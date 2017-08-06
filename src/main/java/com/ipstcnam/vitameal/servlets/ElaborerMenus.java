package com.ipstcnam.vitameal.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.forms.ElaborerMenusForm;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:03:39
 */
public class ElaborerMenus extends HttpServlet {
	private static final long serialVersionUID = 733589360084690633L;
	private static final String VUE = "/WEB-INF/ElaborerMenusVue.jsp";
    private static final Logger logger = LogManager.getLogger(ElaborerMenus.class);

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext currentContext = this.getServletContext();
		try {
			currentContext.getRequestDispatcher(VUE).forward(request, response);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ElaborerMenusForm form = new ElaborerMenusForm();
    	if (form.traiterFormulaire(request)) {
    		logger.info("Traitement du formulaire terminé avec succés.");
    		// TODO: Afficher le menu élaboré pour validation, rejet ou modification.
    	} else {
    		logger.info("Une erreur est survenue lors du traitement du formulaire !");
    		try {
    			doGet(request, response);
    		} catch(Exception e) {
    			logger.error("Erreur lors de l'appel de doGet depuis doPost. " + e.getMessage());
    			logger.error(e);
    		}
    	}
    }
}