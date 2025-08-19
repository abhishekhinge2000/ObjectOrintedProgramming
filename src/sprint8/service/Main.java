package sprint8.service;

import sprint7.ExpenseTracker2.Expense;
import sprint8.entity.*;

import java.time.LocalDate;
import java.util.Scanner;
import sprint8.service.ExpenseManager;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Expense: ");
        int n = scanner.nextInt();

        ExpenseManager manager = new ExpenseManager(n);

        while(true){
            System.out.println("\n====Expense Tracker Menu===");

            System.out.println("1. Add Expenses");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Exit");

            System.out.println("Enter Your Choice: ");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    if(manager != null){
                        System.out.println("Enter Expense name: ");
                        String name = scanner.next();

                        System.out.println("Enter Amount: ₹");
                        double amount = scanner.nextDouble();

                        System.out.println("Choose Category: ");

                        System.out.println("1. Food\n2. Rent\n3. Transport\n4. Entertainment\n5. Others");

                        int catChoice = scanner.nextInt();
                        String category = switch(catChoice){
                            case 1 -> "Food";
                            case 2 -> "Rent";
                            case 3 -> "Transport";
                            case 4 -> "Entertainment";
                            default -> "Others";

                        };


                        System.out.println("Payment type (1. Cash / 2. Digital): ");
                        int payType = scanner.nextInt();

                        if(payType == 1){
                            manager.addExpense(new CashExpense(name, amount, category, "Cash"));
                        }
                        else{
                            System.out.println("Enter payment mode (UPI/Card/NetBanking): ");
                            String mode = scanner.next();

                            System.out.println("Enter Transaction ID: ");
                            String txn = scanner.next();

                            manager.addExpense(new DigitalExpense(name, amount, category, mode, txn));
                        }
                    }
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    manager.calculateTotal();

                case 4:
                    System.out.println("Exiting Expense Tracker. Goodbye");

                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again. ");
            }
        }
    }
}
