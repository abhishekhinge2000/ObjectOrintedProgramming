package sprint10;

import java.util.InputMismatchException;
import java.util.Scanner;

//  Customer Exception for insufficient funds
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

   //Constructor
public class BankingApplication {
       private double balance;

       //Constructor
       public BankingApplication(double balance) {
           this.balance = balance;
       }

       //Withdraw method
       public void withdraw(double amount) throws InsufficientFundsException{
               if (amount == 0) {
                   System.out.println("Amount cannot be Zero: ");
               } else if (amount < 0) {
                   System.out.println("Amount cannot be negative");
               } else if (amount > balance) {
                   throw new InsufficientFundsException("Insufficient found for this transaction.");
               } else {
                   balance -= amount;
                   System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
               }
           }
           public static void main (String[]args){
               Scanner scanner = new Scanner(System.in);
               BankingApplication account = new BankingApplication(5000); // Initial balance ₹ 5000

               try {
                   System.out.println("Enter a Withdraw: ₹");
                   double amount = scanner.nextDouble();
                   account.withdraw(amount);
               } catch (InsufficientFundsException e) {
                   System.out.println(e.getMessage());
               } catch (InputMismatchException e) {
                   System.out.println("Invalid input! Please enter a numeric value.");
               } catch (Exception e) {
                   System.out.println("Unexpected error: " + e.getMessage());
               } finally {
                   scanner.close();
               }
           }
       }

