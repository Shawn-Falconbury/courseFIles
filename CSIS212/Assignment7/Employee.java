// Filename: Employee.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Deitel, P. (n.d.). Source code for "Java How to Program, 11/e, Early Objects Version. https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects/tree/master/examples
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthdate;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthdate = birthdate;
    }

    // Return first name
    public String getFirstName() {
        return firstName;
    }

    // Return last name
    public String getLastName() {
        return lastName;
    }

    // Return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Return birthdate
    public Date getBirthdate() {
        return birthdate;
    }

    // Return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%nbirthdate: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthdate());
    }

    // Abstract method must be overridden by concrete subclasses
    public abstract double earnings();
}
