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
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
      
    <title>Document</title>
</head>
<body style="background-color:rgba(237, 253, 239);">

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
        <div class="container">
            <a class="navbar-brand" href="#">Les objets sont nos amis</a>
            <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <!-- ms-auto = margin-left:auto -->
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link active"
                        aria-current="page" href="accueil">Accueil</a></li>
                    <li class="nav-item"><a class="nav-link" href="Profil">Profil</a>
                    </li>
                    <li class="nav-item"><a class="nav-link"
                        href="PublicationVente">Enchères</a></li>
                    <li class="nav-item"><a class="nav-link" href="PageConnexion">S'inscrire
                            / Se connecter</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <h1> ENI-Encheres</h1>
  	<h4>Pseudo :</h4><c:out value="${sessionScope.pseudo}"/><br>
  	<h4> Nom :</h4><c:out value="${requestScope.nom}"/><br>
    <h4>Prénom :</h4><c:out value="${requestScope.prenom}"/><br>
    <h4>Email :</h4><c:out value="${requestScope.email}"/><br>
    <h4>Téléphone :</h4><c:out value="${requestScope.tel}"/><br>
    <h4>Rue :</h4><c:out value="${requestScope.rue}"/><br>
    <h4>Code Postal :</h4><c:out value="${requestScope.cp}"/><br>
    <h4>Ville :</h4><c:out value="${requestScope.ville}"/><br>
    
    
    <div class="d-grid  gap-2 d-md-flex justify-content p-4">
    <a href="./ModifProfilUtilisateur"><button type="button"
					class="btn btn-success btn-block">Modifier mon profil</button></a> <br />

	<a href="./PagePrincipale"><button type="button"
					class="btn btn-success btn-block">Retour</button></a></div>
					
					<footer class="container-fluid bg-success p-2 text-white">
      <div class="container text-center">&copy; 2021 copyright</div>
 </footer>
</body>
</html>
