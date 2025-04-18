package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    String dbHost = System.getenv("Frontend_DB_Host");
    String url = "jdbc:mysql//" + dbhost + ":3306/frontend_db";
    private static final String USER = "root"; // Change to your MySQL username
    private static final String PASSWORD = "#RIDman5"; // Change to your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure MySQL JDBC Driver is loaded
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL JDBC Driver not found.", e);
        }
    }
}
