// RecursiveArrayPrinter.java
// CSIS312-B01 (October 02, 2023) - Assignment 6:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk, p. 750-768.
// Schildt, H. (2022). Java: A beginner's guide, ninth edition (9th ed.). McGraw Hill, p. 210-227

import java.util.Random;

public class RecursiveArrayPrinter {

    // Print student's name and assignment number
    static {
        System.out.println(" - Assignment 6");
    }

    // Recursive function to print the array
    public static void printArray(int[] array, int index) {
        if (index < array.length) { // Base condition to end the recursion
            System.out.print(array[index] + " ");
            printArray(array, index + 1); // Recursive call to print the next element
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100]; // Instantiate an integer array of size 100
        Random rand = new Random(); // Create a Random object to generate random numbers

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + rand.nextInt(100);
        }

        printArray(array, 0); // Call the recursive function to print the array
    }
}
