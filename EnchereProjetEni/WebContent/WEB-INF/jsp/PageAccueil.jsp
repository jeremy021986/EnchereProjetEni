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
<div>
<a href="<c:url value="PageConnexion"></c:url>"><button type="submit">s'inscrire ce connecter</button></a>
</div>
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
<div class="w3-card-4">
    <img src="150.png" alt="Alps">
    <div class="w3-container w3-center">
      <p>Meuble</p>
    </div>
  </div>