<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<s:url value="/static/css/index.css" var="indexcss"></s:url>
<s:url value="/static/image/bg.jpg" var="bgimg"></s:url>
<s:url value="/static/css/bootstrap.min.css" var="bootstrapcss"></s:url>
<s:url value="/static/js/bootstrap.min.js" var="bootstrapjs"></s:url>
<s:url value="/static/js/jquerymin.js" var="jqueryjs"></s:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${indexcss}" />
<link rel="stylesheet" href="${bootstrapcss}" />
<script src="${bootstrapjs}"></script>
<script src="${jqueryjs}"></script>

<title>Insert title here</title>
</head>
<body background=${bgimg}>

	<div class="container" width="80%">

		<h1 style="color: DarkBlue" align="center">Contact Application</h1>

		<jsp:include page="${contextPath}/WEB-INF/view/header.jsp" />

		<div style="border-style: groove; min-height: 450px;">
			<div class="card-body">
				<h5 class="card-title">Register</h5>
				<form method="post"
					action="${pageContext.request.contextPath}/loginauthenticate">
					<div class="form-group col-md-3">
						<label for="loginname">Login Name</label> <input type="text"
							class="form-control" name="name" placeholder="User Name" />
					</div>
					<div class="form-group col-md-3">
						<label for="Password">Password</label> <input type="password"
							class="form-control" name="password" placeholder="Password" />
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				<c:if test="${error!=null}">
					<div class="alert alert-danger" role="alert">${error}</div>
				</c:if>

			</div>

		</div>

		<div class="footer-copyright text-center py-2  footer">
			© 2019 Copyright: <a> Contact App PVT LTD</a>
		</div>

	</div>

</body>
</html>