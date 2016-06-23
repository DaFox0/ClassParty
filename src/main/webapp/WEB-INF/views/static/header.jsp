<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@page import="fr.classparty.models.Eleve"%>
		<header>
			<p id="logo">
				<img src="${logoEpsi}" alt="logo" />
			</p>
			<p id="logo_texte">
				EPSI <br> L'école d'Ingénierie <br> Informatique 
			</p>
			<p id="titre">
				Bienvenue sur Class Party
			</p>
			<div id="clear"></div>
		</header>
		<nav id="menu">
			<a id="onglet_debut" class="onglet" href="tchat">TCHAT</a>
			<a id="onglet_deux" class="onglet" href="http://www.w3schools.com">GALLERIE IMAGE</a>
			<a id="onglet_trois" class="onglet" href="livre">LIVRE D'OR</a>
			<a id="onglet_quatre" class="onglet" href="http://www.w3schools.com">COURS</a>
			<c:if test="${activeSession.getType() >= 2}">
	   			<a id="onglet_quatre" class="onglet" href="">Admin</a>
			</c:if>
			<a id="onglet_quatre" class="onglet" href="logout">Deconnexion</a>
			<div id="clear"></div>	
		</nav>
<div id="messageErreur">${messageErreur}</div>