package sprint6.ExpenseTracker1;

import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //First Expense (Default category & date)

        System.out.println("Enter first expense description: ");
        String desc1 = scanner.nextLine();

        System.out.println("Enter first Expense Amount: ");
        double amt1 = scanner.nextDouble();

        scanner.nextLine(); // consume newLine

        Expense e1 = new Expense(desc1, amt1);

        //Second Expense (custom category & date)
        System.out.println("Enter Second expense description: ");
        String desc2 = scanner.nextLine();

        System.out.println("Enter second expense amount");
        double amt2 = scanner.nextDouble();

        scanner.nextLine(); // consume newline

        System.out.println("Enter category");
        String category2 = scanner.nextLine();

        System.out.println("Enter date (DD-MM-YYYY)");
        String date2 = scanner.nextLine();

        Expense e2 = new Expense(desc2, amt2, category2, date2);

        //Display expenses
        e1.displayExpenseDetails();
        System.out.println();
        e2.displayExpenseDetails();

        scanner.close();
    }
}
