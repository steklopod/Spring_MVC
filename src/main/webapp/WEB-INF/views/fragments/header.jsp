<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--<%@ page pageEncoding="windows-1251" contentType="text/html;charset=UTF-8; charset=windows-1251" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"
		 isELIgnored="false"
%>

<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="#">Управление проектами</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    		
    			<li><a href="<spring:url value = "/"/>">Главная</a></li>

    			<li class="dropdown">
          			
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Проекты <span class="caret"></span></a>
          	
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/project/add"/>">Добавить</a></li>
            			<li><a href="<spring:url value="/project/find"/>">Найти</a></li>
          			</ul>
          			
        		</li>
        		
    			<li class="dropdown">
          		
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Ресурсы <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
						<li><a href="<spring:url value="/project/add"/>">Добавить</a></li>
						<li><a href="<spring:url value="/project/find"/>">Найти</a></li>
          			</ul>
        		
        		</li>
				<li>${currentDate}</li>        		
    		</ul>
    		
		</div>
</nav>