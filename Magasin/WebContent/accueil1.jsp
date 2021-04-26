
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="Model.Internaute" %>
<%@page import="java.util.List" %>

<fmt:setLocale value="<%=request.getLocale()%>"/>
<fmt:setBundle basename="messages" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>accueil1</title>
</head>

<body>
<h1><fmt:message key="label.w" /> <% 
		@SuppressWarnings("unchecked")
		List<Internaute> ct = (List<Internaute>) request.getAttribute("Internaute");
		for(Internaute internaute :ct){
	%>
	<%=internaute.getNom()%>
	<%
		}
	%>
	${name.nom}

	</h1>
	<a href="Catalogue.jsp"><fmt:message key="label.consult" /></a>
	<a href="construction.jsp"><fmt:message key="label.prs" /></a>
	<a href="construction.jsp"><fmt:message key="label.bskt" /></a>
</body>
</html>