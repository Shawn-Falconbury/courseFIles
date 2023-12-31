// PairTest.java - GENERIC CLASS ASSIGNMENT
// CSIS312-B01 (October 09, 2023) - Assignment 7:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.).
// Schildt, H. (2022). Java: A beginner's guide, ninth edition (9th ed.). McGraw Hill
public class PairTest {
    public static void main(String[] args) {
        System.out.println("Wesley Shawn Falconbury - Assignment 7");

        // Creating Pair of Integer and String
        Pair<Integer, String> p1 = new Pair<>(1, "One");
        System.out.println("Initial Pair p1: " + p1);
        System.out.println("Initial First value of p1: " + p1.getFirst());
        System.out.println("Initial Second value of p1: " + p1.getSecond());
        p1.setFirst(2);
        p1.setSecond("Two");
        System.out.println("Modified Pair p1: " + p1);

        // Creating Pair of String and Integer
        Pair<String, Integer> p2 = new Pair<>("Three", 3);
        System.out.println("\nInitial Pair p2: " + p2);
        System.out.println("Initial First value of p2: " + p2.getFirst());
        System.out.println("Initial Second value of p2: " + p2.getSecond());
        p2.setFirst("Four");
        p2.setSecond(4);
        System.out.println("Modified Pair p2: " + p2);
    }
}
