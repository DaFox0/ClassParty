<%@ include file="/WEB-INF/views/static/header.jsp" %>
<section>
	<center><h1>Bienvenue sur ole livre d'or</h1></center>
			<article class="section_anner">
				<div class="anner">
					<div class="barre_anner"></div>
					<div class="afficher_anner">2015</div>
					<div class="barre_anner"></div>
					<div id="clear"></div>
				</div>

				<div class="citation">
					<p class="citation_text">" data center ??? c'est un héro de comic "</p>
					<div class="citation_auteur">Karim</div>
				</div>
			</article>


				<form class="form_livre_or" method="post" action="traitement.php">
					   <textarea class="poster_citation" name="pseudo" id="pseudo" placeholder="écrivez la citation ici "></textarea><br>

					<input class="bouton_livre_or" class="bouton" type="submit" value="Envoyer">
				</form>
</section>

<%@ include file="/WEB-INF/views/static/footer.jsp" %>