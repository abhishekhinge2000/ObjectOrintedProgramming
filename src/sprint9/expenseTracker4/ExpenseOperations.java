package sprint9.expenseTracker4;

public interface ExpenseOperations {
    void addExpense(Expense expense);
    void viewExpenses();
    double calculateTotal();
    void shortExpenses();
    void searchByDescription(String keyword);
    void filterByCategory();
    void searchByKeyword(String keyword);


}
