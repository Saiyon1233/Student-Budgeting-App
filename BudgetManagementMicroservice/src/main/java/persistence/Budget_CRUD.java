package persistence;

import helper.Budget;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Budget_CRUD {
    public static boolean insertBudget(String email, String category, double amount) {
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO budgets (email, category, amount) VALUES (?, ?, ?)")) {
            stmt.setString(1, email);
            stmt.setString(2, category);
            stmt.setDouble(3, amount);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Budget> fetchBudgets(String email) {
        List<Budget> budgets = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM budgets WHERE email = ?")) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                budgets.add(new Budget(rs.getInt("id"), rs.getString("email"), rs.getString("category"), rs.getDouble("amount")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return budgets;
    }
}
