// Exercise416.java-Calculate odd integers Assignment
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Chapter 4 Control Statements Part 2 Logical Operators [Power Point Slides]


// Filename: Exercise416.java

// 1. Import the Scanner class for reading input from the user.
import java.util.Scanner;

// 2. Define the class Exercise416
public class Exercise416 {

    // 3. Main method
    public static void main(String[] args) {
		System.out.println(" - Assignment #3");
		
        // 3. Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // 4. Define an integer array to hold the 5 numbers.
        int[] numbers = new int[5];

        // 5. Prompt and read 5 numbers between 1 and 30 from the user.
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter a number between 1 and 30 (" + (i + 1) + " out of 5): ");
                numbers[i] = input.nextInt();
            } while (numbers[i] < 1 || numbers[i] > 30); // Step 5.2: Validate the input
        }

        // 6. Close the scanner object.
        input.close();

        // 7. Display the bars of asterisks.
        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // End of the main method
}
// End of the class Exercise416
