<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Vitameal</title>
	<link rel="stylesheet" type="text/css" href="css/Vitameal.css">
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script src="webjars/jquery/3.2.1/jquery.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	
	<script type="text/javascript">
	function supprimerPlat(idPlat) {
		var response;
		$.ajax({
			type : "GET",
			url : "Plats?ajax=supprimerPlat&id=" + idPlat,
			async : false,
			success : function(text) {
				response = text;
			}
		});
		$('#dialog-modal').append(response).dialog({
				modal: true,
			  close: function( event, ui ) {$('#dialog-modal div').remove()}
		});
	}
	</script>
</head>

<body>
	<jsp:include page="/WEB-INF/Fragments/Header.jsp" />
	<jsp:include page="/WEB-INF/Fragments/Navigation.jsp" />
	
	<section>
		<h1>Plats</h1>
		<table>
			<c:forEach var="plat" items="${plats}">
				<tr>
					<td>${plat.nom}</td>
					<td>${plat.id}</td>
					<td>
					
					<c:url var="urlEditerPlat" value="Plats">
						<c:param name="action" value="editer" />
						<c:param name="id" value="${plat.id}" />
					</c:url>
					<a href="${urlEditerPlat}">Editer</a></td>
					
					<td><input value="Supprimer" onclick="supprimerPlat('${plat.id}')" type="button"></td>
				</tr>
			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath}/Plats?action=creer">Créer un nouveau plat</a>
	</section>
	
	
	<div id="dialog-modal" title="Comfirmation suppression"></div>
</body>
</html>