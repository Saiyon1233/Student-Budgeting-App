package helper;

public class ReportTip {
    private int id;
    private String email;
    private String reportText;
    private String tip;

    public ReportTip(int id, String email, String reportText, String tip) {
        this.id = id;
        this.email = email;
        this.reportText = reportText;
        this.tip = tip;
    }

    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getReportText() { return reportText; }
    public String getTip() { return tip; }
}
