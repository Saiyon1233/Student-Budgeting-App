package business;

import persistence.Budget_CRUD;
import helper.Budget;
import java.util.List;

public class BudgetBusiness {
    public static boolean addBudget(String email, String category, double amount) {
        return Budget_CRUD.insertBudget(email, category, amount);
    }

    public static List<Budget> getBudgets(String email) {
        return Budget_CRUD.fetchBudgets(email);
    }
}
