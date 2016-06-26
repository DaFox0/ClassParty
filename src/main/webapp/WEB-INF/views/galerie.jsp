<%@ include file="/WEB-INF/views/static/header.jsp" %>
		<form:form id="addImageForm" method="post" action="addImage" modelAttribute="photo">
		<fieldset>
			<legend><spring:message code="form.image.legende"/></legend>
			<p class="champAddImage">
				<label for="nom"><spring:message code="form.image.nom"/></label>
				<form:input path="nom" /> <br/><br/>
				<label for="srcImage"><spring:message code="form.image.parcourir"/></label>
				<input type="file" name="image"/>
			</p>
		</fieldset>
	</form:form>				
<%@ include file="/WEB-INF/views/static/footer.jsp" %>