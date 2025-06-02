<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Product List</title>
</head>
<body>
  <h2>Available Products</h2>
  <ul>
    <%
      String[] products = (String[]) request.getAttribute("products");
      for (String product : products) {
    %>
    <li><%= product %></li>
    <% } %>
  </ul>
</body>
</html>
