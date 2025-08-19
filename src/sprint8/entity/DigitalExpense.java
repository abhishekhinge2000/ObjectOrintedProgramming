package sprint8.entity;

public class DigitalExpense extends Expense {
    private String paymentMode;
    private String transactionId;

    public DigitalExpense(String name, double amount, String category, String paymentMode, String transactionId){
        super(name, amount, category);
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }

    @Override
    public void displayExpenseDetails(){
        super.displayExpenseDetails();
        System.out.println("Payment Mode: " + paymentMode + ", Transaction ID: " + transactionId);
    }
}
