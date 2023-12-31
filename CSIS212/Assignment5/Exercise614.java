// Filename: Exercise614.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson

// Define the class Exercise614.
public class Exercise614 {
	
	// Main method.
    public static void main(String[] args) {
    	System.out.println(" - Assignment #5");
    	
    	// Test the product method with different numbers of arguments.
        System.out.println("Product of 1, 2, 3 is: " + product(1, 2, 3));
        System.out.println("Product of 4, 5 is: " + product(4, 5));
        System.out.println("Product of 6, 7, 8, 9 is: " + product(6, 7, 8, 9));
        System.out.println("Product of 10 is: " + product(10));

    }
    // The product method that calculates the product of a variable-length list of integers.
    public static int product(int... numbers) {
        int result = 1;
        // Loop through each number and multiply it with product.
        for (int number : numbers) {
            result *= number;
        }
        // Return the final product.
        return result;
    }
}
