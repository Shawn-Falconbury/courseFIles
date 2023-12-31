// Filename: Exercise516.java

// Import the Scanner class.
import java.util.Scanner;

// 1. Start of the class Exercise516
public class Exercise516 {
    
    // 2. The isMultiple method that checks if the second number is a multiple of the first.
    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }
    
    // Start of the main method
    public static void main(String[] args) {
    	System.out.println("[Name] - Assignment #3");
        // 3. Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // 4.1 Prompt the user to enter pairs of integers.
        while (true) {
            System.out.print("Enter the first integer: ");
            int first = input.nextInt();
            
            System.out.print("Enter the second integer: ");
            int second = input.nextInt();
            
            // 4.3 Print whether the second integer is a multiple of the first.
            System.out.println("Is the second integer a multiple of the first? " + isMultiple(first, second));
            
            System.out.print("Would you like to check another pair? (yes/no): ");
            String response = input.next();
            
            // 4.4 If the user doesn't want to check another pair, break the loop.
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Close the scanner.
        input.close();
    }
    // End of the main method
}
// End of the class Exercise516
