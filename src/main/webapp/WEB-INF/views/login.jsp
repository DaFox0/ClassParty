
<%@ include file="/WEB-INF/views/static/head.jsp" %>
<%@ include file="/WEB-INF/views/static/header.jsp" %>

<div id="conteneur">
	<form id="formulaire_login" method="post" action="login">
		<fieldset>
			<legend><spring:message code="form.login.legende"/></legend>
			<p class="champLogin">
				<label for="pseudo"><spring:message code="form.login.pseudo"/></label>
				<input type="text" name="pseudo" id="pseudo"/>
			</p>
			<p class="champLogin">
				<label for="password"><spring:message code="form.login.password"/></label>
				<input type="password" name="password" id="password" /> 			
			</p><br/>
			<input type="submit" name="loginSubmit" id="loginSubmit" value="<spring:message code="form.login.login"/>">
		</fieldset>
	</form>
</div> <!-- FIN CONTENEUR -->
<%@ include file="/WEB-INF/views/static/footer.jsp" %>