<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<spring:url value="/resources/css/main.css" var="mainCss" />
		<spring:url value="/resources/js/jquery.1.10.2.min.js" var="jqueryJs" />
		<spring:url value="/resources/js/main.js" var="mainJs" />
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
		Vous êtes connecté en tant que ${pseudo}
	
	</body>
</html>