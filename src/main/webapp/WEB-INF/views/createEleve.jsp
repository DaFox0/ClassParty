<%@ include file="/WEB-INF/views/static/header.jsp" %>
		<section>
			<form:form method="post" action="addEleve" modelAttribute="eleve">
				<fieldset>
					<!-- <label> Classe :</label>
					<select>
						<option value="I4"> I4 </option>
					</select>
					<input type="radio" name="type" value="0"> Eleve<br>
					<input type="radio" name="type" value="1"> Mod�rateur<br>
					<input type="radio" name="type" value="2"> Administrateur<br> -->
					<legend><spring:message code="form.creation.legende"/></legend>
					<p class="champLogin">
						<label for="nom"><spring:message code="form.eleve.nom"/></label>
						<form:input path="nom" /> <br/><br/>
						<label for="prenom"><spring:message code="form.eleve.prenom"/></label>
						<form:input path="prenom"/>	<br/><br/>
						<label for="date"><spring:message code="form.eleve.dateNaissance"/></label>
						<form:input type="date" path="dateNaissance"/>	
					</p>
					<input type="submit" name="loginSubmit" id="loginSubmit" value="<spring:message code="form.eleve.creation"/>">
					<div id="clear"></div>
				</fieldset>
			</form:form>
		</section>
<%@ include file="/WEB-INF/views/static/footer.jsp" %>