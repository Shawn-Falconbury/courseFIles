// Filename: Date.java
// 
// CSIS212-D02: Object-Oriented Programming
//  - Assignment #6
//
// Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Class Date. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Date.html

// Date class definition
class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter and setter methods
    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display the date
    public void displayDate() {
        System.out.printf("%d/%d/%d\n", month, day, year);
    }
}
