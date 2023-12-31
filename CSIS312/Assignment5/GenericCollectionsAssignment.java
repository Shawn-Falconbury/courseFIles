// GenericCollectionsAssignment.java
// CSIS312-B01 (September 25, 2023) - Assignment 5:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk, p. 911-922.
// Oracle. (n.d.). Class LinkedList. Java Platform, Standard Edition Documentation. Retrieved September 21, 2023, from https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html
// Oracle. (n.d.). Class Collections. Java Platform, Standard Edition Documentation. Retrieved September 22, 2023, from https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html


import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class GenericCollectionsAssignment {

    public static void main(String[] args) {
        System.out.println("- Assignment5");
        // 1. Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Populate the LinkedList with 25 random integers from 0 to 100
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            list.add(rand.nextInt(101)); // 101 because the upper bound is exclusive
        }

        // Print the list before sorting
        System.out.println("Unsorted list: " + list);

        // 3. Sort the elements in the LinkedList
        Collections.sort(list);

        // Print the list after sorting
        System.out.println("Sorted list: " + list);

        // 4. Calculate the sum of the elements
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the elements: " + sum);

        // 5. Calculate the floating-point average of the elements
        double average = sum / 25.0;
        System.out.println("Average of the elements: " + average);
    }
}
