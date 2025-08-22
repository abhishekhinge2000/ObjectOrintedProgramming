package sprint9.expenseTracker4;

public interface ExpenseOperations {
    void addExpense(Expense expense);
    void viewExpenses();
    double calculateTotal();
    void sortExpenses();
    void searchByDescription(String keyword);
    void filterByCategory(String category);
    void searchByKeyword(String keyword);

}
