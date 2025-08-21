package sprint9.expenseTracker4;

import java.util.*;

public class ExpenseManager implements ExpenseOperations {
    private List<Expense> expenses = new ArrayList<>();

    @Override
    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    @Override
    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        for (Expense e : expenses) {
            e.displayExpense();
        }
    }

    @Override
    public double calculateTotal() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    @Override
    public void sortExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        expenses.sort(Comparator.comparingDouble(Expense::getAmount));
        System.out.println("Expenses sorted successfully!");
        viewExpenses();
    }

    @Override
    public void searchByDescription(String desc) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getName().equalsIgnoreCase(desc)) {
                System.out.println("Expense found at position: " + i);
                return;
            }
        }
        System.out.println("Expense not found!");
    }

    @Override
    public void filterByCategory(String category) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        expenses.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase(category))
                .forEach(Expense::displayExpense);
    }

    @Override
    public void searchByKeyword(String keyword) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        boolean found = false;
        for (Expense e : expenses) {
            if (e.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + e.getName() + " | Amount: " + e.getAmount());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Expense not found!");
        }
    }
}