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
				<h5 class="card-title">Dashboard</h5>

				<p>Welcome ${sessionScope.name}, manage all your contacts by
					adding, updating and removing.</p>
			</div>
			<table class="table table-striped">
				<thead>
					<tr>

						<th scope="col">sl no</th>
						<th scope="col">Name</th>
						<th scope="col">Phone</th>
						<th scope="col">Email</th>
						<th scope="col">Address</th>
						<th scope="col">Remark</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${contacts}" var="contact" varStatus="vs">
						<tr>
							<th scope="row">${vs.count}</th>
							<td>${contact.name }</td>
							<td>${contact.phone }</td>
							<td>${contact.email }</td>
							<td>${contact.address }</td>
							<td>${contact.remark }</td>
							<td><a
								href="${pageContext.request.contextPath}/usercontacts/${contact.contactId}">Edit</a>&nbsp;
								<a
								href="${pageContext.request.contextPath}/usercontactdelete/${contact.contactId}">Delete</a></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<c:if test="${contactstatus!=null && contactstatus==false }"><p>Contact not Deleted</p></c:if>
		<c:if test="${contactstatus!=null && contactstatus!=false }"><p>Contact Deleted</p></c:if>
		<div class="footer-copyright text-center py-2  footer">
			© 2019 Copyright: <a> Contact App PVT LTD</a>
		</div>

	</div>

</body>
</html>