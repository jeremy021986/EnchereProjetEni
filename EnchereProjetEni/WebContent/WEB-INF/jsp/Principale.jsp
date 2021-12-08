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
<h1> ENI-Encheres</h1>
<a href="<c:url value="CreaProfil"></c:url>"><button type="submit">Enchéres</button></a>
<a href="./PublicationVente"><button type="button">Vendre un article</button></a>
<a href="./Profil"><button type="button">Mon profil</button></a>
<a href="./Deconnection"><button type="button">Déconection</button></a>
 
<p>Liste des enchères</p>
<p> Filtres :</p>
<div class="search-box">
    <input type="text" class="search" placeholder="Le nom de l'article contient">
<br>
    <button type="submit">Rechercher</button>
</div>
<br>
<label for="pet-select">Toutes</label>
<select name="pets" id="pet-select">
    <option value="">--Toutes--</option>
    <option value="informatique">Informatique</option>
    <option value="ameublement">Ameublement</option>
    <option value="vetement">Vetement</option>
    <option value="sport&loisirs">Sport & Loisirs</option>
</select>
<br>
<div>
    <input type="radio" id="huey" name="drone" value="achats"
           checked>
    <label for="achats">Achats</label>
    <div>
        <input type="checkbox" id="scales" name="encheresouvertes"
               checked>
        <label for="scales">enchères ouvertes</label>
      </div>
      <div>
        <input type="checkbox" id="scales" name="mesencheres"
               checked>
        <label for="scales">mes enchères</label>
      </div>
      <div>
        <input type="checkbox" id="scales" name="encheresouvertes"
               checked>
        <label for="scales">mes enchères remportées</label>
      </div>
</div>
<div>
    <input type="radio" id="huey" name="drone" value="ventes"
           checked>
    <label for="ventes">Ventes</label>
    <div>
        <input type="checkbox" id="scales" name="mesventesencours"
               checked>
        <label for="scales">mes ventes en cours</label>
      </div>
      <div>
        <input type="checkbox" id="scales" name="ventenondebutees"
               checked>
        <label for="scales">ventes non débutées</label>
      </div>
      <div>
        <input type="checkbox" id="scales" name="ventesterminées"
               checked>
        <label for="scales">ventes terminées</label>
      </div>
</div>
<div class="w3-card-4">
    <img src="150.png" alt="Alps">
    <div class="w3-container w3-center">
      <p>Meuble</p>
    </div>
  </div>
<div class="w3-card-4">
    <img src="150.png" alt="Alps">
    <div class="w3-container w3-center">
      <p>Meuble</p>
    </div>
  </div>
</body>
</html>
