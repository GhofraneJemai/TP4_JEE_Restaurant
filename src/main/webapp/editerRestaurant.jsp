<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modification des Produits</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="header.jsp" %>
	<p></p>
	<div class="container">
		<div class="card">
			<div class="card-header">Modification des Produits</div>
			<div class="card-body">
				<form action="update.do" method="post">
				    <input type="hidden" name="id" value="${restaurant.idRestaurant}" />
				    
				    <div class="mb-3">
                        <label class="form-label">Nom du Restaurant :</label>
                        <input type="text" name="nomRestaurant" class="form-control" value="${restaurant.nomRestaurant}" required />
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Type de Cuisine :</label>
                        <input type="text" name="typeCuisine" class="form-control" value="${restaurant.typeCuisine}" required />
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Adresse :</label>
                        <input type="text" name="adresse" class="form-control" value="${restaurant.adresse}" required />
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Note :</label>
                        <input type="number" name="note" class="form-control" value="${restaurant.note}" step="0.1" min="0" max="5" required />
                    </div>
                    
                    <div>
                        <button type="submit" class="btn btn-primary">Modifier</button>
                    </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
