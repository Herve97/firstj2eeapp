<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<% 
 String nom = request.getParameter("nom");
%>
<body>
  <li> Nom: <%=nom %> </li>
</body>
</html>