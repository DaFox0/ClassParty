
<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@ include file="/WEB-INF/views/static/header.jsp" %>

	<div id="conteneur">
		<div id="menu">
			 <a id="onglet_debut" class="onglet" href="dialogue.html">TCHAT</a>  
			 <a id="onglet_deux" class="onglet" href="http://www.w3schools.com">GALLERIE IMAGE</a>
			 <a id="onglet_trois" class="onglet" href="livre_or.html">LIVRE D'OR</a>
			  <a id="onglet_quatre" class="onglet" href="http://www.w3schools.com">COURS</a>
			  <div id="clear"></div>   
		</div>

		<div id="exp_fil">
			<div id="explication">
				<p>Tchat : dans cette partie, vous allez pouvoir communiquer avec vos camarade de classe</p>
				<p>Gallerie d'image : vous allez pouvoir consulter des images de vos commarades et poster les votre.</p>
				<p>Livre d'or : dans cette secion, vous trouvrez les perles entendu en cours par vos camarades. Et bien entendu, vous pouvez poster les votres.</p>
				<p>Cours : dans cette partie, vous allez pouvoir renger, classer vos supports de cours, cours par matières.</p>
			</div>
			<div id="fil_actus">
				<p>Mettre le fil d'actualité</p>						
			</div>
		</div>
	</div> <!-- FIN CONTENEUR -->
<%@ include file="/WEB-INF/views/static/footer.jsp" %>