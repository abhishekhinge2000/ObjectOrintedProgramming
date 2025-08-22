//Handling Exception in Arrays
//Write a program that accepts an index from the user and prints the corresponding value from
//an array. Ensure that the program does not crash if the user enters an index or non-numeric input.

package sprint10;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50}; // Fixed-size Array

        try{
            System.out.println("Enter an index to access the array: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);
        }
        catch(Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
        finally{
            scanner.close();
            System.out.println("Scanner closed");
        }
    }
}
