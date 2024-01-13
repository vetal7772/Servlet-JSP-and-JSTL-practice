<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vit_s
  Date: 10.01.2024
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create student</h1>

<c:if test="${not empty user}">
    <form>
        <label>Id</label>
        <br/>
        <input> type="text" name="id" value=${user.id}"/>
        <label>First name</label>
        <input> type="text" name="firstName" value=${user.firstName}"/>
        <br/>

        <label>First name</label>
        <input> type="text" name="firstName" value=${user.firstName}"/>
        <br/>

        <label>Last name</label>
        <input> type="text" name="lastName" value=${user.lastName}"/>
        <br/>

        <label>Email</label>
        <input> type="text" name="email" value=${user.email}"/>
        <br/>

        <input type="submit" value="Save"/>
    </form>



</c:if>

</body>
</html>
