package persistence;

import helper.Debt;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Debt_CRUD {
    public static boolean insertDebt(String email, String debtName, double amount, double interestRate, String dueDate) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO debt (email, debt_name, amount, interest_rate, due_date) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setString(1, email);
            stmt.setString(2, debtName);
            stmt.setDouble(3, amount);
            stmt.setDouble(4, interestRate);
            stmt.setString(5, dueDate);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Debt> fetchDebts(String email) {
        List<Debt> debts = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM debt WHERE email = ?")) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                debts.add(new Debt(rs.getInt("id"), rs.getString("email"), rs.getString("debt_name"), rs.getDouble("amount"),
                                   rs.getDouble("interest_rate"), rs.getString("due_date")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return debts;
    }
}
