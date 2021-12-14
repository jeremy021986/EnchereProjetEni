<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width= , initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Accueil Enchère</title>
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
					<li class="nav-item"><a class="nav-link" href="#">Profil</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Contact</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="PublicationVente">Enchères</a></li>
					<li class="nav-item"><a class="nav-link" href="PageConnexion">S'inscrire
							/ Se connecter</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="container">
			<h1>ENI-Encheres</h1>
			<h2 class="text-center">Liste des enchères</h2>

			<div class="row justify-content-around">

				<div class="container col-xs-12 col-sm-12 col-md-4 col-lg-4">

					<div class="card">
						<img src="https://via.placeholder.com/200x80/ccc/444"
							class="card-img-top" alt="lorem" />
						<div class="card-body">
							<h5 class="card-title">Article n°3</h5>
							<p class="card-text">Some quick example text to build on the
								card title and make up the bulk of the card's content.</p>
						</div>
					</div>
				</div>
				<br>

				<div class="container col-xs-12 col-sm-12 col-md-6 col-lg-6 mt-3">

					<div class="input-field mt-3">
						<form action="./PageInscription" method="post" class="miseaprix">
							<label for="mPrix">Filtre:</label> <input class="input"
								type="text" name="filtre" 
								required> <br> <label class="mt-3" for="email">Categorie
								: </label> <select name="pets" id="pet-select">
								<option value="">--Toutes--</option>
								<option value="informatique">Informatique</option>
								<option value="ameublement">Ameublement</option>
								<option value="vetement">Vetement</option>
								<option value="sport&loisirs">Sport & Loisirs</option>

							</select> <br>
						</form>
						<a href="#"><button type="submit"
								class="btn btn-success mt-3 col-xs-12 col-sm-12 col-md-4 col-lg-4"
								name="sRechercher">Rechercher</button></a>
					</div>
				</div>
			</div>
		</div>
	</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
</body>
<footer class="container-fluid bg-success p-2 text-white">
	<div class="container text-center">&copy; 2021–2021 copyright</div>
</footer>
</html>