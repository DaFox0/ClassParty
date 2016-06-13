<%@page import="fr.classparty.models.Eleve"%>
<header>
	<div id="header">
		<div id="logo">
			<img src="${logoEpsi}" alt="logo" />
		</div>
		<div id="logo_texte">
			EPSI <br> L'école d'Ingénierie <br> Informatique 
		</div>
		<div id="titre">
			<center>Bienvenue sur Class Party</center>
			<nav>
					<LI><a id="onglet_debut" class="onglet" href="tchat">TCHAT</a></li> 
			     	<li><a id="onglet_deux" class="onglet" href="http://www.w3schools.com">GALLERIE IMAGE</a></li>
			     	<li><a id="onglet_trois" class="onglet" href="livre">LIVRE D'OR</a></li>
			     	<li><a id="onglet_quatre" class="onglet" href="http://www.w3schools.com">COURS</a></li>	
					<li><a id="onglet_quatre" class="onglet" href="logout">Deconnexion</a></li>	
					<li><a id="onglet_quatre" class="onglet" href="logout">Admin</a></li>	
			</nav>
		</div>
	</div>
</header>
<div id="messageErreur">${messageErreur}</div>