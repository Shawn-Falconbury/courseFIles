//Exercise214JHTP.java-This programm will displays the numbers 1 to 4 on the same line
//CSIS212-D02: Object-Oriented Programming
//Sources that were used to assist in the develop this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing.
// Schildt, H. (2018). Java: The complete reference, eleventh edition (11th ed.). McGraw Hill.

	public class Exercise214JHTP {
    public static void main(String[] args) {
	System.out.println(" - Assignment #1");
		
// Method 1: Using one System.out.println statement
// This will print the numbers 1 to 4 on the same line, separated by spaces.
    System.out.println("1 2 3 4");

// Method 2: Using four System.out.print statements
// Each statement will print one number, and because we're using print (not println),
// the numbers will all be on the same line.
    System.out.print("1 ");
    System.out.print("2 ");
    System.out.print("3 ");
    System.out.print("4\n"); // Adding newline at the end to prepare for the next method

// Method 3: Using one System.out.printf statement
// The %d format specifier will be replaced by the numbers 1 to 4,
// and the spaces in the format string will put spaces between the numbers.
    System.out.printf("%d %d %d %d\n", 1, 2, 3, 4);
    }
}
