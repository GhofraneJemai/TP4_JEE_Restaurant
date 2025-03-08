<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Saisie des Restaurants</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <%@ include file="header.jsp" %>

    <div class="container mt-4">
        <div class="card">
            <div class="card-header">Saisie des Restaurants</div>
            <div class="card-body">
                <form action="save.do" method="post">
                    <input type="hidden" name="idRestaurant" value="${restaurant.idRestaurant}" />
                    
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

                    <button type="submit"class="btn btn-primary">Ajouter</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
