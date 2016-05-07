<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Création d'un élève</title>
</head>
<body>

	<form action="webservice.do">
		<label> Nom :</label>
		<input type="text">
		<label> Prénom :</label>
		<input type="text">
		<label> Age :</label>
		<input type="text">
		<label> Classe :</label>
		<select>
			<option value="I4"> I4 </option>
		</select>
		<input type="radio" name="type" value="0"> Eleve<br>
		<input type="radio" name="type" value="1"> Modérateur<br>
		<input type="radio" name="type" value="2"> Administrateur<br>
		<input type="submit" value="Enregistrer">
	</form>

</body>
</html>