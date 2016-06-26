<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@page import="fr.classparty.models.Eleve"%>
		<header>
			<p id="logo">
				<a href="accueil"><img src="${logoEpsi}" alt="logo" /></a>
			</p>
			<a id="logo_texte" href="accueil">
				EPSI <br> L'école d'Ingénierie <br> Informatique 
			</a>
			<p id="titre">
				Bienvenue sur Class Party
			</p>
			<div id="clear"></div>
		</header>
		<nav id="menu">
			<a id="onglet_debut" class="onglet" href="tchat">Chat</a>
			<a id="onglet_deux" class="onglet" href="galerie">Galeries</a>
			<a id="onglet_trois" class="onglet" href="livre">Livre d'or</a>
			<a id="onglet_quatre" class="onglet" href="http://www.w3schools.com">Cours</a>
			<c:if test="${activeSession.getType() >= 2}">
   				<a id="onglet_quatre" class="onglet" href="#">Admin</a>
			</c:if>
			<a id="onglet_cinq" class="onglet" href="logout">Déconnexion</a>
			<div id="clear"></div>	
		</nav>
<div id="messageErreur">${messageErreur}</div>