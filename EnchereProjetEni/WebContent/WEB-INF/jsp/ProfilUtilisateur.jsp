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
<title>Inscription</title>
</head>
<body>
<body style="background-color: #F2EEE8;">
	<nav class="navbar navbar-expand-lg navbar-light"
		style="background-color: #E4CDA7;">
		<div class="container">
			<a class="navbar-brand" href="PagePrincipale">Les objets sont nos
				amis</a>
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
							Profil : <c:out value="${sessionScope.pseudo}" />
					</a></li>
					<li class="nav-item"><a class="nav-link" href="EnchereEnCours">Enchères</a></li>
					<li class="nav-item"><a class="nav-link" href="Deconnection">Déconnexion</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="container">
			<h1>ENI-Encheres</h1>
			<p>Mon Profil</p>
			<div class="row">


				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputPseudo"><strong>Pseudo:</strong></label>

						</div>
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputpseudo"><c:out
									value="${sessionScope.pseudo}" /></label>
						</div>
					</div>
				</div>

				<br>

				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputPrenom"><strong>Nom:</strong></label>
						</div>
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<c:out value="${requestScope.nom}" />
						</div>
					</div>
				</div>
				<br>

				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputTelephone"><strong>Prénom:</strong></label>
						</div>
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<c:out value="${requestScope.prenom}" />
						</div>
					</div>
				</div>

				<br>

				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputCP"><strong>Email:</strong></label>
						</div>
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<c:out value="${requestScope.email}" />
						</div>
					</div>
				</div>

				<br>

				<div class="container-fluid ">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputPassword"><strong>Téléphone:</strong></label>
						</div>

						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<c:out value="${requestScope.tel}" />
						</div>
					</div>
				</div>
				<br>

				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputPassword"><strong>Rue:</strong></label>
						</div>

						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<c:out value="${requestScope.rue}" />
						</div>
					</div>
				</div>

				<br>

				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputPassword"><strong>Code Postal:</strong></label>
						</div>

						<div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<c:out value="${requestScope.cp}" />
						</div>
					</div>
				</div>

				<br>
				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<label for="inputPassword"><strong>Ville:</strong> </label>
						</div>

						<div class="form-group col-xs-12 col-sm-12 col-md-4 col-lg-4">
							<c:out value="${requestScope.ville}" />
						</div>
					</div>
				</div>

				<br>
				<br>
				<br>

				 <div class="container-fluid">
					<div class="row"> 
						
							<a href="./ModifProfilUtilisateur"><button type="button"
									class="btn btn-dark btn-block"
									style="background-color: #8E806A;">Modifier mon profil</button></a>
							<br /><br> <a href="./PagePrincipale"><button type="button"
									class="btn btn-dark btn-block"
									style="background-color: #8E806A;">Retour</button></a>
						</div>

					</div>
				</div>
				</div>
			</div>
			<br> <br> <br>

</body>
<footer class="container-fluid p-2 text-white"
	style="background-color: #E4CDA7;">
	<div class="container text-center">&copy; 2021–2021 copyright</div>
</footer>
</html>