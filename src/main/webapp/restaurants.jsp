<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="header.jsp" %>
<p></p>
<div class="container">
	<div class="card">
		<div class="card-header">Recherche des Restaurants</div>
		<div class="card-body">
			<form action="chercher.do" method="get">
				<label>Mot Clé</label> 
				<input type="text" name="motCle" value="${model.motCle}" />
				<button type="submit" class="btn btn-primary">Chercher</button>
			</form>
			<table class="table table-striped">
				<tr>
					<th>ID</th>
					<th>Nom Restaurant</th>
					<th>Type de Cuisine</th>
					<th>Adresse</th>
				</tr>
				<c:forEach items="${model.restaurants}" var="r">
					<tr>
						<td>${r.idRestaurant}</td>
						<td>${r.nomRestaurant}</td>
						<td>${r.typeCuisine}</td>
						<td>${r.adresse}</td>
						<td><a onclick="return confirm('Êtes-vous sûr ?')" href="supprimer.do?id=${r.idRestaurant}">Supprimer</a></td>
						<td><a href="editer.do?id=${r.idRestaurant}">Modifier</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
</body>
</html>
