package helper;

public class Budget {
    private int id;
    private String email;
    private String category;
    private double amount;

    public Budget(int id, String email, String category, double amount) {
        this.id = id;
        this.email = email;
        this.category = category;
        this.amount = amount;
    }

    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
}
