package sprint9.expenseTracker4;

import java.time.LocalDate;

public class DigitalExpense extends Expense {
    private String paymentType;
    private String transactionId;

    public DigitalExpense(String name, double amount, String category, LocalDate dueDate,
                          String paymentType, String transactionId) {
        super(name, amount, category, dueDate);
        this.paymentType = paymentType;
        this.transactionId = transactionId;
    }

    @Override
    public void displayExpense() {
        System.out.println("Digital Expense: " + name + " | Amount: " + amount +
                " | Category: " + category + " | Due: " + dueDate +
                " | Payment: " + paymentType + " | TxnID: " + transactionId);
    }
}