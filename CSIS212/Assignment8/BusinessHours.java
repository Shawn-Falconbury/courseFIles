// Filename: BusinessHours.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Class JOptionPane https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/JOptionPane.html
// Java Standard Edition Documentation. Class StringBuilder https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html

import javax.swing.JOptionPane;

public class BusinessHours {
    // Enumeration for days of the week
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
    	System.out.println(" - Assignment #8");
    	
        // Array to hold business hours for each day
        String[] hours = {"9am - 5pm", "10am - 5pm", "9am - 4pm", "8am - 6pm", "7am - 12pm", "6am - 6pm", "Closed - Hebrews 4:9-10"};

        // Displaying the days
        StringBuilder daysList = new StringBuilder();
        for (Days day : Days.values()) {
            daysList.append(day).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Days of the week:\n" + daysList);

        // Prompting the user for a day
        String input = JOptionPane.showInputDialog("Enter a day:");
        Days chosenDay = Days.valueOf(input.toUpperCase());

        // Displaying business hours for the chosen day
        JOptionPane.showMessageDialog(null, "Business hours for " + chosenDay + ": " + hours[chosenDay.ordinal()]);
    }
}
