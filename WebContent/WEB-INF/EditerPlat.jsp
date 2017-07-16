<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vitameal</title>
<link rel="stylesheet" type="text/css" href="css/Vitameal.css">
<script src="webjars/jquery/3.2.1/jquery.js"></script>


<script type="text/javascript">
	function addIngredient() {
		var response;
		$.ajax({
			type : "GET",
			url : "Plats?ajax=ajoutLigneIngredient",
			async : false,
			success : function(text) {
				response = text;
			}
		});
		$('#composantPlatFieldSet').append(response);
	}
	function deleteIngredient() {
		$('#composantPlatFieldSet div').last().remove();
	}
</script>

</head>
<body>
	<jsp:include page="/WEB-INF/Fragments/Header.jsp" />
	<jsp:include page="/WEB-INF/Fragments/Navigation.jsp" />

	<section>
		<c:if test="${param.action == 'creer'}">
			<h1>Crée un nouveau plats</h1>
		</c:if>
		<c:if test="${param.action == 'editer'}">
			<h1>Editer le plat ${plat.nom}</h1>
		</c:if>

		<form method="post" action="/VitApp/Plats">
			<input name="action" value="${param.action}" type="hidden">
			<input name="p_idPlat" value="${plat.id}"  type="hidden">
			<label for="nomPlat">Nom du nouveau plat:</label>
			<input type="text" id="nomPlat" name="p_nomPlat" value="${plat.nom}" required /> <br>
			<fieldset id="composantPlatFieldSet">
				<c:if test="${param.action == 'creer'}">
					<jsp:include page="/WEB-INF/Fragments/selectionIngredient.jsp" />
				</c:if>
				<c:if test="${param.action == 'editer'}">
					<c:forEach var="composantPlat" items="${composantsPlat}">
						<c:set var="composantPlat" value="${composantPlat}" scope="request"/>
						<c:import url="/WEB-INF/Fragments/selectionIngredient.jsp"/>
					</c:forEach>
				</c:if>
			</fieldset>
			<input type="button" value="Ajouter un ingredient" onclick="addIngredient()">
			<input type="button" value="Supprimer un ingredient" onclick="deleteIngredient()">
			
<!-- 		TODO Frequence de service -->
			
			<br>
			<input type="submit" value="Valider">
		</form>
	</section>
</body>

</html>