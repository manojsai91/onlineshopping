<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Product List</title>
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background-color: #f7f7f7;
      margin: 0;
      padding: 0;
    }

    .navbar {
      background-color: #ff3f6c;
      padding: 1rem 2rem;
      color: white;
      font-size: 1.5rem;
      font-weight: bold;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .container {
      max-width: 1000px;
      margin: 40px auto;
      padding: 20px;
      background-color: #ffffff;
      border-radius: 12px;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
      color: #333;
      margin-bottom: 30px;
    }

    .products {
      display: flex;
      justify-content: space-around;
      flex-wrap: wrap;
      gap: 20px;
    }

    .product-card {
      background-color: #fff0f4;
      padding: 20px;
      border-radius: 8px;
      width: 220px;
      box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
      text-align: center;
      transition: transform 0.2s ease;
    }

    .product-card:hover {
      transform: translateY(-5px);
    }

    .product-name {
      font-size: 1.2rem;
      font-weight: 600;
      color: #ff3f6c;
    }

    .price {
      color: #555;
      margin-top: 10px;
    }
  </style>
</head>
<body>
  <div class="navbar">My Store</div>

  <div class="container">
    <h2>Available Products</h2>
    <div class="products">
      <%
        String[] products = (String[]) request.getAttribute("products");
        for (String product : products) {
      %>
        <div class="product-card">
          <div class="product-name"><%= product %></div>
          <div class="price">₹ <%= (int)(Math.random() * 9000 + 1000) %></div>
        </div>
      <% } %>
    </div>
  </div>
</body>
</html>
