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
			<div class="menuBis">
			<c:if test="${activeSession.getType().getIdTypeUtilisateur() >= 2}">
 				<a id="#logo" class="ongletAdmin" href="admin/">Admin</a>
			</c:if>
				<a id="#logo" class="ongletAdmin" href="logout">Déconnexion</a>
			</div>
			<div id="clear"></div>
		</header>
		<nav id="menu">
			<a id="onglet_debut" class="onglet" href="tchat">Tchat</a>
			<a id="onglet_deux" class="onglet" href="galerie">Galerie image</a>
			<a id="onglet_trois" class="onglet" href="livre">Livre d'or</a>
			<a id="onglet_quatre" class="onglet" href="#">Cours</a>
			<div id="clear"></div>	
		</nav>
<div id="messageErreur">${messageErreur}</div>