<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%> 
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet"  href="./inserisciDipendente.css" />
<title>Inserimento</title>
</head>
<body>
<div align="center" id="principal">
<!-- PUOZZ PASSA' NIENT LA FORM VA MESSA SU TUTTI I CAMPI CHE TI SERVONO GNORANTITA'!!!! -->
<form action="InserisciDipendente" method="post">
<table>
<tr>
<th style="color:blue">Nome</th><td><input type="text" name="nome"></td>
</tr>
<tr> 
<th>Cognome</th><td><input type="text" name="cognome"></td>
</tr>
<tr>  
<th>Eta</th><td><input type="text" name="eta"></td>
</tr>
</table>
<h3>Ruolo</h3>
<select name="ruolo" >
<option value="-1">---Seleziona Ruolo----</option>
<c:forEach var= "ruolo" items="${ruoli}">
<option value="${ruolo.id}">${ruolo.descrizione}</option>
</c:forEach>
</select>
<h3>Titolo di studio</h3>
<select name="titolo">
<option value="-1">---Seleziona Titolo----</option>
<c:forEach var= "titolo" items="${titoli}">
<option value="${titolo.id}">${titolo.descrizione}</option>
</c:forEach>
</select>
<br>
<br>
<input type="submit" name="bntinserisci" value="inserisci"> 
</form>
</div>
</body>
</html>