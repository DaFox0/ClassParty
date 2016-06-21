<%@ include file="/WEB-INF/views/static/header.jsp" %>
		<section>
			<article id="explication">
				<p>Tchat : Dans cette partie, vous allez pouvoir communiquer avec vos camarade de classe</p>
				<p>Gallerie d'image : Vous allez pouvoir consulter des images de vos commarades et poster les votre.</p>
				<p>Livre d'or : Dans cette secion, vous trouvrez les perles entendu en cours par vos camarades. Et bien entendu, vous pouvez poster les votres.</p>
				<p>Cours : Dans cette partie, vous allez pouvoir renger, classer vos supports de cours, cours par matières.</p>
				<p>Bonjour ${activeSession.login}</p>
			</article>
			<aside id="fil_actus">
				<h1><center>Fil d'actualité</center></h1>	
			</aside>
		</section>					
<%@ include file="/WEB-INF/views/static/footer.jsp" %>