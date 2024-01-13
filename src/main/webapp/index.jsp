<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<h1>Students</h1>

<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>First name</th>
    <th>Last name</th>
    <th>Email</th>
  </tr>
  </thead>

  <tbody>

  </tbody>
</table>
<%= request.getAttribute("students") %>
</body>
</html>