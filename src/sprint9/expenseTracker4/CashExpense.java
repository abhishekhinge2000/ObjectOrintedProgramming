package sprint9.expenseTracker4;

import java.time.LocalDate;

public class CashExpense extends Expense {
    public CashExpense(String name, double amount, String category, LocalDate dueDate) {
        super(name, amount, category, dueDate);
    }

    @Override
    public void displayExpense() {
        System.out.println("Cash Expense: " + name + " | Amount: " + amount +
                " | Category: " + category + " | Due: " + dueDate);
    }
}