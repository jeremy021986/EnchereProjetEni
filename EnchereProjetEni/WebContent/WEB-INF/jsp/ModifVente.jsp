<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">



<title>Modifier Vente</title>
</head>
<body>

  <nav class="navbar navbar-expand-lg navbar-dark bg-success">
        <div class="container">
            <a class="navbar-brand" href="#">Les objets sont nos amis</a>
            <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <!-- ms-auto = margin-left:auto -->
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link active"
                        aria-current="page" href="accueil">Accueil</a></li>
                    <li class="nav-item"><a class="nav-link" href="Profil">Profil</a>
                    </li>
                    <li class="nav-item"><a class="nav-link"
                        href="PublicationVente">Enchèes</a></li>
                    <li class="nav-item"><a class="nav-link" href="PageConnexion">S'inscrire
                            / Se connecter</a></li>
                </ul>
            </div>
        </div>
    </nav>
    


<h1> ENI-Encheres</h1>

<h2>Modifier Vente</h2>

 <div class="container my-5">
      <div class="row">
        <div class="col-4">
         <div class="card">
            <img src="https://via.placeholder.com/200x80/ccc/444"
                class="card-img-top" alt="lorem" />
            	<div class="card-body">
                <h5 class="card-title">Article n°3</h5>
                <p class="card-text">Some quick example text to build on the
                    card title and make up the bulk of the card's content.</p>
                <a href="#" class="btn btn-primary">Go to Article</a>
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
        min="2021-12-17" max="2018-12-31">
<br>
<label for="start">Retrait </label>
<br>
<form action="" method="get" class="form-example">
    <div class="form-example">
        <label for="name">Rue : </label>
        <input type="text" name="article" id="article" required >
    </div>
    <div class="form-example">
        <label for="email">Code postal : </label>
        <input type="email" name="description" id="description" required>
    </div>
    <div class="form-example">
        <label for="email">Ville : </label>
        <input type="email" name="description" id="description" required>
    </div>
    </form>

    <button type="submit">Enregistrer</button>
    <button type="submit">Annuler</button>
    <button type="submit">Annuler la vente</button>
    
</body>

 <footer class="container-fluid bg-success p-2 text-white">
      <div class="container text-center">&copy; 2021–2021 copyright</div>
 </footer>
 </html>