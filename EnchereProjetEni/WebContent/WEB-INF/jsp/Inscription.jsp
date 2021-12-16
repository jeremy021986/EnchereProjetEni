<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Inscription</title>
</head>
<body>
<body style="background-color:#F2EEE8;">
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #E4CDA7;">
      <div class="container">
        <a class="navbar-brand" href="#">Les objets sont nos amis</a>
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
             <li class="nav-item"><a class="nav-link"
                        href="PublicationVente">Enchères</a></li>
           <li class="nav-item">
              <a class="nav-link" href="PageConnexion">S'inscrire / Se connecter</a>
           </li>
         </ul>
      </div>
   </div>
</nav>

<div class="container-fluid">
<div class="container">
<h1> ENI-Encheres</h1>
	<p>Mon Profil</p>
<div class="row">
	
	
	<form method="post" action="./PageInscription">



	<div class="container-fluid">
	<div class="row">
	  	<div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	      <label for="inputPseudo">Pseudo:</label>
	      <input type="text" class="form-control" id="creaPseudo" name="creaPseudo" placeholder="Pseudo" required>
	    </div>
	    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	      <label for="inputNom">Nom:</label>
	      <input type="text" class="form-control" id="creaNom" name="creaNom" placeholder="Dupond" required>
	    </div>
	    </div>
    </div>
  
  <br>

  <div class="container-fluid">
  <div class="row">
    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
      <label for="inputPrenom">Prénom:</label>
      <input type="text" class="form-control" id="creaPrenom" name="creaPrenom" placeholder="Camille" required>
    </div>
    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
      <label for="inputEmail">Email:</label>
      <input type="email" class="form-control" id="creaEmail" name="creaEmail" placeholder="exemple@outlook.fr" required>
    </div>
    </div>
  </div>
  
  <br>

  <div class="container-fluid">
  <div class="row">
    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
      <label for="inputTelephone">Telephone:</label>
      <input type="tel" class="form-control" id="creaTel" name="creaTel" placeholder="0623637303" required>
    </div>
    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
      <label for="inputRue">Rue:</label>
      <input type="text" class="form-control" id="creaRue" name="creaRue" placeholder="9 Rue Gambetta" required>
    </div>
    </div>
  </div>
  
  <br>

  <div class="container-fluid">
  <div class="row">
	    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	      <label for="inputCP">Code postal:</label>
	      <input type="number" class="form-control" id="creaCP" name="creaCP" placeholder="44000" required>
	    </div>
	    <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	      <label for="inputVille">Ville:</label>
	      <input type="text" class="form-control" id="creaVille" name="creaVille" placeholder="Nantes" required>
	    </div>
	    </div>
  </div>
  
  <br>
   
  <div class="container-fluid">
  <div class="row">
	  <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	    <label for="inputPassword">Mot de passe:</label>
	    <input type="password" class="form-control" id="creaMdp" name="creaMdp" placeholder="8 caractères minimum" minlength="8" required>
	  </div>
	  
	  <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	    <label for="inputPassword2">Confirmation:</label>
	    <input type="text" class="form-control" id="confirmMdp" name="confirmMdp" placeholder="8 caractères minimum" minlength="8" required>
	  </div>
	  </div>
  </div>
  
  

  <div class="container-fluid">
  <div class="row">
	  <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
	   	<button type="submit" class="btn btn-dark" style="background-color: #8E806A;">Créer</button>
	  </div>
	  
	  </div>
  </div>
 <br>
 </form>
 
	    <a href="./accueil"><button type="submit" class="btn btn-dark" style="background-color: #8E806A;">Annuler</button></a>
	  
 </div>
 </div>
 </div>
 <br>
 <br>
<br>
</body>
<footer class="container-fluid p-2 text-white" style="background-color: #E4CDA7;">
      <div class="container text-center">&copy; 2021–2021 copyright</div>
 </footer>
 </html>