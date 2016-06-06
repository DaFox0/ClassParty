
<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@ include file="/WEB-INF/views/static/header.jsp" %>

<div id="conteneur">
	<form:form id="formulaire_login" method="post" action="login" modelAttribute="eleve">
		<fieldset>
			<legend><spring:message code="form.login.legende"/></legend>
			<p class="champLogin">
				<label for="login"><spring:message code="form.login.pseudo"/></label>
				<form:input path="login" /> <br/><br/>
				<label for="password"><spring:message code="form.login.password"/></label>
				<form:input path="password"/>	
			</p>
			<input type="submit" name="loginSubmit" id="loginSubmit" value="<spring:message code="form.login.login"/>">
		</fieldset>
	</form:form>
</div> <!-- FIN CONTENEUR -->
<%@ include file="/WEB-INF/views/static/footer.jsp" %>