<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"
		 isELIgnored="false"
%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Управление проектами</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			
				<div class="form-group">
					<%--@declare id="project-name"--%>
						<label for="project-name">Имя</label>
					<span>${project.name}</span>
				</div>

				<div class="form-group">
					<%--@declare id="project_type"--%>
						<label for="project_type">Тип</label>
					<span>${project.type }</span>
				</div>
							
				<div class="form-group">
					<%--@declare id="sponsor"--%>
						<label for="sponsor">Заказчик</label>
					<span>${project.sponsor}</span>
				</div>
			
				<div class="form-group">
					<%--@declare id="funds"--%>
						<label for="funds">Утвержденный бюджет</label>
					<span>${project.authorizedFunds}</span>
				</div>
			
				<div class="form-group">
					<%--@declare id="hours"--%>
						<label for="hours">Утвержденный срок (ч)</label>
					<span>${project.authorizedHours}</span>
				</div>
			
				<div class="form-group">
					<label for="project-name">Описание</label>
					<span>${project.description}</span>
				</div>
				
				<div class="form-group">
					<%--@declare id="special"--%>
						<label for="special">Дополнительно</label>
					<span>${project.special == true ? 'Yes':'No'}</span>
				</div>
			
		</div>
	</div>
</body>
</html>