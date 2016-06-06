<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>${titre}</title>
		<spring:url value="/resources/images/logo_epsi.png" var="logoEpsi" />
		<spring:url value="/resources/css/commun.css" var="mainCss" />
		<spring:url value="/resources/js/jquery.1.10.2.min.js" var="jqueryJs" />
		<spring:url value="/resources/js/main.js" var="mainJs" />
		
		<link href="${mainCss}" rel="stylesheet" />
	    <script src="${jqueryJs}"></script>
	    <script src="${mainJs}"></script>
	</head>
<body>
