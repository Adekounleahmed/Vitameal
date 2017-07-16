package com.ipstcnam.vitameal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.beans.enums.ActionPlatEnum;
import com.ipstcnam.vitameal.beans.enums.UniteIngredient;
import com.ipstcnam.vitameal.dao.IngredientDao;
import com.ipstcnam.vitameal.entity.Plat;
import com.ipstcnam.vitameal.forms.PlatForm;
import com.ipstcnam.vitameal.forms.exception.MalformedFormException;
import com.ipstcnam.vitameal.services.PlatsServices;
import com.ipstcnam.vitameal.services.PlatsServicesImpl;

/**
 * Servlet implementation class Plats
 */
public class PlatsServlet extends HttpServlet {
	private static final Logger logger = LogManager.getLogger(PlatsServlet.class);
	private static final String PLATS_JSP = "/WEB-INF/Plats.jsp";

	private static final long serialVersionUID = 3064447141542860928L;

	private static final String EDITER_PLAT_JSP = "/WEB-INF/EditerPlat.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PlatsServices platsServices = getPlatServiceFromContext(request);

		String action = request.getParameter("action");
		String id = request.getParameter("id");
		String ajax = request.getParameter("ajax");

		if (ajax != null) {
			if ("ajoutLigneIngredient".equals(ajax)) {
				request.setAttribute("unitesIngredientEnum", UniteIngredient.values());
				request.setAttribute("uniteIngredient", UniteIngredient.g);
				request.getRequestDispatcher("/WEB-INF/Fragments/selectionIngredient.jsp").include(request, response);
			}
			if ("supprimerPlat".equals(ajax)) {
				request.setAttribute("plat", platsServices.consulterPlat(Integer.valueOf(id)));
				request.getRequestDispatcher("/WEB-INF/Fragments/popupSupprimerPlat.jsp").include(request, response);
			}
		} else {
			switch (ActionPlatEnum.valueOf(action)) {
			case consulter:
				request.setAttribute("plats", platsServices.consulterPlats());
				getServletContext().getRequestDispatcher(PLATS_JSP).forward(request, response);
				break;
			case creer:
				request.setAttribute("unitesIngredientEnum", UniteIngredient.values());
				request.setAttribute("uniteIngredient", UniteIngredient.g);
				getServletContext().getRequestDispatcher(EDITER_PLAT_JSP).forward(request, response);
				break;
			case editer:
				request.setAttribute("plat", platsServices.consulterPlat(Integer.valueOf(id)));
				request.setAttribute("composantsPlat", platsServices.consulterComposantsPlat(Integer.valueOf(id)));
				request.setAttribute("unitesIngredientEnum", UniteIngredient.values());
				getServletContext().getRequestDispatcher(EDITER_PLAT_JSP).forward(request, response);
				break;

			default:
				break;
			}
		}

	}

	private PlatsServices getPlatServiceFromContext(HttpServletRequest request) {
		PlatsServices platsServices = (PlatsServicesImpl) request.getSession().getAttribute("platsServices");
		if (platsServices == null) {
			platsServices = new PlatsServicesImpl();
			request.getSession().setAttribute("platsServices", platsServices);
		}

		return platsServices;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PlatsServices platsServices = getPlatServiceFromContext(request);

		try {
			PlatForm platForm = new PlatForm(request);
			
			switch (platForm.getAction()) {
			case creer:
				platsServices.creerNouveauPlat(platForm);
				response.sendRedirect("Plats?action=consulter");
				break;
			case editer:
				platsServices.modifierPlat(platForm);
				response.sendRedirect("Plats?action=consulter");
				break;
			case supprimer:
				platsServices.supprimerPlat(platForm);
				response.sendRedirect("Plats?action=consulter");
				break;
			case consulter:
				response.sendRedirect("Plats?action=consulter");
				break;
			default:
				//request.getRequestDispatcher("/WEB-INF/testLoad.html").include(request, response);
				break;
			}
			
		} catch (MalformedFormException ex) {
			try {
				response.sendError(400, ex.getMessage());
				logger.error(ex, ex.getCause());
			} catch (Exception e) {
				logger.error(e, e.getCause());
			}
			
		}

	}

	// private boolean isWelformedAction(String actionRequestParameter) {
	// return actionRequestParameter != null &&
	// ActionPlatEnum.contains(actionRequestParameter);
	// }

	// private PlatsControleur getControleurFromContext(HttpServletRequest
	// request) {
	// PlatsControleur platsControleur = (PlatsControleur)
	// request.getSession().getAttribute("platsControleur");
	// if (platsControleur == null) {
	// platsControleur = new PlatsControleur();
	// request.getSession().setAttribute("platsControleur", platsControleur);
	// }
	//
	// return platsControleur;
	// }

}
