<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<s:url var="home" value="${request.contextPath}/"></s:url>
<s:url var="userregister"
	value="${request.contextPath}/userregisterform"></s:url>
<s:url var="loginform" value="${request.contextPath}/loginform"></s:url>
<s:url var="dashboard" value="${request.contextPath}/userdashboard"></s:url>
<s:url var="contacts" value="${request.contextPath}/usercontacts"></s:url>
<s:url var="logout" value="${request.contextPath}/userlogout"></s:url>

<c:if test="${sessionScope.name==null}">

	<nav class="navbar navbar-dark bg-dark  navbar-expand-lg">

		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">

			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="${home}">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="${loginform}">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="${userregister}">Register</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Contact
						Us</a></li>

			</ul>

		</div>
	</nav>

</c:if>
<c:if test="${sessionScope.name!=null}">

	<nav class="navbar navbar-dark bg-dark  navbar-expand-lg">

		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">

			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="${dashboard}">Dashboard</a></li>
				<li class="nav-item"><a class="nav-link" href="${contacts}">Contacts</a></li>
				<li class="nav-item"><a class="nav-link" href="${logout}">Logout</a></li>
				

			</ul>

		</div>
	</nav>

</c:if>
