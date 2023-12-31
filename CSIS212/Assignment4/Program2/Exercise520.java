// Filename: Exercise520.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Package java.util.Scanner. Java Platform, https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html

// Import the Scanner class for reading input from the user.
import java.util.Scanner;

// Define the class Exercise520.
public class Exercise520 {
    
    // The circleArea method that calculates the area of a circle given its radius.
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Start of the main method.
    public static void main(String[] args) {
    	System.out.println("[Name] - Assignment #4");
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        // Call the circleArea method and print the result.
        double area = circleArea(radius);
        System.out.println("The area of the circle is: " + area);
        
        // Close the scanner as we no longer need it.
        input.close();
    }
    // End of the main method.
}
// End of the class Exercise520.
