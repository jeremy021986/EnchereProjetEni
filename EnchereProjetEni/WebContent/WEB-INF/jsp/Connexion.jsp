<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <title>Connexion</title>
</head>
<body>
<h1> ENI-Encheres</h1>
<form action="./PageConnexion" method="post" >
    <label for="id" >Identifiant</label>
    <br>
    <input type="text" id="nombre" name="identifiant"  />
    <br>
    <label for="id" >Mot de passe</label>
    <br>
    <input type="text" id="nombre" name="motdepasse"  />
    <br>
    <button type="submit">Connexion</button>
    
</form>
<div>
    <input type="checkbox" id="scales" name="scales"
           checked>
    <label for="scales">Se souvenir de moi</label>
  </div>
  
<a href="https://example.com">Mot de passe oublié</a>
<a href="PageInscription"><button type="submit" class="btn btn-primary">Créer un compte</button></a>

</body>
</html>