// Filename: StudentInfo.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Java Standard Edition Documentation. Class JOptionPane https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/JOptionPane.html

import javax.swing.JOptionPane;

public class StudentInfo {
    public static void main(String[] args) {
    	System.out.println(" - Assignment #8");
    	
        // Parallel arrays to hold student information
        int[] studentIDs = {1234, 2345, 3456, 4567, 5678, 6789, 7892, 8901, 9012, 1123};
        String[] firstNames = {"Peter", "Andrew", "Sarah", "Rebekah", "Priscilla", "Bartholomew", "Thaddaeus", "Simon", "Miriam", "Paul"};
        double[] GPAs = {3.8, 3.7, 3.6, 3.0, 3.1, 3.2, 3.9, 3.4, 3.5, 4.0};

        while (true) {
            // Accepting student ID from user
            String input = JOptionPane.showInputDialog("Enter a student ID:");
            int studentID = Integer.parseInt(input);

            // Search for the student ID
            boolean found = false;
            for (int i = 0; i < studentIDs.length; i++) {
                if (studentIDs[i] == studentID) {
                    JOptionPane.showMessageDialog(null, "Name: " + firstNames[i] + "\nGPA: " + GPAs[i]);
                    found = true;
                    break;
                }
            }

            // If not found, display an error message
            if (!found) {
                JOptionPane.showMessageDialog(null, "Error: Invalid ID number " + studentID);
            }
        }
    }
}
