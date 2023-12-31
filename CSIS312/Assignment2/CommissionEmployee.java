// CommissionEmployee.java - CommissionEmployee class that extends Employee.
// Modifications to the original example files noted as @change and @added
// CSIS312-B01 (September 04, 2023) - Assignment2:
//
// Additional Sources that were used to assist in the development of this code:
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// udemy. (n.d.). Section 7: OOP Part 1 - Inheritance. Java Programming Masterclass updated to Java 17. https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/34998522?start=0#overview

public class CommissionEmployee extends Employee { //@changed
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructor
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate) {

        super(firstName, lastName, socialSecurityNumber); //@added - Call to superclass constructor

        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // set gross sales amount
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    // return commission rate
    public double getCommissionRate() {
        return commissionRate;
    }

    // calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // Override the toString method
    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f",
                super.toString(), //@added - Call to superclass's toString method
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
