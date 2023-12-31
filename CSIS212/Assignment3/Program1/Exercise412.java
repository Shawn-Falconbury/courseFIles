// Exercise412.java-Calculate odd integers Assignment
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Chapter 4 Control Statements Part 2 Logical Operators 


// Filename: Exercise412.java

// 1. Define the class Exercise412
public class Exercise412 {
    
    // 2. Start of the main method
    public static void main(String[] args) {
		System.out.println(" - Assignment #3");
		
        // 2. Declare and initialize the variable 'product' with the value 1.
        int product = 1;
    
        // 3. Start a for-loop from 1 to 15, inclusive.
        for (int i = 1; i <= 15; i += 2) {
            // 4. Multiply the current product with the current odd number
            product *= i;
        }

        // 5. Display the result to the user.
        System.out.println("The product of the odd integers from 1 to 15 is: " + product);
    }
    // End of the main method
}
// End of the class Exercise412
