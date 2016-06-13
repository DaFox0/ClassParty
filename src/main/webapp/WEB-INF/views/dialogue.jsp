<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@ include file="/WEB-INF/views/static/header.jsp" %>
	<section>
			<article id="section_status">			
				<div id="liste_membre">
					<p class="titre_liste_membre"><center>Les status des membres</center></p>
				</div><!-- FIN LISTE MEMBRE -->

				<div id="membre_connecter">

					<div class="status">
						<div class="status_connecter"></div>
						<p class="pseudo">Pseudo"boss" pseudo</p>
					</div>
					
					<div class="status">
						<div class="status_connecter"></div>
						<p class="pseudo">Pseudo"boss" pseudo</p>
					</div>

					<div class="status">
						<div class="status_non_connecter"></div>
						<p class="pseudo">Pseudo"boss" pseudo</p>
					</div>

				</div><!-- FIN MEMBRE CONNECTER -->
			</article><!-- FIN SECTION STATUS-->

			<aside id="section_tchat">
				
				<div id="tchat">
					<div id="message"> 
						<p class="dialogue_pseudo">Pseudo :</p>
						<p class="affichage_message">azoeiznezoeinazeazoeinzoeizneazoenizoeinazeoazineoazenazoenzaoeazneoazneoazn</p>
					</div>

				</div><!-- FIN TCHAT-->

				<form method="post" action="traitement.php">
					   <textarea class="texte_dialogue" name="pseudo" id="pseudo" placeholder="le message s'affiche ici "></textarea>

					   <input class="bouton" type="submit" value="Envoyer" ></code>	
				</form>

				
			</aside><!-- FIN SECTION TCHAT-->
			</section>

<%@ include file="/WEB-INF/views/static/footer.jsp" %>