<%@ page contentType="text/html; charset=UTF-8" language="java" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Справочник контактов</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/common.css" rel="stylesheet">
</head>
<body>
<div id="wrap">
    <div class="container">
        <div class="page-header">
            <h2>Справочник контактов</h2>
        </div>
        <div class="well">
            <a href="/create" class="btn btn-success">Новый контакт</a>
            <a href="#!" class="btn btn-danger">Удалить</a>
            <a href="/send-mail" class="btn">Отправить письмо</a>
            <a href="/search" class="btn">Поиск</a>
        </div>
        <div class = "well vspace">
            <table class="table">
                <thead>
                <tr>
                    <th></th>
                    <th>Имя</th>
                    <th>Дата рождения</th>
                    <th>Адрес</th>
                    <th>Место работы</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.elContainer}" var="element">
                <tr>
                    <td><input type="checkbox" checked="checked"></td>
                    <td><a href="edit/<c:out value="${element.getId()}"></c:out>">
                        <c:out value="${element.getName()}"></c:out>
                    </a></td>
                    <td><c:out value="${element.getName()}"></c:out></td>
                    <td><c:out value="${element.getName()}"></c:out></td>
                    <td><c:out value="${element.getName()}"></c:out></td>
                </tr>
                </c:forEach>
                </tbody>
            </table>            
            <ul class="pager">
                <li class="<c:out value="${requestScope.pageConfig.hasPrevious ? \"previous\" : \"previous disabled\"}"></c:out>">
                    <a href="<c:out value="${requestScope.pageConfig.hasPrevious ? \"/previous-page\" : \"#!\"}"></c:out>">&larr; Предыдущая</a>
                </li>
                <li class="<c:out value="${requestScope.pageConfig.hasNext ? \"next\" : \"next disabled\"}"></c:out>">
                    <a href="<c:out value="${requestScope.pageConfig.hasNext ? \"/next-page\" : \"#!\"}"></c:out>">Следующая &rarr;</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>