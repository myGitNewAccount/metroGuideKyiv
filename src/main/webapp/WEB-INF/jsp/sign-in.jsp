<%-- 
    Document   : sign-in
    Created on : 01.07.2015, 0:38:19
    Author     : denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metro Guide</title>
	<link rel="stylesheet" type="text/css" href="${cp}/resources/css/style.css" />
    </head>
    <body class="sign-in-page">
        <div class="main">
			<div modelAttribute="personAttribute" class="sing-in-window">
                            <form:form method="POST" action="checkUser">
				<div class="sign-in-logo">Metro Guide</div>
				<div class="sign-in-textblock">Имя пользователя</div>
                                <form:input path="uEmail" type="text" class="sign-in-field" placeholder="Введите ваш логин"/>
				<div class="sign-in-textblock">Пароль</div>
				<form:input path="uPassword" type="text" class="sign-in-field" placeholder="Введите ваш пароль"/>
				<div class="sign-in-textblock"><p>Зарегистрироваться</p></div>
				<input type="submit" class="sign-in-button-form" value="Войти">         
                            </form:form>
			</div>
	</div>
    </body>
</html>