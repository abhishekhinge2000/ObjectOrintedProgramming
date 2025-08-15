//Sprint:-6 Ex:-1

package sprint6.ExpenseTracker1;

import com.sun.source.doctree.SystemPropertyTree;

public class Expense {
    private String description ;
    private double amount;
    private String category;
    private String date;

    //Constructor with default
    public Expense(String description, double amount){
        this(description, amount, "Miscellaneous", "01-01-2025");
    }

    //Constructor with all details
    public Expense(String description, double amount, String category, String date){
        this.description = description;
        this.amount = amount;
        this.category = (category == null || category.isEmpty()) ? "Miscellaneous" : category;
        this.date = date;
    }

    //Method to classify expense
    public String classifyExpense(){
        if(amount < 500){
            return "Low expense recorded";
        } else if (amount >= 500 && amount <= 1999) {
            return "Moderate expense recorded";
        } else if (amount >= 2000) {
            return "High expense recorded";
        }
        return classifyExpense();
    }

    //Method to print expense details
    public void displayExpenseDetails(){
        System.out.println("Expense Details");

        System.out.println("Date: " + date);
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Amount: " + amount);

        System.out.println("CategoryAssessment: " + classifyExpense());
    }

}
