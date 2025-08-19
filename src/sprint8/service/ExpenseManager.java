package sprint8.service;


import sprint8.entity.Expense;

public class ExpenseManager {
 private Expense[] expenses;
 private int count;

 public ExpenseManager(int size){
     expenses = new Expense[size];
     count = 0;
 }
 public void addExpense(Expense expense){
     if(count < expenses.length){
         expenses[count++] = expense;
         System.out.println("Expense add Successfully!");
     }
     else{
         System.out.println("Expense limit reached! Cannot add more.");
     }
 }


 public void viewExpenses(){
     if(count == 0){
         System.out.println("No expenses recorded! ");
     }
     else{
         for(int i = 0; i < count; i++){

             expenses[i].displayExpenseDetails();

             System.out.println("------------------");
         }
     }
 }

 public void calculateTotal(){
     if(count == 0 ){
         System.out.println("No Expenses Recorded!");
     }
     else{
         double total = 0;
         for(int i = 0; i < count; i++){
             total += expenses[i].amount;
         }
         System.out.println("Total Expenses: ₹" + total);
     }
 }
}
