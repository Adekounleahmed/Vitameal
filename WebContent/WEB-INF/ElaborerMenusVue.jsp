<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vitameal</title>
<link rel="stylesheet" type="text/css" href="css/Vitameal.css">
</head>
<body>
	<jsp:include page="/WEB-INF/Fragments/Header.jsp"/>
	<jsp:include page="/WEB-INF/Fragments/Navigation.jsp"/>
	<jsp:useBean id="ElaborationMenus" scope="session" class="com.ipstcnam.vitameal.beans.ElaborationMenus" />
	<section>
		<h1>Élaboration des menus</h1>
		<form method="post" action="ElaborerMenus">
			<fieldset>
				<legend>Groupe de patients</legend>
				<select name="p_groupe_patient">
					<c:forEach var="gp" items="${ElaborationMenus.getGroupesPatients()}" varStatus="vs">
						<option value="${gp.getGroupePatientsID()}">${gp.getNom()}</option>
					</c:forEach>
				</select>
			</fieldset>
			<fieldset>
				<legend>Menus</legend>
				<label for="date">Date :</label><input type="date" name="p_date" id="date" placeholder="jj/mm/aaaa" maxlength="10" required><br>
				<input type="checkbox" name="p_petit_dejeuner"> Petit déjeuner<br>
				<input type="checkbox" name="p_dejeuner"> Déjeuner<br>
				<input type="checkbox" name="p_diner"> Diner<br>
			</fieldset>
			<input type="submit" value="Valider">
		</form>
	</section>
</body>
</html>