<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
<form method="post" action="/VitApp/Plats?action=supprimer&id=${plat.id}">
	<label>Supprimer le plat ${plat.id}</label>
	<input name="p_idPlat" value="${plat.id}"  type="hidden">
	<input type="submit" value="Oui" name="doDelete">
	<input type="submit" value="Non" name="doDelete">
</form>
</div>

