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
 <p>Detail vente</p>

 <div class="w3-card-4">
  <img src="150.png" alt="Alps">
  <div class="w3-container w3-center">
    <p>Meuble</p>
  </div>
</div>


 <label for="email">Description : </label>
 <br>
 <label for="email">Categorie : </label>
 <br>
 <label for="email">Meilleure offre : </label> 
 <br>
 <label for="email">Mise à prix : </label>
 <br>
 <label for="email">Fin de l'enchère : </label>
 <br>
 <label for="email">Retrait : </label>
 <br>
 <label for="email">Vendeur : </label>
 <br>

 <form action="" method="get" class="miseaprix">
  <div class="input-field">
    <label for="mPrix">Ma proposition :</label>
    <input class="input" type="number" name="minPrix" id="maxPrix" 
    step="5" max= "10000" required>
</div>
<button type="submit">Enchérir</button>
  </form>

</body>
</html>