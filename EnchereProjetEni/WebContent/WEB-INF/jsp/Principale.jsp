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
							<button type="submit" class="btn btn-dark mt-3" style="background-color: #8E806A;" >Rechercher</button>
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
							<img src="https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=1920/https://d1eh9yux7w8iql.cloudfront.net/product_images/38738_32114a1d-ed97-4938-8daf-5fb6a064a870.jpg"
								class="card-img-top" alt="Gameboy" height="300" width="200"/>
							<div class="card-body">
								<h5 class="card-title">Gameboy Color</h5>
								<p class="card-text">Super Gameboy color qui a bercé mon enfance<br>
								marche toujours super bien depuis 20 ans<br>
								vendu sans piles</p>
								<a href="#" class="btn btn-primary">Voir l'article</a>
							</div>
						</div>
					</div>
					<br>
					<br>
					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
						<!-- cards  ici-->
						<div class="card">
							<img src="https://media.paruvendu.fr/image/planche-surf-shortboard/WB16/1/0/WB161044589_1.jpeg"
								class="card-img-top" alt="lorem" height="300" width="200"/>
							<div class="card-body">
								<h5 class="card-title">Planche de surf</h5>
								<p class="card-text">Planche de surf de la marque : ShortBoard.<br>
								Acheté il y a 4 ans, je la mets à disposition car, j'en ai acquis une nouvelle depuis</p>
								<a href="#" class="btn btn-primary">Go to article</a>
							</div>
						</div>
					</div>
					<br>
					<br>
					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
						<!-- cards  ici-->
						<div class="card">
							<img src="https://media.ldlc.com/r1600/ld/products/00/05/71/99/LD0005719939_1.jpg"
								class="card-img-top" alt="lorem" height="300" width="200" />
							<div class="card-body">
								<h5 class="card-title">Carte graphique RTX 3090 TI</h5>
								<p class="card-text">arte graphique RTX 3090 TI fonctionne super bien. Encore sous garantie constructeur (vendu avec facture), emballé avec carton et papier bulle.</p>
								<a href="#" class="btn btn-primary">Voir l'article</a>
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