<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Recherche des Restaurants</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
    <%@ include file="header.jsp" %>
    <div class="container mt-4">
        <div class="card">
            <div class="card-header">Recherche des Restaurants</div>
            <div class="card-body">
                <form action="chercher.do" method="get" class="mb-3">
                    <label for="motCle">Mot Clé :</label>
                    <input type="text" id="motCle" name="motCle" value="${model.motCle}" class="form-control d-inline-block w-auto">
                    <button type="submit" class="btn btn-primary">Chercher</button>
                </form>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nom</th>
                            <th>Type de Cuisine</th>
                            <th>Adresse</th>
                            <th>Note</th>
                           
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${model.restaurants}" var="r">
                            <tr>
                                <td>${r.idRestaurant}</td>
                                <td>${r.nomRestaurant}</td>
                                <td>${r.typeCuisine}</td>
                                <td>${r.adresse}</td>
                                <td>${r.note}</td>
                                <td><a onclick="return confirm('Êtes-vous sûr ?')" href="supprimer.do?id=${r.idRestaurant}" >Supprimer</a></td>
                                <td><a href="editer.do?id=${r.idRestaurant}">Modifier</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
