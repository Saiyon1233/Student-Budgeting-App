package persistence;

import helper.ReportTip;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReportTips_CRUD {
    public static boolean insertReport(String email, String reportText, String tip) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO reports (email, report_text, tip) VALUES (?, ?, ?)")) {
            stmt.setString(1, email);
            stmt.setString(2, reportText);
            stmt.setString(3, tip);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<ReportTip> fetchReports(String email) {
        List<ReportTip> reports = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM reports WHERE email = ?")) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                reports.add(new ReportTip(rs.getInt("id"), rs.getString("email"), rs.getString("report_text"), rs.getString("tip")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reports;
    }
}
