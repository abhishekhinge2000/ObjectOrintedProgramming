package sprint10;

import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

        class Expense {
            private String name;
            private double amount;
            private String category;
            private String dueDate;
            private String paymentMode;

            public Expense(String name, double amount, String category, String dueDate, String paymentMode) {
                this.name = name;
                this.amount = amount;
                this.category = category;
                this.dueDate = dueDate;
                this.paymentMode = paymentMode;
            }

            @Override
            public String toString() {
                return "Expense: " + name + ", Amount: " + amount + ", Category: " + category +
                        ", Due Date: " + dueDate + ", Payment: " + paymentMode;
            }
        }

        public class ExpenseTracker {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                try {
                    System.out.print("Enter the number of expenses: ");
                    int n = sc.nextInt();

                    if (n < 0) {
                        throw new IllegalArgumentException("No of expense cannot be negative");
                    }
                    if (n == 0) {
                        throw new IllegalArgumentException("No of expense cannot be 0");
                    }

                    Expense[] expenses = new Expense[n];

                    for (int i = 0; i < n; i++) {
                        sc.nextLine(); // consume newline
                        System.out.print("Enter expense name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();
                        if (amount <= 0) {
                            throw new InvalidAmountException("Amount must be greater than zero.");
                        }

                        System.out.println("Choose Category: ");
                        System.out.println("1. Food\n2. Rent\n3. Transport\n4. Entertainment\n5. Others");
                        int catChoice = sc.nextInt();
                        String category = switch (catChoice) {
                            case 1 -> "Food";
                            case 2 -> "Rent";
                            case 3 -> "Transport";
                            case 4 -> "Entertainment";
                            default -> "Others";
                        };

                        sc.nextLine(); // consume newline
                        System.out.print("Enter due date (e.g., 2025-03-17): ");
                        String dueDate = sc.nextLine();

                        System.out.println("Enter 1 for cash");
                        System.out.println("Enter 2 for digital payment");
                        int payChoice = sc.nextInt();
                        String paymentMode = (payChoice == 1) ? "Cash" : "Digital";

                        expenses[i] = new Expense(name, amount, category, dueDate, paymentMode);
                    }

                    System.out.println("\nRecorded Expenses:");
                    for (Expense e : expenses) {
                        System.out.println(e);
                    }

                } catch (InvalidAmountException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input type. Please enter correct values.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Unexpected error: " + e.getMessage());
                } finally {
                    sc.close();
                }
            }
        }


               