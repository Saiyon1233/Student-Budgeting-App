package helper;

public class Debt {
    private int id;
    private String email;
    private String debtName;
    private double amount;
    private double interestRate;
    private String dueDate;

    public Debt(int id, String email, String debtName, double amount, double interestRate, String dueDate) {
        this.id = id;
        this.email = email;
        this.debtName = debtName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.dueDate = dueDate;
    }

    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getDebtName() { return debtName; }
    public double getAmount() { return amount; }
    public double getInterestRate() { return interestRate; }
    public String getDueDate() { return dueDate; }
}
