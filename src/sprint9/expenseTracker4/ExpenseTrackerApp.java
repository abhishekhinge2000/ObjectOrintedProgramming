package sprint9.expenseTracker4;

import java.time.LocalDate;
import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\nExpense Tracker Menu ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Sort Expenses");
            System.out.println("5. Search for an Expense");
            System.out.println("6. Filter by Expense Type");
            System.out.println("7. Search by Keyword in Expense Description");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Choose Category: Food, Rent, Transport, Entertainment, Others");
                    String category = sc.nextLine();
                    System.out.print("Enter due date (yyyy-MM-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    System.out.println("Enter 1 for Cash, 2 for Digital Payment: ");
                    int type = sc.nextInt(); sc.nextLine();
                    if (type == 1) {
                        manager.addExpense(new CashExpense(name, amount, category, date));
                    } else {
                        System.out.print("Enter type of digital payment: ");
                        String payType = sc.nextLine();
                        System.out.print("Enter transaction id: ");
                        String txnId = sc.nextLine();
                        manager.addExpense(new DigitalExpense(name, amount, category, date, payType, txnId));
                    }
                    break;

                case 2: manager.viewExpenses(); break;
                case 3: System.out.println("Total: " + manager.calculateTotal()); break;
                case 4: manager.sortExpenses(); break;
                case 5:
                    System.out.print("Enter description: ");
                    manager.searchByDescription(sc.nextLine());
                    break;
                case 6:
                    System.out.print("Enter category: ");
                    manager.filterByCategory(sc.nextLine());
                    break;
                case 7:
                    System.out.print("Enter keyword: ");
                    manager.searchByKeyword(sc.nextLine());
                    break;
                case 8:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}