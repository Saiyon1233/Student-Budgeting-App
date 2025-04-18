package business;

import persistence.Debt_CRUD;
import helper.Debt;
import java.util.List;

public class DebtBusiness {
    public static boolean addDebt(String email, String debtName, double amount, double interestRate, String dueDate) {
        return Debt_CRUD.insertDebt(email, debtName, amount, interestRate, dueDate);
    }

    public static List<Debt> getDebts(String email) {
        return Debt_CRUD.fetchDebts(email);
    }
}
