<%@ page contentType="text/html; charset=UTF-8" language="java" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Справочник контактов</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/common.css" rel="stylesheet">
</head>
<body>
<div id="wrap">
    <div class="container">
        <div class="page-header">
            <h2>Справочник контактов</h2>
        </div>
        <div class="well">
            <a href="/java_dee/create" class="btn btn-success">Новый контакт</a>
            <a href="#!" class="btn btn-danger">Удалить</a>
            <a href="/java_dee/send-mail" class="btn">Отправить письмо</a>
            <a href="/java_dee/search" class="btn">Поиск</a>
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
                <c:forEach items="${requestScope.allRecords}" var="record">
                <tr>
                    <td><input type="checkbox" checked="checked"></td>
                    <td><a href="create?record=<c:out value="${record.getEmail()}"></c:out>">
                        <c:out value="${record.getFullName()}"></c:out>
                    </a></td>
                    <td><c:out value="${record.getBirthDate()}"></c:out></td>
                    <td><c:out value="${record.getAddress()}"></c:out></td>
                    <td><c:out value="${record.getWorkplace()}"></c:out></td>
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