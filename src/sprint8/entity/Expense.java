package sprint8.entity;

public class Expense {
    protected String name;
    public double amount;
    protected String category;

    public Expense(String name, double amount, String category){
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public void displayExpenseDetails(){
        System.out.println("Expense: " + name + " Amount: ₹" + amount + " Category: " + category);
    }
}
