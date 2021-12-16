<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <title> Enchère terminée</title>
</head>



<body>
<body style="background-color:#F2EEE8;">


    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #E4CDA7;">
        <div class="container">
            <a class="navbar-brand" href="#">Les objets sont nos amis</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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
                    <li class="nav-item"><a class="nav-link" href="PublicationVente">Enchères</a></li>
                    <li class="nav-item">
                        <a class="nav-link" href="PageConnexion">S'inscrire / Se connecter</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <h1> ENI-Encheres</h1>
    <h3>Vous avez remporté la vente</h3>



    <div class="container my-5">
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/200x80/ccc/444" class="card-img-top" alt="lorem" />
                    <div class="card-body">
                        <h5 class="card-title">Article n°3</h5>
                        <p class="card-text">Some quick example text to build on the
                            card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Go to Article</a>
                    </div>
                </div>

            </div>
            <div class="col-md-8">

                <label for="email">Description : </label><br>
                <label for="email">Meilleur offre : </label><br>
                <label for="email">Mise à prix : </label>
                <br>
                <label for="email">Retrait : </label>
                <br>
                <label for="email">Vendeur : </label>
                <br>
                <label for="email">Telephone : </label>
                <br>

            </div>


        </div>


    </div>
    
    
        
    </div> <!-- faire la redirection -->
<div class="d-grid  col-1 mx-auto p-4">
  <button class="btn btn-success" type="submit">Retour</button>
 
</div>


 <footer class="container-fluid p-2 text-white" style="background-color: #E4CDA7;">
      <div class="container text-center">&copy; 2021 copyright</div>
 </footer>

</body>



</html>