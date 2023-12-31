//Exercise320JHTP.java-Salary Calculator Assignment
//CSIS212-D02: Object-Oriented Programming
//
//Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Chapter 3 Control Statements Part I Assignment, ++ and -- Operators [Power Point Slides]


// Import the Scanner class, which is used to get user input
	import java.util.Scanner;	

//Define the class
	public class Exercise320JHTP {
	
// The main method
		public static void main(String[] args) {
//Assignment Information
		System.out.println(" - Assignment #2");
// Create a Scanner object to read input
		Scanner input = new Scanner(System.in);

// Loop over the three employees
		for (int i = 1; i <= 3; i++) {
			
// Prompt the user to enter data for the current employee
        System.out.println("Enter data for employee " + i + ":");

// Prompt the user to enter the number of hours worked last week
        System.out.print("Enter number of hours worked last week: ");
		
// Read the number of hours worked from the user
        int hoursWorked = input.nextInt();

// Prompt the user to enter the hourly rate
        System.out.print("Enter hourly rate: ");
		
// Read the hourly rate from the user
        double hourlyRate = input.nextDouble();

// Declare a variable to hold the gross pay
        double grossPay;
		
// Check if the employee worked 40 hours or less
        if (hoursWorked <= 40) {
			
// If so, the gross pay is simply the number of hours times the hourly rate
        grossPay = hoursWorked * hourlyRate;
        } else {
			
// If the employee worked more than 40 hours, they get 1.5 times the hourly rate for the extra hours
        grossPay = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
        }

// Print the gross pay for the current employee
        System.out.printf("Gross pay for employee %d is: $%.2f\n", i, grossPay);
        System.out.println("-----------------------------");
    }

// Close the Scanner object
    input.close();
}
}
