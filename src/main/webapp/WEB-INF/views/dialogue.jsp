<%@ include file="/WEB-INF/views/static/header.jsp" %>
		<section id="section_status">	
			<div id="liste_membre">
				<p class="titre_liste_membre">Les status des membres</p>
			</div><!-- FIN LISTE MEMBRE -->
			<div id="membre_connecter">
				<div class="status">
					<div class="status_connecter"></div>
					<p class="pseudo">Pseudo"boss" pseudo</p>
				</div>
				<div id="clear"></div>
				<div class="status">
					<div class="status_connecter"></div>
					<p class="pseudo">Pseudo"boss" pseudo</p>
				</div>
				<div id="clear"></div>
				<div class="status">
					<div class="status_non_connecter"></div>
					<p class="pseudo">Pseudo"boss" pseudo</p>
				</div>
				<div id="clear"></div>
			</div><!-- FIN MEMBRE CONNECTER -->
		</section>
		<section id="section_tchat">
			<div id="tchat">
				<div id="message"> 
					<p class="dialogue_pseudo">Pseudo :</p>
					<p class="affichage_message">azoeiznezoeinazeazoeinzoeizneazoenizoeinazeoazineoazenazoenzaoeazneoazneoazn</p>
					<div id="clear"></div>
				</div>
			</div><!-- FIN TCHAT-->
			<form method="post" action="traitement.php">
				<textarea class="texte_dialogue" name="pseudo" id="pseudo" placeholder="le message s'affiche ici "></textarea>
				<input class="bouton" type="submit" value="Envoyer" />
			</form>
		</section>
		<div id="clear"></div>
<%@ include file="/WEB-INF/views/static/footer.jsp" %>