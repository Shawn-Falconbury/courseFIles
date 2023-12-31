//Exercise226JHTP.java-User interaction enter two integers then divide print sum.
//CSIS212-D02: Object-Oriented Programming
//Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing.
// Schildt, H. (2018). Java: The complete reference, eleventh edition (11th ed.). McGraw Hill.

// Import Java libraries for user input
	import java.util.Scanner;

	public class Exercise226JHTP {
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

// Determine if the first number is a multiple of the second number
// The remainder operator (%) will give a result of 0 if firstNumber is a multiple of secondNumber
    if (firstNumber % secondNumber == 0) {
    System.out.println("The first number is a multiple of the second number.");
    } else {
    System.out.println("The first number is not a multiple of the second number.");
    }

// Close the scanner
    input.close();
    }
}
