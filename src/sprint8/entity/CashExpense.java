package sprint8.entity;

public class CashExpense extends  Expense{
    private String paymentMode; //Cash, UPI, etc

    public CashExpense(String name, double amount, String category, String paymentMode){
        super(name, amount, category);
        this.paymentMode = paymentMode;
    }

    @Override
    public void displayExpenseDetails(){
        super.displayExpenseDetails();
        System.out.println("Payment Mode: " + paymentMode);
    }
}

