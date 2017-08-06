package com.ipstcnam.vitameal.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateful;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipstcnam.vitameal.dao.GroupePatientsDAO;
import com.ipstcnam.vitameal.dao.MenuDAO;
import com.ipstcnam.vitameal.dao.PlatDao;
import com.ipstcnam.vitameal.entity.GroupePatients;
import com.ipstcnam.vitameal.entity.Menu;
import com.ipstcnam.vitameal.entity.Plat;

/**
 * @version 1.0
 * @created 09-juil.-2017 11:03:39
 */
@Stateful
public class ElaborationMenus {

	private MenuDAO menus;
	private PlatDao plats;
	private Menu menuElabore;
    private static final Logger logger = LogManager.getLogger(MenuDAO.class);

	public ElaborationMenus(){
		menus = new MenuDAO();
		plats = new PlatDao();
		menuElabore = new Menu();
	}
	
	public Menu elaborerMenu(GroupePatients leGroupePatients, Date laDate, int leMenu) {
		List<Plat> lesPlats = plats.findAll();
		logger.info("GP : " + leGroupePatients.getNom() + " Date : " + laDate + " Menu : " + leMenu);
		return menuElabore;
	}

	public List<GroupePatients> getGroupesPatients() {
		GroupePatientsDAO gpDAO = new GroupePatientsDAO(); 
		return gpDAO.groupesPatients();
	}
}