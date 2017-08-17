<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"
		 isELIgnored="false"
%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Управление проектами</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<link rel="stylesheet"
	href="<spring:url value="/resources/css/bootstrap-select.min.css"/>"
	type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script
	src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<h2>Please review the resource for accuracy</h2>

			<div class="form-group">
				<%--@declare id="project-name"--%>
					<label for="project-name">Название</label> <span>${resource.name}</span>
			</div>

			<div class="form-group">
				<%--@declare id="project_type"--%>
					<label for="project_type">Тип</label> <span>${resource.type }</span>
			</div>

			<div class="form-group">
				<label>Стоимость</label> <span>${resource.cost}</span>
			</div>

			<div class="form-group">
				<label>Еденица измерения</label> <span>${resource.unitOfMeasure}</span>
			</div>

			<div class="form-group">
				<label>Показатели</label>
				<c:forEach var="indicator" items="${resource.indicators}">
					<span>${indicator}</span>
				</c:forEach>
			</div>

			<a href="<spring:url value="/resource/add"/>" class="btn btn-default">Исправить</a>
			<a href="<spring:url value="/resource/save"/>"
				class="btn btn-default">Сохранить</a>
		</div>
	</div>
</body>
</html>