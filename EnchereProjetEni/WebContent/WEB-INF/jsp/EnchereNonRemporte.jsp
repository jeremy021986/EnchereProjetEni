<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <title>Accueil Enchères</title>
</head>

<body>
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
              <a class="nav-link" href="PageConnexion">S'inscrire / Se connecter</a>
           </li>
           
         </ul>
      </div>
   </div>
</nav>
<body style="background-color:#F2EEE8;">
<h1> ENI-Encheres</h1>
 <p>Detail vente</p>

 <div class="w3-card-4">
  <img src="150.png" alt="Alps">
  <div class="w3-container w3-center">
    <p>Meuble</p>
  </div>
</div>


 <label for="email">Description : </label>
 <br>
 <label for="email">Meilleur offre : </label>
 <br>
 <label for="email">Mise à prix : </label>
 <br>
 <label for="email">Fin de l'enchère : </label>
 <br>
 <label for="email">Retrait : </label>
 <br>
 <label for="email">Telephone : </label>
 <br>

 
<button type="submit" style="background-color: #8E806A;" >Retrait effectué</button><!-- faire la redirection -->


</body>
</html>