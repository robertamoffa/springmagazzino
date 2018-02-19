<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%> 
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>modifica</title>
</head>
<body>
<div style="background-color: #cd5c5c; position:relative; padding:10px; left:50px; top:50px; width:300px;">
<table>
<tr>
<th>Nome</th><td><input type="text" name="nome"></td>
</tr>
<tr> 
<th>Cognome</th><td><input type="text" name="cognome"></td>
</tr>
<tr>  
<th>Eta</th><td><input type="text" name="eta"></td>
</tr>
</table>
<br>
<br>
<select name="ruolo" >
<option value="-1">---Seleziona Ruolo----</option>
<c:forEach var= "ruolo" items="${ruoli}">
<option value="${ruolo.id}">${ruolo.descrizione}</option>
</c:forEach>
</select>
<br>
<br>
<select name="titolo">
<option value="-1">---Seleziona Titolo----</option>
<c:forEach var= "titolo" items="${titoli}">
<option value="${titolo.id}">${titolo.descrizione}</option>
</c:forEach>
</select>
<br>
<br>
<form action="ModificaDipendente" method="post">
<input type="hidden" name="id" value="${idD}">
<input type="submit" name="bntinserisci" value="modifica"> 
<input type="reset" name="bntreset" value="reset">
</form>
</div>
</body>
</html>