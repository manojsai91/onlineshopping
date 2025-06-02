package com.example.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String[] products = { "Laptop", "Phone", "Tablet" };
    request.setAttribute("products", products);
    RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
    dispatcher.forward(request, response);
  }
}
