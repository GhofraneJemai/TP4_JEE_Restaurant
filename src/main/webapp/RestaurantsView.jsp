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
</head>
<body>
	<form action="controleur" method="post">
		<input type="text" name="motCle" value="${modele.motCle}"> 
		<input type="submit" value="OK">
	</form>
    <table border="1" width="80%">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nom du Restaurant</th>
                <th>Type de Cuisine</th>
                <th>Adresse</th>
                <th>Note</th> <!-- Nouvelle colonne pour la note -->
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${modele.restaurants}" var="r">
                <tr>
                    <td>${r.idRestaurant}</td>
                    <td>${r.nomRestaurant}</td>
                    <td>${r.typeCuisine}</td>
                    <td>${r.adresse}</td>
                    <td>${r.note}</td> <!-- Affichage de la note -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
