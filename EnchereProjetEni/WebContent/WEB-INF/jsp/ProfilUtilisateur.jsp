<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<%@ page import="fr.eni.enchere.bo.Utilisateur"%>
<%@ page import="java.time.format.FormatStyle"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Document</title>
</head>
<body>
<body style="background-color: #F2EEE8;">

	<nav class="navbar navbar-expand-lg navbar-light"style="background-color: #E4CDA7;">
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


	<div class="d-grid gap-2 col-2 mx-auto">

		<h5>Pseudo :</h5>
		<c:out value="${sessionScope.pseudo}" />

		<h5>Nom :</h5>
		<c:out value="${requestScope.nom}" />

		<h5>Prénom :</h5>
		<c:out value="${requestScope.prenom}" />

		<h5>Email :</h5>
		<c:out value="${requestScope.email}" />
		br>
		<h5>Téléphone :</h5>
		<c:out value="${requestScope.tel}" />

		<h5>Rue :</h5>
		<c:out value="${requestScope.rue}" />

		<h5>Code Postal :</h5>
		<c:out value="${requestScope.cp}" />

		<h5>Ville :</h5>
		<c:out value="${requestScope.ville}" />
		<br> <br> <br>
	</div>

	<div class="d-grid gap-1 col-2 mx-auto">
		<a href="./ModifProfilUtilisateur"><button type="button"
				class="btn btn-dark btn-block" style="background-color: #8E806A;">Modifier
				mon profil</button></a> <br /> <a href="./PagePrincipale"><button
				type="button" class="btn btn-dark btn-block"
				style="background-color: #8E806A;">Retour</button></a>
	</div>
	<br>
	<br>




	<footer class="container-fluid p-2 text-white"
		style="background-color: #E4CDA7;">
		<div class="container text-center">&copy; 2021 copyright</div>
	</footer>
</body>
</html>
