// Filename: Exercise617.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Package java.util.Random. Java Platform, https://docs.oracle.com/en/java/javase/17/docs/api//java.base/java/util/Random.html

// Import the Random class
import java.util.Random;

//Define the class Exercise617
public class Exercise617 {
    public static void main(String[] args) {
    	System.out.println(" - Assignment #5");
    	
        // Create a new Random object.
        Random rand = new Random();

        // Create an array to tally the sums of the dice rolls.
        int[] tally = new int[13];

        // Loop 36,000 times.
        for (int i = 0; i < 36000; i++) {
            // Roll two dice and compute their sum.
            int roll1 = 1 + rand.nextInt(6);
            int roll2 = 1 + rand.nextInt(6);
            int sum = roll1 + roll2;

            // Increment the tally for this sum.
            tally[sum]++;
        }

        // Print the tallies for each possible sum.
        System.out.println("Sum\tFrequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%d\t%d\n", sum, tally[sum]);
        }
    }
}
