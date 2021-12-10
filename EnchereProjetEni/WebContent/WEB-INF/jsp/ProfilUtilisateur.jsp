<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.List" %>
<%@ page import="fr.eni.enchere.bo.Utilisateur" %>    
<%@ page import="java.time.format.FormatStyle" %> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1> ENI-Encheres</h1>

    <h4>Pseudo :</h4><c:out value="${sessionScope.pseudo}"/><br>
  	<h4> Nom :</h4><c:out value="${requestScope.nom}"/><br>
    <h4>Prénom :</h4><c:out value="${requestScope.prenom}"/><br>
    <h4>Email :</h4><c:out value="${requestScope.email}"/><br>
    <h4>Téléphone :</h4><c:out value="${requestScope.tel}"/><br>
    <h4>Rue :</h4><c:out value="${requestScope.rue}"/><br>
    <h4>Code Postal :</h4><c:out value="${requestScope.cp}"/><br>
    <h4>Ville :</h4><c:out value="${requestScope.ville}"/><br>
    
 
    <a href="./ModifProfilUtilisateur"><button type="button"
					class="btn btn-primary btn-block">Modifier mon profil</button></a> <br />

	<a href="./PagePrincipale"><button type="button"
					class="btn btn-primary btn-block">Retour</button></a>
</body>
</html>

