package business;

import persistence.ReportTips_CRUD;
import helper.ReportTip;
import java.util.List;

public class ReportTipsBusiness {
    public static boolean addReport(String email, String reportText, String tip) {
        return ReportTips_CRUD.insertReport(email, reportText, tip);
    }

    public static List<ReportTip> getReports(String email) {
        return ReportTips_CRUD.fetchReports(email);
    }
}
