<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
	<input name="p_idIngredient" value="${composantPlat.ingredient.id}" type="hidden">
	<label for="nomIngredient">Nom :</label>
	<input type="text" id="nomIngredient" name="p_nomIngredient" value="${composantPlat.ingredient.nom}" required>
	
	<label for="quantiteIngredient">Quantité :</label>
	<input type="text" list="${ingredients}" id="quantiteIngredient" name="p_quantiteIngredient" value="${composantPlat.quantite}" required>
	
	<label for="uniteIngredient">Unité :</label>
	<select name="p_uniteIngredient">
		<c:forEach var="uniteIngredientValue" items="${unitesIngredientEnum}">
			<option value="${uniteIngredientValue}"
				<c:if test="${uniteIngredientValue eq composantPlat.unite or uniteIngredientValue eq uniteIngredient}"> selected</c:if>
			>${uniteIngredientValue}</option>
		</c:forEach>
	</select>
	<br>
</div>