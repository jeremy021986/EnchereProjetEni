<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<h2>Nouvelle Vente</h2>

<div class="w3-card-4">
    <img src="150.png" alt="Alps">
    <div class="w3-container w3-center">
    </div>
  </div>

<form action="" method="get" class="form-example">
<div class="form-example">
    <label for="name">Article : </label>
    <input type="text" name="article" id="article" required>
</div>
<div class="form-example">
    <label for="email">Description : </label>
    <input type="email" name="description" id="description" required>
</div>
</form>

<label for="email">Categorie : </label>

<select name="pets" id="pet-select">
<option value="">--Toutes--</option>
<option value="informatique">Informatique</option>
<option value="ameublement">Ameublement</option>
<option value="vetement">Vetement</option>
<option value="sport&loisirs">Sport & Loisirs</option>
</select>
<br>
<label for="email">Photo de l'article : </label>

<button type="submit">Uploader</button>
<br>

<div class="input-field">
    <label for="mPrix">Mise à prix :</label>
    <input class="input" type="number" name="minPrix" id="maxPrix" 
    step="5" max= "10000" required>
</div>

<label for="start">Début de l'enchère:</label>

<input type="date" id="start" name="trip-start"
value="2021-12-17"
min="2021-12-17" max="2022-12-31">
<br>

<label for="start">Fin de l'enchère:</label>

<input type="date" id="start" name="trip-start"
        value="2021-12-17"
        min="2021-12-17" max="2022-12-31">

<label for="start">Retrait </label>

<form action="" method="get" class="form-example">
    <div class="form-example">
        <label for="name">Rue : </label>
        <input type="text" name="article" id="article" required >
    </div>
    <div class="form-example">
        <label for=codepostal>Code postal</label>
          <input id=codepostal name=codepostal type=text required>
    </div>

    

    <div class="form-example">
        <label for="email">Ville : </label>
        <input type="email" name="description" id="description" required>
    </div>
    <button type="submit">Enregistrer</button>
    </form>

    
    <button type="submit">Annuler</button>
</body>
</html>