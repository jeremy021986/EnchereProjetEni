
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="fr.eni.enchere.bo.Utilisateur" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body style="background-color:#F2EEE8;">
		<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #E4CDA7;">
		<div class="container">
			<a class="navbar-brand" href="PagePrincipale"><img src="logo_enchere.png" height="50" width="90" ></a>
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
							<a href="#" class="text-center btn btn-dark" style="background-color: #8E806A;" >Uploader</a>
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
						<br> <label class="mb-3" for="text">Categorie : </label> <select
							name="categorie" id="categorie">
							<option value="">--Toutes--</option>
							<option value="1" id =  "1"  name=  "1" >Informatique</option>
							<option value="2" id =   "2" name= "2" >Ameublement</option>
							<option value="3" id =  "3"  name= "3">Vetement</option>
							<option value="4" id =  "4"  name= "4" >Sport & Loisirs</option>

						</select> 
						<br>
						 <label for="text">Description :</label> <input
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
								name="rue" id="rue" value="${requestScope.rue}" required>
						</div>
						<div class="form-example mt-3">
							<label for=codepostal>Code postal</label> <input id=cp
								name=cp type=text value="${requestScope.cp}" required>
						</div>
						<div class="form-example mt-3">
							<label for="ville">Ville : </label> <input type="text"
								name="ville" id="ville" value="${requestScope.ville}" required>
						</div>
						<button type="submit" class="btn btn-dark mt-3" style="background-color: #8E806A;"
									name="Enregistrer">Enregistrer</button>
					</form>
					<br>
					<div class="container col-xs-12 col-sm-12 col-md-6 col-lg-6">
						<div class="row">

							
							<a href="PagePrincipale"><button type="submit"
									class="btn btn-dark mt-3" style="background-color: #8E806A;" name="Annuler">Annuler</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




</body>
<br>
<br>
<br>
<br>
<footer class="container-fluid p-2 text-white" style="background-color: #E4CDA7;">
	<div class="container text-center">&copy; 2021 copyright</div>
</footer>
</html>
