package persistence;

import helper.UserSession;
import java.sql.*;

public class Frontend_CRUD {
    public static UserSession verifyUser(String email, String password) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?")) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new UserSession(email, true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new UserSession(email, false);
    }
}
