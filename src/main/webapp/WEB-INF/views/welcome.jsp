<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"
		 isELIgnored="false"
%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Управление проектам №</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>			

	<%--<div class="container">
		
		<h2>Перехвачен InternalResourceViewResolver</h2>

	</div>--%>
	<div class="container">

		<h2>Текущий проект</h2>
		<ul class="list-group">
			<li class="list-group-item"><label>Название проекта:</label><span>${currentProject.name }</span></li>
			<li class="list-group-item"><label>Заказчик:</label><span>${currentProject.sponsor.name }</span></li>
			<li class="list-group-item"><label>Информация:</label><br/><span>${currentProject.description }</span></li>
		</ul>

	</div>
</body>
</html>