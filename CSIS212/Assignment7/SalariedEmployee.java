// Filename: SalariedEmployee.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Deitel, P. (n.d.). Source code for "Java How to Program, 11/e, Early Objects Version. https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects/tree/master/examples

// SalariedEmployee concrete class extends abstract class Employee
public class SalariedEmployee extends Employee {
    private double weeklySalary; // Weekly salary

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date birthdate) {
        // Call to superclass constructor
        super(firstName, lastName, socialSecurityNumber, birthdate);

        // Validate and assign weekly salary
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // Method to set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // Method to return salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWeeklySalary(); // Return weekly salary
    }

    // Return String representation of SalariedEmployee object
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
