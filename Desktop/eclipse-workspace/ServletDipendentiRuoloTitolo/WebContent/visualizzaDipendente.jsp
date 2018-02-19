<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%>
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet"  href="./visualizzaDipendente.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visualizza</title>
</head>
<body>
<div id="first" align="center">
<table id="view" border="2px">
    <thead>
        <tr><th>Id</th><th>Nome</th><th>Cognome</th><th>Età</th><th>Id Ruolo</th><th>Id Titolo di studio</th></tr>
    </thead>
    <tbody>
<c:forEach var="dipendente" items="${dipendenti}">
    
        <tr><td>${dipendente.id}</td><td>${dipendente.nome}</td><td>${dipendente.cognome}</td><td>${dipendente.eta}</td><td>${dipendente.idRuolo}</td><td>${dipendente.idTitolo}</td><td>
<a href="CancellaDipendente?id=${dipendente.id}">
<button>cancella</button><td><a href="ModificaDipendente?id=${dipendente.id}"><button>modifica</button></a>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<div id="second" align="center">
<a href="InserisciDipendente"><h3 align="center">Nuovo dipendente? Clicca qui!</h3>
</a>
</div>
</body>
</html>