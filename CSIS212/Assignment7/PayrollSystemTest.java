// Filename: PayrollSystemTest.java
// 
// CSIS212-D02: Object-Oriented Programming
//
// Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing
// Deitel P. J. & Deitel H. M. (2020). Java : how to program : late objects (11th ed.). Pearson
// Deitel, P. (n.d.). Source code for "Java How to Program, 11/e, Early Objects Version. https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects/tree/master/examples

import java.util.Calendar;

public class PayrollSystemTest {
    public static void main(String[] args) {
        // Get the current month to check for birthday bonuses
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;

        // Create employee objects with birthdates
      SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-22-3333", 1000.00, new Date(8, 14, 1980));
      HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Doe", "222-33-4444", 25.35, 40, new Date(6, 29, 1993));
      CommissionEmployee commissionEmployee = new CommissionEmployee("Mary", "Smith", "333-44-5555", 25000, .08, new Date(7, 10, 1968));
      BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Joe", "Johnson", "444-55-6666", 1006, .08, 2500, new Date(2, 14, 1959));

      // Initialize an array of employees
      Employee[] employees = new Employee[4];
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;
      
      System.out.println(" - Assignment #7");
      System.out.printf("Employees processed polymorphically:%n%n");

      // Process each employee polymorphically
      for (Employee currentEmployee : employees) {
          System.out.println(currentEmployee); // Print employee details

          // Calculate earnings
          double payroll = currentEmployee.earnings();

          // Check if the current month is the employee's birth month and add a bonus if true
          if (currentEmployee.getBirthdate().getMonth() == currentMonth) {
              payroll += 100.00;
          }

          // Check if the employee is of type BasePlusCommissionEmployee
          if (currentEmployee instanceof BasePlusCommissionEmployee) {
              BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

              // Increase base salary by 10%
              employee.setBaseSalary(1.10 * employee.getBaseSalary());
              System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
          }

          // Print the earnings
          System.out.printf("earned $%,.2f%n%n", payroll);
      }

      // Print the type name of each object in the employees array
      for (int j = 0; j < employees.length; j++) {
          System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
      }
  }
}
