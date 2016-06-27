<%@ include file="/WEB-INF/views/static/headerAdmin.jsp" %>
		<section>
		<h1>Affichage des éléves</h1>
			<table class="listeEleve">
				<tr>
					<th>ID</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Date de naissance</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${eleves}" var="ele">
				<tr>
					<td>${ele.idEleve}</td>
					<td>${ele.nom}</td>
					<td>${ele.prenom}</td>
					<td>${ele.dateNaissance}</td>
					<td><button><a href="editEleve?idEle=${ele.idEleve}">Modifier</a></button><button><a href="deleteEleve?idEle=${ele.idEleve}">Supprimer</a></button></td>
				</tr>
				</c:forEach>
			</table>
		</section>
<%@ include file="/WEB-INF/views/static/footer.jsp" %>		