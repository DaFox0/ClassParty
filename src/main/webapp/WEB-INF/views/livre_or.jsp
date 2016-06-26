<%@ include file="/WEB-INF/views/static/header.jsp" %>
		<section class="section_anner">
			<div class="anner">
				<div class="barre_anner"></div>
				<div class="afficher_anner">2015</div>
				<div class="barre_anner"></div>
				<div id="clear"></div>
			</div>
			<div class="citation">
				<p class="citation_text">"Un datawarehouse c'est un personnage de fiction"</p>
				<div class="citation_auteur">Karim</div>
			</div>
		</section>
		<section class="section_anner">
			<div class="anner">
				<div class="barre_anner"></div>
				<div class="afficher_anner">2016</div>
				<div class="barre_anner"></div>
				<div id="clear"></div>
			</div>
			<div class="citation">
				<p class="citation_text">" Mais bien sûr qu'il y a un euro Espagnol !!!! "</p>
				<div class="citation_auteur">Karim</div>
			</div>
			<div class="citation">
				<p class="citation_text">" HIN .... HIN .. HIN HIN HIN HIN HINNNNNNNNNNNN !!!! "</p>
				<div class="citation_auteur">Karim</div>
			</div>
			<form class="form_livre_or" method="post" action="traitement.php">
				<textarea class="poster_citation" name="pseudo" id="pseudo" placeholder="Ecrivez la citation ici "></textarea><br>
				<input class="bouton_livre_or" class="bouton" type="submit" value="Envoyer">
			</form>
		</section>
		<div id="clear"></div>
<%@ include file="/WEB-INF/views/static/footer.jsp" %>