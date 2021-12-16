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
<title>Accueil Encheres</title>
</head>
<body>
<body style="background-color:#F2EEE8;">
	<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #E4CDA7;">
		<div class="container">
			<a class="navbar-brand" href="PagePrincipale">Les objets sont nos amis</a>
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
						aria-current="page" href="PagePrincipale">Accueil</a></li>
					<li class="nav-item"><a class="nav-link"
						href="PublicationVente">Vendre un article</a></li>
					<li class="nav-item"><a class="nav-link" href="Profil">Mon
							Profil : <c:out value="${sessionScope.pseudo}"/></a></li>
					<li class="nav-item"><a class="nav-link"
						href="EnchereEnCours">Enchères</a></li>
					<li class="nav-item"><a class="nav-link" href="Deconnection">Déconnexion</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid">
		<div class="container">
			<h2>ENI-ENCHERES</h2>
			<p>Filtres:</p>
			<div class="row">

				<div class="container col-xs-12 col-sm-12 col-md-4 col-lg-4">
					<input class="form-check-input" type="radio" name="genre"
						id="homme" value="homme" checked> <label class="form-check-label"
						for="homme">Achats</label> <br> <input
						class="form-check-input" type="checkbox" name="achat[]"
						id="enchereOuverte" value="enchereOuverte" /> <label
						class="form-check-label" for="pomme">enchères ouvertes</label> <br>
					<input class="form-check-input" type="checkbox" name="achat[]"
						id="mesEnchere" value="mesEnchere" /> <label
						class="form-check-label" for="poire">mes enchères</label> <br>
					<input class="form-check-input" type="checkbox" name="achat[]"
						id="enchereRemporte" value="enchereRemporte" /> <label
						class="form-check-label" for="kiwi">mes enchères
						remportées</label> <br>
					<br>
				</div>
				<div class="container col-xs-12 col-sm-12 col-md-4 col-lg-4">
					<input class="form-check-input" type="radio" name="genre"
						id="femme" value="femme" /> <label class="form-check-label"
						for="femme">Mes ventes</label> <br> <input
						class="form-check-input" type="checkbox" name="vente[]"
						id="enchereEnCours" value="enchereEnCours" /> <label
						class="form-check-label" for="pomme">enchères en cours</label> <br>
					<input class="form-check-input" type="checkbox" name="vente[]"
						id="venteNonDebute" value="venteNonDebute" /> <label
						class="form-check-label" for="poire">ventes non débutées</label> <br>
					<input class="form-check-input" type="checkbox" name="vente[]"
						id="ventesTermine" value="ventesTermine" /> <label
						class="form-check-label" for="kiwi">ventes terminées</label>
				</div>
			</div>
		</div>
		<br>
		<br>
		<div class="container-fluid">
			<div class="container">
				<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
					<label for="pet-select">Catégories</label> <select name="pets"
						id="pet-select">
						<option value="">Toutes</option>
						<option value="informatique">Informatique</option>
						<option value="ameublement">Ameublement</option>
						<option value="vetement">Vetement</option>
						<option value="sport&loisirs">Sport & Loisirs</option>
					</select>
				</div>
				<br>
				<br>
				<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
					<div class="search-box ">
						<input type="text" class="search"
							placeholder="Le nom de l'article contient"> <br>
						<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<button type="submit" style="background-color: #8E806A;" >Rechercher</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<br>
		<br>
		<div class="container-fluid">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
						<!-- cards  ici-->
						<div class="card">
							<img src="https://via.placeholder.com/200x80/ccc/444"
								class="card-img-top" alt="lorem" />
							<div class="card-body">
								<h5 class="card-title">Article n°1</h5>
								<p class="card-text">Some quick example text to build on the
									card title and make up the bulk of the card's content.</p>
								<a href="#" class="btn btn-primary">Go to article</a>
							</div>
						</div>
					</div>
					<br>
					<br>
					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
						<!-- cards  ici-->
						<div class="card">
							<img src="https://via.placeholder.com/200x80/ccc/444"
								class="card-img-top" alt="lorem" />
							<div class="card-body">
								<h5 class="card-title">Article n°2</h5>
								<p class="card-text">Some quick example text to build on the
									card title and make up the bulk of the card's content.</p>
								<a href="#" class="btn btn-primary">Go to article</a>
							</div>
						</div>
					</div>
					<br>
					<br>
					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
						<!-- cards  ici-->
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
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>


</body>
<footer class="container-fluid p-2 text-white" style="background-color: #E4CDA7;">
	<div class="container text-center">&copy; 2021 copyright</div>
</footer>
</html>