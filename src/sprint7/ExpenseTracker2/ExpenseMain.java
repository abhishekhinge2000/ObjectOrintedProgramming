package sprint7.ExpenseTracker2;

import sprint7.ExpenseTracker2.Expense;
import java.time.LocalDate;
import java.util.Scanner;

public class ExpenseMain {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);


        Expense[] expenses = new Expense[100]; //Fixed size array
        int count = 0;

        System.out.println("===Expense Tracker===");

        while(true){
            System.out.println("Enter Expense Name: ");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("exit"))
                break;

            System.out.println("Enter Amount ₹: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Choose Category: ");

            for(int i = 0; i < Expense.CATEGORIES.length; i++){
                System.out.println((i + 1) + ". " + Expense.CATEGORIES[i]);
            }

            int choice = Integer.parseInt(scanner.nextLine());
            String category = (choice >= 1 && choice <= Expense.CATEGORIES.length ) ? Expense.CATEGORIES[choice - 1]: "Other";

            System.out.println("Enter due date(e.g., 2025-03-15): ");
            LocalDate dueDate = LocalDate.parse(scanner.nextLine());

            expenses[count++] = new Expense(name, amount, category, dueDate);
        }

        //Summary
        System.out.println("\n=== Expense Summary ===");
        for(int i = 0; i < count; i++){
            System.out.println(expenses[i]);
        }
        System.out.println("\nTotal Expenses Recorded: " + Expense.getCounter());
        scanner.close();
    }
}
