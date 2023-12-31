// Filename: Date.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Deitel, P. (n.d.). Source code for "Java How to Program, 11/e, Early Objects Version. https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects/tree/master/examples
   

public class Date {
    private int month; 
    private int day; 
    private int year; 

    // Array to hold the number of days in each month
    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Constructor: Confirm proper value for month and day given the year
    public Date(int month, int day, int year) {
        // Validate month
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        // Validate day, considering leap year
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // Check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

    }

    // Return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    // Get method for month
    public int getMonth() {
        return month;
    }

    // Get method for day
    public int getDay() {
        return day;
    }

    // Get method for year
    public int getYear() {
        return year;
    }
}
