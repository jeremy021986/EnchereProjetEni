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
    <title>Accueil Encheres</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
              <a class="nav-link active" aria-current="page" href="accueil">Enchères</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="PublicationVente">Vendre un article</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="Profil">Mon Profil</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="Deconnection">Déconnexion</a>
           </li>
         </ul>
      </div>
   </div>
</nav>

<!--  partie du haut -->
    <div class="container my-5">
      <div class="row">
        <div class="col-7">
          <h1> ENI-Encheres</h1>
        </div>
      </div>
    </div>

    <div class="container">
      <!--
        <div class="row">
            <div class="col-12"></div>
        </div>
        -->
        <h1>Listes des enchères</h1>
      <div class="container m-5">
        Filtres:
        	<div class="row">
        		<div class="col-4"> 
        		<div class="search-box">
		    <input type="text" class="search" placeholder="Le nom de l'article contient"><button type="submit">Rechercher</button>
		<br>
		    
		</div>
<br>
	<label for="pet-select">Catégories</label>
		<select name="pets" id="pet-select">
		    <option value="">Toutes</option>
		    <option value="informatique">Informatique</option>
		    <option value="ameublement">Ameublement</option>
		    <option value="vetement">Vetement</option>
		    <option value="sport&loisirs">Sport & Loisirs</option>
		</select>
	<br>

   <input class="form-check-input" type="radio" name="genre" id="homme" value="homme" />
   <label class="form-check-label" for="homme">Achats</label>
     <br><br>
   <input class="form-check-input" type="checkbox" name="achat[]" id="enchereOuverte" value="enchereOuverte" />
   <label class="form-check-label" for="pomme">enchères ouvertes</label>
	<br><br>
   <input class="form-check-input" type="checkbox" name="achat[]" id="mesEnchere" value="mesEnchere" />
   <label class="form-check-label" for="poire">mes enchères</label>
	<br><br>
   <input class="form-check-input" type="checkbox" name="achat[]" id="enchereRemporte" value="enchereRemporte" />
   <label class="form-check-label" for="kiwi">mes enchères remportées</label>
   <br><br>
   	<br><br>
   <input class="form-check-input" type="radio" name="genre" id="femme" value="femme" />
   <label class="form-check-label" for="femme">Mes ventes</label>
   <br><br>
      <input class="form-check-input" type="checkbox" name="vente[]" id="enchereEnCours" value="enchereEnCours" />
   <label class="form-check-label" for="pomme">enchères en cours</label>
	<br><br>
   <input class="form-check-input" type="checkbox" name="vente[]" id="venteNonDebute" value="venteNonDebute" />
   <label class="form-check-label" for="poire">ventes non débutées</label>
	<br><br>
   <input class="form-check-input" type="checkbox" name="vente[]" id="ventesTermine" value="ventesTermine" />
   <label class="form-check-label" for="kiwi">ventes terminées</label>
      </div>
    </div>


	<div class="container my-5">
      <div class="row">
        <div class="col-4">
          <!-- cards  ici-->
          <div class="card" >
            <img
              src="https://via.placeholder.com/200x80/ccc/444"
              class="card-img-top"
              alt="lorem"
            />
            <div class="card-body">
              <h5 class="card-title">Article n°1</h5>
              <p class="card-text">
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </p>
              <a href="#" class="btn btn-primary">Go to article</a>
            </div>
          </div>
        </div>

        <div class="col-4">
         <!-- cards  ici-->
         <div class="card" >
            <img
              src="https://via.placeholder.com/200x80/ccc/444"
              class="card-img-top"
              alt="lorem"
            />
            <div class="card-body">
              <h5 class="card-title">Article n°2</h5>
              <p class="card-text">
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </p>
              <a href="#" class="btn btn-primary">Go to article</a>
            </div>
          </div>
        </div>

        <div class="col-4">
          <!-- cards  ici-->
          <div class="card" >
            <img
              src="https://via.placeholder.com/200x80/ccc/444"
              class="card-img-top"
              alt="lorem"
            />
            <div class="card-body">
              <h5 class="card-title">Article n°3</h5>
              <p class="card-text">
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </p>
              <a href="#" class="btn btn-primary">Go to Article</a>
            </div>
          </div>
        </div>
      </div>
    </div>

			</div>
		</div>
	</body>
	<footer class="container-fluid bg-dark p-5 text-white">
      <div class="container text-center">&copy; 2021–2021 copyright</div>
    </footer>
</html>
