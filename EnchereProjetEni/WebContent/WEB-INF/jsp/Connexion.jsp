<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/sign-in/">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Connexion</title>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-success">
      <div class="container">
        <a class="navbar-brand" href="#">Les objets sont nos amis</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <!-- ms-auto = margin-left:auto -->
          <ul class="navbar-nav ms-auto">
           <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="accueil">Accueil</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="#">Profil</a>
           </li>
           <li class="nav-item">
              <a class="nav-link" href="#">Contact</a>
           </li>
             <li class="nav-item"><a class="nav-link"
                        href="PublicationVente">Enchères</a></li>
           <li class="nav-item">
              <a class="nav-link" href="PageConnexion">S'inscrire / Se connecter</a>
           </li>
         </ul>
      </div>
   </div>
</nav>

<div class="container my-6 col-6 p-5">
	<h1>ENI-Encheres</h1>
	<main class="form-signin">
		<form action="./PageConnexion" method="post">
		<c:if test="${mdpValide != null && mdpValide == false}">
            <p class="mdpIncorrect">L'identifiants et / ou le mot de passe
                incorrects!</p>
        </c:if>
		<!-- Mettre le logo enchere -->
			<img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt=""
				width="72" height="57">
			<h1 class="h3 mb-3 fw-normal">Se connecter</h1>

			<div class="form-floating">
				<label for="pseudo">Identifiant : </label> <input type="text" id="pseudo"
            name="pseudo" 
					class="form-control" id="pseudo" name="pseudo" placeholder="Votre pseudo">
			</div>
			<br>
			<div class="form-floating">
				<label for="motDePasse">Mot de passe :</label> <input
					type="password" class="form-control" id="motDePasse"  name="motDePasse"
					placeholder="Mot de passe">
			</div>

			<div class="checkbox mb-3">
				<label> <input type="checkbox" value="remember-me">
					Se souvenir de moi
				</label>
			</div>
			<button class="w-100 btn btn-lg btn-success" type="submit">Connexion</button> 
			<br>
			<br>
			<button class="w-100 btn btn-lg btn-success" type="submit">Créer un compte</button>
			
		</form>
	</main>

	<a href="https://example.com">Mot de passe oublié</a>
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