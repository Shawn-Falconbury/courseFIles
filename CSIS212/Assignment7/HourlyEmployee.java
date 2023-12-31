// Filename: HourlyEmployee.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Deitel, P. (n.d.). Source code for "Java How to Program, 11/e, Early Objects Version. https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects/tree/master/examples


public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, Date birthdate) {
        // Call to superclass constructor
        super(firstName, lastName, socialSecurityNumber, birthdate);

        // Validate and assign wage
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;

        // Validate and assign hours
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    // Method to set wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    // Method to return wage
    public double getWage() {
        return wage;
    }

    // Method to set hours worked
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    // Method to return hours worked
    public double getHours() {
        return hours;
    }

    // Calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if (getHours() <= 40) { // No overtime
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5; // With overtime
        }
    }

    // Return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
