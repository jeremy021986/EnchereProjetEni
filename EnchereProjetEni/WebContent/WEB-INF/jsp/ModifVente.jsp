<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">



<title>Modifier Vente</title>
</head>
<body>
<body style="background-color:#F2EEE8;">
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #E4CDA7;">>
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
					<form action="" method="get" class="form-example">
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
					</form>
					  
					<div class="input-field mt-3">
						<label for="mPrix">Mise à prix :</label> <input class="input"
							type="number" name="minPrix" id="maxPrix" step="5" max="10000"
							required>
					</div>
					<div class="mt-3">
					<label for="start">Début de l'enchère:</label> <input type="date"
						id="start" name="trip-start" value="2021-12-17" min="2021-12-17"
						max="2022-12-31">
						</div>
					<div class="mt-3">	
						<label
						for="start">Fin de l'enchère:</label> <input type="date"
						id="start" name="trip-start" value="2021-12-17" min="2021-12-17"
						max="2022-12-31">
					</div>
					<!-- Container pour le bloc retrait -->
					<label class="mt-3" for="start">Retrait: </label>
					<form action="" method="get" class="form-example">
						<div class="form-example mt-3">
							<label for="name">Rue : </label> <input type="text"
								name="article" id="article" required>
						</div>
						<div class="form-example mt-3">
							<label for=codepostal>Code postal</label> <input id=codepostal
								name=codepostal type=text required>
						</div>
						<div class="form-example mt-3">
							<label for="email">Ville : </label> <input type="email"
								name="description" id="description" required>
						</div>
					</form>
					<br>
					<div class="container">
						<div class="row">
							<a href="#"><button type="submit" class="btn btn-dark mt-3 col-xs-12 col-sm-12 col-md-4 col-lg-4" style="background-color: #8E806A;"
									name="sEnregistrer">Enregistrer</button></a> 
							<a href="PagePrincipale"><button type="submit" class="btn btn-success mt-3 col-xs-12 col-sm-12 col-md-4 col-lg-4" 
							name="sAnnuler">Annuler</button></a>
							<a href="#"><button type="submit" class="btn btn-dark mt-3 col-xs-12 col-sm-12 col-md-4 col-lg-4" style="background-color: #8E806A;"
							name="sAnnuler">Annuler la vente</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




</body>
<br>
<br>
<footer  class="text-center text-dark" style="background-color: #E4CDA7;">
  <!-- Grid container -->
  <div class="container p-4">
    <!-- Section: Social media -->
    <section class="mb-4">
      <!-- Facebook -->
      <a class="btn btn-outline-light btn-floating m-1" href="https://fr-fr.facebook.com
" role="button"><i class="fab fa-facebook-f"></i></a>

      <!-- Twitter --> 
      <a class="btn btn-outline-light btn-floating m-1" href="https://twitter.com/" role="button"
        ><i class="fab fa-twitter"></i
      ></a>

      <!-- Google -->
      <a class="btn btn-outline-light btn-floating m-1" href="https://www.google.com/" role="button"
        ><i class="fab fa-google"></i
      ></a>

      <!-- Instagram -->
      <a class="btn btn-outline-light btn-floating m-1" href="https://www.instagram.com/" role="button"
        ><i class="fab fa-instagram"></i
      ></a>

      <!-- Linkedin -->
      <a class="btn btn-outline-light btn-floating m-1" href="https://www.linkedin.com/" role="button"
        ><i class="fab fa-linkedin-in"></i
      ></a>

      <!-- Github -->
      <a class="btn btn-outline-light btn-floating m-1" href="https://github.com/" role="button"
        ><i class="fab fa-github"></i
      ></a>
    </section>
    <!-- Section: Social media -->

    <!-- Section: Form -->
    <section class="">
      <form action="">
        <!--Grid row-->
        <div class="row d-flex justify-content-center">
          <!--Grid column-->
          <div class="col-auto">
            <p class="pt-2">
              <strong>Inscrivez-vous pour recevoir nos news-letters</strong>
            </p>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-5 col-12">
            <!-- Email input -->
            <div class="form-outline form-white mb-4">
              <input type="email" id="form5Example21" class="form-control" />
              <label class="form-label" for="form5Example21">Adresse email:</label>
            </div>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-auto">
            <!-- Submit button -->
            <button type="submit" class="btn btn-outline-light mb-4">
              souscription
            </button>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </form>
    </section>
    <!-- Section: Form -->

    <!-- Section: Text -->
    <section class="mb-4">
      <p>
        Sur Les objets sont nos amis, on s’échange des biens, des services, on se prête du matériel, avec ou sans noisette, 
        la monnaie collaborative du site. les credits Troc : Reconnu d’utilité sociale et solidaire, agréé ESUS, 
        cité par l’ADEME comme outil de transition écologique, Les objets sont nos amis s’inscrit dans le développement durable.
      </p>
	</section>
  </div>
  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
    © 2020 Copyright:
    <a class="text-white" href="https://www.eni-ecole.fr/">ENI-ecole</a>
  </div>
  <!-- Copyright -->
</footer>
</html>