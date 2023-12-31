//Exercise215HTP.java-User interaction enter two integers then divide print sum
//CSIS212-D02: Object-Oriented Programming
//Sources that were used to assist in the development this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing.
// Schildt, H. (2018). Java: The complete reference, eleventh edition (11th ed.). McGraw Hill.

// Import Java libraries for user input
	import java.util.Scanner;
	
	public class Exercise215JHTP {
    public static void main(String[] args) {
	System.out.println(" - Assignment #1");
		
// Create a Scanner object for user input
    Scanner input = new Scanner(System.in);

// Prompt the user to enter the first integer
    System.out.println("Enter the first integer: ");
    int firstNumber = input.nextInt();

// Prompt the user to enter the second integer
    System.out.println("Enter the second integer: ");
    int secondNumber = input.nextInt();

// Calculate and print the sum, product, difference and quotient of the two numbers
    System.out.println("The sum of the two numbers is: " + (firstNumber + secondNumber));
    System.out.println("The product of the two numbers is: " + (firstNumber * secondNumber));
    System.out.println("The difference of the two numbers is: " + (firstNumber - secondNumber));
        
// Check if the second number is zero to avoid dividing by zero
    if (secondNumber != 0) {
    System.out.println("The quotient of the two numbers is: " + ((double) firstNumber / secondNumber));
    } else {
    System.out.println("Cannot divide by zero.");
    }

// Close the scanner
    input.close();
    }
}
