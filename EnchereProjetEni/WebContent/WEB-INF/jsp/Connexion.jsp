<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <title>Connexion</title>
</head>
<body>
<h1> ENI-Encheres</h1>

	<div>
		<form action="<c:url value="/Connexion" /> method="post">
		    <label for="email">Email:</label>
            <input name="email" size="30" />
            <br><br>
            <label for="mot_de_passe">Mot de passe:</label>
            <input type="password" name="password" size="30" />
            <br>${message}
            <br><br>           
            <button type="submit">Connexion</button>
        </form>
    </div>
</body>
</html>
	




