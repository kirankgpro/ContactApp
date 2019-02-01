<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
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

		<div style="border-style: groove; min-height: 450px; display: flex;">

			<div class="card-body">
				<h5 class="card-title">Register</h5>
				<c:choose>
					<c:when test="${usersave.equals('saved')}">
						<div class="alert alert-success" role="alert">
							User Registered
						</div>
					</c:when>
					<c:when test="${usersave.equals('notsaved')}">
				 	<div class="alert alert-primary" role="alert">
							User Not Registered
						</div>
				    </c:when>
					<c:otherwise>

					</c:otherwise>
				</c:choose>

				<f:form action="${pageContext.request.contextPath}/userregistersave"
					modelAttribute="command" method="POST">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="loginname">Login Name</label>
							<f:input type="text" class="form-control" path="user.loginName"
								placeholder="Login Name" />
							<f:errors class="error" path="user.loginName"></f:errors>
						</div>
						<div class="form-group col-md-6">
							<label for="Password">Password</label>
							<f:password class="form-control" path="user.password"
								placeholder="Password" />
							<f:errors class="error" path="user.password"></f:errors>
						</div>
					</div>
					<div class="form-group">
						<label for="UserName">User Name</label>
						<f:input class="form-control" path="user.name"
							placeholder="User Name" />
						<f:errors class="error" path="user.name"></f:errors>
					</div>
					<div class="form-group">
						<label for="Address">Address</label>
						<f:input class="form-control" path="user.address"
							placeholder="Apartment, studio, or floor" />
						<f:errors class="error" path="user.address"></f:errors>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="Email">Email</label>
							<f:input type="email" class="form-control" path="user.email"
								placeholder="example@abc.com" />
							<f:errors class="error" path="user.email"></f:errors>
						</div>
						<div class="form-group col-md-4">
							<label for="Phone">Phone</label>
							<f:input type="number" class="form-control" path="user.phone"
								placeholder="999xxxxxxx" />
							<f:errors class="error" path="user.phone"></f:errors>
						</div>

					</div>

					<button type="submit" class="btn btn-primary">Register</button>
				</f:form>

			</div>

		</div>

		<div class="footer-copyright text-center py-2  footer">
			© 2019 Copyright: <a> Contact App PVT LTD</a>
		</div>

	</div>

</body>
</html>