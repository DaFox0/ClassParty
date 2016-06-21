<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@page import="fr.classparty.models.Eleve"%>

<header>
	<div class="header">
		<div id="logo">
			<img src="${logoEpsi}" alt="logo" />
		</div>
		<div id="logo_texte">
			EPSI <br> L'école d'Ingénierie <br> Informatique 
		</div>
		<div id="titre">
			<center>Bienvenue sur Class Party</center>
			<nav>

					<a id="onglet_debut" class="onglet" href="tchat">TCHAT</a>
			     	<a id="onglet_deux" class="onglet" href="http://www.w3schools.com">GALLERIE IMAGE</a>
			     	<a id="onglet_trois" class="onglet" href="livre">LIVRE D'OR</a>
			     	<a id="onglet_quatre" class="onglet" href="http://www.w3schools.com">COURS</a>
					<a id="onglet_quatre" class="onglet" href="logout">Deconnexion</a>
					<c:if test="${activeSession.getType() >= 2}">
   						<a id="onglet_quatre" class="onglet" href="">Admin</a>
					</c:if>
			
					
			</nav>
		</div>
	</div>
</header>
<div id="messageErreur">${messageErreur}</div>