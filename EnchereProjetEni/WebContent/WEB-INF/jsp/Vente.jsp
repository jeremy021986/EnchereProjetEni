<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Nouvelle vente</title>
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
						href="PublicationVente">Enchères</a></li>
					<li class="nav-item"><a class="nav-link" href="PageConnexion">S'inscrire
							/ Se connecter</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid">
		<!-- Container pour le bloc ARticle, description, catégorie photo -->
		<div class="container">
			<h1>ENI-Encheres</h1>
			<h2 class="text-center">Nouvelle Vente</h2>
			<br> <br>
			<div class="row justify-content-around">

				<div class="container col-xs-12 col-sm-12 col-md-4 col-lg-4">

					<label for="text">Photo de l'article : </label>
					<br><br>
					<div class="card">
						<img src="https://via.placeholder.com/200x80/ccc/444"
							class="card-img-top" alt="lorem" />
						<div class="card-body">
							<h5 class="card-title">Article n°3</h5>
							<p class="card-text">Some quick example text to build on the
								card title and make up the bulk of the card's content.</p>
							<a href="#" class="text-center btn btn-primary">Uploader</a>
						</div>
					</div>
				</div>

				<br>

				<div class="container col-xs-12 col-sm-12 col-md-6 col-lg-6 mt-3">
					<form action="./PublicationVente" method="post" class="form-example">
						<div class="form-example">
							<label for="name">Article :</label> <input type="text"
								name="article" id="article" required>
						</div>
						<br> <label class="mb-3" for="email">Categorie : </label> <select
							name="pets" id="pet-select">
							<option value="">--Toutes--</option>
							<option value="informatique">Informatique</option>
							<option value="ameublement">Ameublement</option>
							<option value="vetement">Vetement</option>
							<option value="sport&loisirs">Sport & Loisirs</option>

						</select> 
						<br>
						 <label for="email">Description :</label> <input
							type="text" name="description" id="description" required>
					
					  
					<div class="input-field mt-3">
						<label for="mPrix">Mise à prix :</label> <input class="input"
							type="number" name="prixInitial" id="PrixInitial" step="5" max="10000"
							required>
					</div>
					<div class="mt-3">
					<label for="start">Début de l'enchère:</label> <input type="date"
						id="debutEnchere" name="debutEnchere" value="2021-12-17" min="2021-12-17"
						max="2022-12-31">
						</div>
					<div class="mt-3">	
						<label
						for="start">Fin de l'enchère:</label> <input type="date"
						id="finEnchere" name="finEnchere" value="2021-12-17" min="2021-12-17"
						max="2022-12-31">
					</div>
					<!-- Container pour le bloc retrait -->
					<label class="mt-3" for="start">Retrait: </label>
					
						<div class="form-example mt-3">
							<label for="name">Rue : </label> <input type="text"
								name="rue" id="rue" required>
						</div>
						<div class="form-example mt-3">
							<label for=codepostal>Code postal</label> <input id=codepostal
								name=codepostal type=text required>
						</div>
						<div class="form-example mt-3">
							<label for="ville">Ville : </label> <input type="text"
								name="ville" id="ville" required>
						</div>
						<a href="./accueil"><button type="submit" class="btn btn-primary mt-3"
									name="Enregistrer">Enregistrer</button></a> 
					</form>
					<br>
					<div class="container col-xs-12 col-sm-12 col-md-6 col-lg-6">
						<div class="row">

							
							<a href="PagePrincipale"><button type="submit"
									class="btn btn-primary mt-3" name="Annuler">Annuler</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




</body>
<br>
<br>
<footer class="container-fluid bg-success p-2 text-white">
	<div class="container text-center">&copy; 2021 copyright</div>
</footer>
</html>
