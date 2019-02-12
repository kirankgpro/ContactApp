<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
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
				<h5 class="card-title">Contacts</h5>
				<form action="${pageContext.request.contextPath}/savecontact" method="POST">
					
							<input type="hidden" class="form-control" name="contactId" value="${contact.contactId}"
								placeholder="id">
					
					
					<div class="form-group row">
						<label for="name" class="col-sm-2 col-form-label">Name</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name" value="${contact.name}"
								placeholder="Name">
						</div>
					</div>
					<div class="form-group row">
						<label for="phone" class="col-sm-2 col-form-label">Phone</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" name="phone" value="${contact.phone}"
								placeholder="97XXXXXXXX">
						</div>
					</div>
					<div class="form-group row">
						<label for="email" class="col-sm-2 col-form-label">Email</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" name="email" value="${contact.email}"
								placeholder="abc@example.com">
						</div>
					</div>
					<div class="form-group row">
						<label for="ddress" class="col-sm-2 col-form-label">Address</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="address" value="${contact.address}"
								placeholder="Address">
						</div>
					</div>
					<div class="form-group row">
						<label for="remark" class="col-sm-2 col-form-label">Remark</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="remark" value="${contact.remark}"
								placeholder="Remark">
						</div>
					</div>

					
					<div class="form-group row">
						<div class="col-sm-10">
							<button type="submit" class="btn btn-primary">Save</button>
							<button type="reset" class="btn btn-primary">Cancel</button>
						</div>
					</div>
				</form>
			<p style="color:red;">${msg}</p>
			</div>

		</div>

		<div class="footer-copyright text-center py-2  footer">
			© 2019 Copyright: <a> Contact App PVT LTD</a>
		</div>

	</div>

</body>
</html>