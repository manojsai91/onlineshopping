package com.example.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/onlineshop";
    private String jdbcUsername = "root";
    private String jdbcPassword = "your_password";  // ✅ Replace with your MySQL password

    private static final String SELECT_ALL_PRODUCTS = "SELECT * FROM products";

    public List<Product> getAllProducts() throws Exception {
        List<Product> products = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement statement = connection.prepareStatement(SELECT_ALL_PRODUCTS);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                Product product = new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price")
                );
                products.add(product);
            }
        }

        return products;
    }
}
