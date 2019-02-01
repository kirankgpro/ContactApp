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
		
		<div style="border-style: groove; min-height: 450px;" >
		
			<div class="card-body">
				<h5 class="card-title">How We Help You</h5>
				<p class="card-text">Contact Application helps you to save all
					your precious contacts online. You can import and export contacts
					in csv format and download contacts in PDF format. It’s an easy app
					that keeps your contacts safe and secure!</p>

			</div>

		</div>
		
		<div class="footer-copyright text-center py-2  footer">
			© 2019 Copyright: <a> Contact App PVT LTD</a>
		</div>
		
	</div>
	
</body>
</html>