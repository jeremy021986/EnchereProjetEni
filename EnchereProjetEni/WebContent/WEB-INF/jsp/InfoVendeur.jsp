<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Infos Vendeurs</title>
</head>
<body>
<body style="background-color:#F2EEE8;">
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #E4CDA7;">
      <div class="container">
        <a class="navbar-brand" href="PagePrincipale"><img src="logo_enchere.png" height="50" width="90" ></a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <!-- ms-auto = margin-left:auto -->
          <ul class="navbar-nav ms-auto">
           <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="accueil">Accueil</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="#">Profil</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="#">Contact</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="PageConnexion">s'inscrire / se connecter</a>
           </li>
         </ul>
      </div>
   </div>
</nav>
<div class="container my-6 col-6 p-5">
	<h1>ENI-Encheres</h1>


    <h4>Pseudo :</h4>
    <h4>Nom :</h4>
    <h4>Prénom :</h4>
    <h4>Email :</h4>
    <h4>Téléphone :</h4>
    <h4>Rue :</h4>
    <h4>Code Postal :</h4>
    <h4>Ville :</h4>
</div>    
</body>
<footer class="container-fluid p-2 text-white" style="background-color: #E4CDA7;">
	<div class="container text-center">&copy; 2021–2021 copyright</div>
</footer>
</html>