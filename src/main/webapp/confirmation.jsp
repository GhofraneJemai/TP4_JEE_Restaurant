<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Confirmation Ajout Restaurant</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="header.jsp" %>
	<p></p>
	<div class="container">
		<div class="card">
			<div class="card-header">Confirmation Ajout Restaurant</div>
			<div class="card-body">
				<div class="form-group">
					<label class="control-label">ID du Restaurant :</label> 
					<input type="text" name="idRestaurant" class="form-control" value="${restaurant.idRestaurant}" readonly />
				</div>
				<div class="form-group">
					<label class="control-label">Nom du Restaurant :</label> 
					<input type="text" name="nomRestaurant" class="form-control" value="${restaurant.nomRestaurant}" readonly />
				</div>
				<div class="form-group">
					<label class="control-label">Type de Cuisine :</label> 
					<input type="text" name="typeCuisine" class="form-control" value="${restaurant.typeCuisine}" readonly />
				</div>
				<div class="form-group">
					<label class="control-label">Adresse :</label> 
					<input type="text" name="adresse" class="form-control" value="${restaurant.adresse}" readonly />
				</div>
				<div class="form-group">
					<label class="control-label">Note :</label> 
					<input type="text" name="note" class="form-control" value="${restaurant.note}" readonly />
				</div>
			</div>
		</div>
	</div>
</body>
</html>