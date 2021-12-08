<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Inscription</title>
</head>
<body>
<h1> ENI-Encheres</h1>
<p>Mon Profil</p>
<form method="post" action="./PageInscription">
    <p>Pseudo :<input type="text" name="pseudo"/></p>


    <p>Nom :<input type="text" name="nom"/></p>


    <p>Prénom :<input type="text" name="prenom"/></p>

 
    <p>Email : <input type="text" name="email"/></p>


    <p>Téléphone :  <input type="text" name="telephone"/></p>

 
    <p>Rue : <input type="text" name="rue"/></p>


    <p>Code Postal : <input type="text" name="codepostal"/></p>


    <p>Ville : <input type="text" name="ville"/></p>


    <p>Mot de passe : <input type="text" name="motdepasse"/></p>


    <p>Confirmation :<input type="text" name="confirmation"/></p>
    <button type="submit" class="btn btn-primary" name="sEnregistrer">Créer</button>
 </form>

<a href="accueil"><button type="submit" class="btn btn-primary">Annuler</button></a>
</body>
</html>