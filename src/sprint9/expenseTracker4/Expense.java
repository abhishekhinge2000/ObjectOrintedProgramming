package sprint9.expenseTracker4;

import java.time.LocalDate;


public abstract class Expense {
    protected String name;
    protected double amount;
    protected String category;
    protected LocalDate dueDate;

    public Expense(String name, double amount, String category, LocalDate dueDate) {
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.dueDate = dueDate;
    }

    // Abstract method
    public abstract void displayExpense();

    // Common Getters
    public String getName() { return name; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public LocalDate getDueDate() { return dueDate; }
}

