// Filename: RectangleTest.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Package java.util.Scanner. Java Platform, https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
// Java Standard Edition Documentation. Class Rectangle. https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Rectangle.html

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
    	System.out.println(" - Assignment #6");
    	
        // Create a new rectangle
        Rectangle rectangle = new Rectangle();

        // Create a new scanner for user input
        Scanner input = new Scanner(System.in);

        // Continue displaying the menu until the user chooses to exit
        while(true) {
            System.out.println("\n1. Set Length\n2. Set Width\n3. Exit\nChoice:");
            int choice = input.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Enter length:");
                    double length = input.nextDouble();
                    rectangle.setLength(length);
                    break;
                case 2:
                    System.out.println("Enter width:");
                    double width = input.nextDouble();
                    rectangle.setWidth(width);
                    break;
                case 3:
                    System.out.println("Exiting... Go Flames!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
            
            System.out.printf("Area: %.2f\n", rectangle.calculateArea());
            System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
        }
    }
}
