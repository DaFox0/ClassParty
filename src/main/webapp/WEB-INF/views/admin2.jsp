<%@ include file="/WEB-INF/views/static/header.jsp" %>
	<section>
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
				<td><button><a href="">Modifier</a></button><button><a href="">Supprimer</a></button></td>
			</tr>
			</c:forEach>
		</table>
	</section>
<%@ include file="/WEB-INF/views/static/footer.jsp" %>