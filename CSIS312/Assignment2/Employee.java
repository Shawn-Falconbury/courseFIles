// Employee.java - Employee superclass that factors out the common attributes and behaviors of all Employees.
// CSIS312-B01 (September 04, 2023) - Assignment 2:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// udemy. (n.d.). Section 7: OOP Part 1 - Inheritance. Java Programming Masterclass updated to Java 17. https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/34998522?start=0#overview

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
                "employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber());
    }
}
