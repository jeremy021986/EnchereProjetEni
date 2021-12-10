<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    
    <title>Détail Enchère</title>
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

<h1> ENI-Encheres</h1>

 <p>Detail vente</p>

 <div class="card my-3" >

 <div class="col-4">
            <img src="https://via.placeholder.com/200x80/ccc/444"
                class="card-img-top" alt="lorem" />
            <div class="card-body">
                </div>
               
            </div>
            </div>
<div class="col-7">
<div class="my-2">
 <label for="email">Description : </label>
 </div>
 <br>
  <div class="my-2">
 
 <label for="email ">Categorie : </label>
 </div>
 <br>
 <div class="my-2">
 <label for="email">Meilleure offre : </label> 
 </div>
 <br>
 <div class="my-2">
 <label for="email">Mise à prix : </label>
 </div>
 <br>
 <div class="my-2">
 <label for="email">Fin de l'enchère : </label>
 </div>
 <br>
 <div class="my-2">
 <label for="email">Retrait : </label>
 </div>
 <br>
 <div class="my-2">
 <label for="email">Vendeur : </label>
 </div>
 <br>

 <form action="" method="get" class="miseaprix">
  <div class="input-field my-2">
    <label for="mPrix">Ma proposition :</label>
    <input class="input" type="number" name="minPrix" id="maxPrix" 
    step="5" max= "10000" required>

<button type="submit">Enchérir</button>
</div>
</div>
  </form>
</div>
</body>
<footer class="container-fluid bg-success p-2 text-white">
      <div class="container text-center">&copy; 2021–2021 copyright</div>
 </footer>
 </html>
</html>