<%@ include file="/WEB-INF/views/static/headerConnexion.jsp" %>
		<section>
			<form:form id="formulaire_login" method="post" action="login" modelAttribute="eleve">
				<fieldset>
					<legend><spring:message code="form.login.legende"/></legend>
					<p class="champLogin">
						<label for="login"><spring:message code="form.login.pseudo"/></label>
						<form:input path="login" /> <br/><br/>
						<label for="password"><spring:message code="form.login.password"/></label>
						<form:input type="password" path="password"/>	
					</p>
					<input type="submit" name="loginSubmit" id="loginSubmit" value="<spring:message code="form.login.login"/>">
					<div id="clear"></div>
				</fieldset>
			</form:form>
		</section>
<%@ include file="/WEB-INF/views/static/footer.jsp" %>