//Handling Multiple Exception
//Write a program that accepts an index from the user and prints the corresponding value from
//an array. Ensure that the program does not crash if the user enters an invalid index or non-numeric
// input and display message accordingly.


package sprint10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAccess2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50}; // Fixed size array

        try{
            System.out.println("Enter an index to access the array: ");
            int index = scanner.nextInt();

            System.out.println("Value at Index: " + index + ": " + numbers[index]);
        }

        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid input");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound! Please enter index in between 0 to " + (numbers.length - 1) + ". ");
        }
        finally{
            scanner.close();
            System.out.println("Scanner Close");
        }
    }
}
