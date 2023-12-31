// Filename: DateTest.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Class Date. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Date.html


// DateTest class definition
public class DateTest {
    public static void main(String[] args) {
    	System.out.println(" - Assignment #6");
    	
        // Create a Date object
        Date myDate = new Date(8, 7, 2023);

        // Display the date
        myDate.displayDate();

        // Change the date using the setter methods
        myDate.setMonth(12);
        myDate.setDay(25);
        myDate.setYear(2023);

        // Display the new date
        myDate.displayDate();
    }
}
