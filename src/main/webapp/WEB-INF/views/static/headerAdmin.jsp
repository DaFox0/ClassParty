<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@page import="fr.classparty.models.Eleve"%>
		<header>
			<p id="logo">
				<a href="../accueil"><img src="${logoEpsi}" alt="logo" /></a>
			</p>
			<p id="logo_texte">
				EPSI <br> L'�cole d'Ing�nierie <br> Informatique 
			</p>
			<p id="titre">
				Bienvenue sur Class Party
			</p>
			<div class="menuBis">
				<a id="#logo" class="ongletAdmin" href="../accueil">Accueil</a>  
				<a id="#logo" class="ongletAdmin" href="logout">D�connexion</a>
			</div>
			<div id="clear"></div>
		</header>
		<nav id="menu">
			 <a id="onglet_debut" class="onglet" href="moderateur">Mod�rateur</a>  
			 <a id="onglet_deux" class="onglet" href="eleve">El�ve</a> 
			<div id="clear"></div>	
		</nav>
<div id="messageErreur">${messageErreur}</div>