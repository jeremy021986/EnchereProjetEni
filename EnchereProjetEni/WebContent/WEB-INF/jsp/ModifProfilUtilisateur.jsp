<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Inscription</title>
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
<div class="container my-6 col-6 p-5">
	<h1> ENI-Encheres</h1>
<p>Mon Profil</p>
<form method="post" action="./ModifProfilUtilisateur">

<div class="input-group col-4 py-4">
	  	<div class="form-group col-my-4">
	      <label for="inputPseudo">Pseudo:</label>
	      <input type="text" class="form-control" id="modifPseudo" name="modifPseudo" value="${requestScope.pseudo}" required>
	    </div>
	    <div class="form-group col-my-4">
	      <label for="inputModifNom">Nom:</label>
	      <input type="text" class="form-control" id="modifNom" name="modifNom" value="${requestScope.nom}" required>
	    </div>
    </div>
  
  <br>

  <div class="input-group">
    <div class="form-group col-my-4">
      <label for="inputModifPrenom">Prénom:</label>
      <input type="text" class="form-control" id="modifPrenom" name="modifPrenom" value="${requestScope.prenom}" required>
    </div>
    <div class="form-group col-my-4">
      <label for="inputModifEmail">Email:</label>
      <input type="email" class="form-control" id="modifEmail" name="modifEmail" value="${requestScope.email}" required>
    </div>
  </div>
  
  <br>

  <div class="input-group">
    <div class="form-group col-my-4">
      <label for="inputModifTel">Telephone:</label>
      <input type="tel" class="form-control" id="modifTel" name="modifTel" value="${requestScope.tel}" required>
    </div>
    <div class="form-group col-my-4">
      <label for="inputModifRue">Rue:</label>
      <input type="text" class="form-control" id="modifRue" name="modifRue" value="${requestScope.rue}" required>
    </div>
  </div>
  
  <br>

  <div class="input-group">
	    <div class="form-group col-my-4">
	      <label for="inputModifCP">Code postal:</label>
	      <input type="number" class="form-control" id="modifCp" name="modifCp" value="${requestScope.cp}" required>
	    </div>
	    <div class="form-group col-my-4">
	      <label for="inputModifVille">Ville:</label>
	      <input type="text" class="form-control" id="modifVille" name="modifVille" value="${requestScope.ville}" required>
	    </div>
  </div>
  
	<div class="input-group">
		<div class="form-group col-my-4">
			<label for="inputCurMDP">Mot de passe actuel:</label>
			<input type="password" class="form-control" id="mdpActuel" name="mdpActuel" value="${requestScope.mdp}" required>
		</div>
	</div>

  
	<div class="input-group">
		<div class="form-group col-my-4">
			<label for="inputNewMDP">Nouveau mot de passe:</label>
			<input type="password" class="form-control" id="modifMdp" name="modifMdp" value="${requestScope.mdp}" required>
		</div>
		<div class="form-group col-my-4">
			<label for="inputConfirmMDP">Confirmation:</label>
			<input type="password" class="form-control" id="modifConfirmMdp" name="modifConfirmMdp"value="${requestScope.mdp}" required>
		</div>
	</div>
    <br>
    <div>Crédit:${requestScope.credit}</div>
    <br>
    <div class="input-group">
		<div class="form-group col-my-4">
			   	<button type="submit" class="btn btn-dark" style="background-color: #8E806A;" name="sEnregistrer">Enregistrer</button>
		</div>
  	</div>
  	
  </form>
  <div class="form-group col-my-4">
	    	<a href="./SupProfil"><button type="submit" class="btn btn-dark" style="background-color: #8E806A;">Supprimer mon compte</button></a>
		</div>
</div>


  
</body>
<footer class="container-fluid p-2 text-white" style="background-color: #E4CDA7;">
	<div class="container text-center">&copy; 2021–2021 copyright</div>
</footer>
</html>