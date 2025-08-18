package sprint7.ExpenseTracker2;

import java.time.LocalDate;

public class Expense {
    private String name;
    private double amount;
    private String category;
    private LocalDate dueDate;

    //counter to track total expenses
    private static int counter = 0;

    //Predefined categories
    public static final String[] CATEGORIES = {"Food", "Rent", "Transport", "Entertainment", "Other"};

    // Constructor
     public Expense(String name, double amount, String category, LocalDate dueDate){
         this.name = name;
         this.amount = amount;
         this.category = validateCategory(category);
         this.dueDate = dueDate;
         counter++;
     }

     //Validate category or set default "Other"
    private String validateCategory(String category){
         for(String cat : CATEGORIES){
             if(cat.equalsIgnoreCase(category)){
                 return cat;
             }
         }
         return "Others";
    }

    //Getter and Setter
    public String getName(){
         return name;
    }
    public void setName(String name){
         this.name = name;
    }

    public double getAmount(){
         return amount;
    }
    public void setAmount(double amount){
         this.amount = amount;
    }

    public String getCategory(){
         return category;
    }
    public void setCategory(String category){
         this.category = validateCategory(category);
    }

    public LocalDate getDueDate(){
         return dueDate;
    }
    public void setDueDate(LocalDate dueDate){
         this.dueDate = dueDate;
    }

    public static int getCounter(){
         return counter;
    }

    //Categories Expenses based on amount
    public String classifyExpense(){
         if(amount < 500 ){
             return "Low Spending";
         }
         else if( amount >= 500 && amount < 2000){
             return "Moderate Spending";
         }
         else if(amount >= 2000){
             return "High Spending";
         }
         return classifyExpense();
    }

    @Override
    public String toString(){
         return String.format("Name: %s, Amount: ₹%.2f, Category: %s, Due Date: %s, Type: %s",
                 name, amount, category, dueDate, classifyExpense());
    }
}
