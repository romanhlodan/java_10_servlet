<%--
  Created by IntelliJ IDEA.
  User: stigm
  Date: 06.04.2021
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

<h1>Корстувач з ID - ${q.id}</h1>
<p>Прізвище, ім'я: ${q.lname} ${q.fname}</p>
<p>Вік: ${q.age}р.</p>
<p>Пошта: ${q.e_mail}</p>
<p>Освіта: ${q.education}.</p>


</body>
</html>
