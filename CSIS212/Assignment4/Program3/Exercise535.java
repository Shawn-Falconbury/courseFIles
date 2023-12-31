// Filename: Exercise535.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Chapter 5: Methods [Power Point Slides]. (n.d.). Liberty University. https://canvas.liberty.edu/courses/467478/files/95064349?module_item_id=53377313
// Java Platform, Standard Edition Documentation, https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/random/package-summary.html

// Import required classes for reading input and generating random numbers.
import java.util.Scanner;
import java.util.Random;

public class Exercise535 {

    // Method to generate and ask the question.
    public static int generateQuestion(Random randomGenerator) {
        int num1 = randomGenerator.nextInt(10);
        int num2 = randomGenerator.nextInt(10);
        System.out.printf("How much is %d times %d?\n", num1, num2);
        return num1 * num2;
    }

    // Main method.
    public static void main(String[] args) {
    	System.out.println("[Name] - Assignment #4");
        // Create a Scanner to read input from the user and a Random to generate random numbers.
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        while (true) {
            int correctAnswer = generateQuestion(randomGenerator);
            while (true) {
                int studentAnswer = input.nextInt();
                if (studentAnswer == correctAnswer) {
                    System.out.println("Very good!");
                    break;  // Move on to the next question.
                } else {
                    System.out.println("No. Please try again.");
                    // I did not break out of the loop, so the same question will be repeated.
                }
            }
        }
    }
}
