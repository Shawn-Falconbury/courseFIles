// Pair.java - GENERIC CLASS ASSIGNMENT
// CSIS312-B01 (October 09, 2023) - Assignment 7:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.).
// Schildt, H. (2022). Java: A beginner's guide, ninth edition (9th ed.). McGraw Hill
public class Pair<F, S> {
    // Instance variables
    private F first;
    private S second;

    // Constructor
    public Pair(F first, S second) {
        setFirst(first);
        setSecond(second);
    }

    // Setter for the first element
    public void setFirst(F first) {
        this.first = first;
    }

    // Getter for the first element
    public F getFirst() {
        return first;
    }

    // Setter for the second element
    public void setSecond(S second) {
        this.second = second;
    }

    // Getter for the second element
    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair(" + first + ", " + second + ")";
    }
}
