//WebSiteInteractions.java - The Program will be used for web page interaction.
//CSIS212-D02: Object-Oriented Programming
//Sources that were used to assist in the development of this code: 
// Ullenboom, C. (2022). Java: The comprehensive guide to java programming for professionals (1st ed.). Rheinwerk Computing.
// Schildt, H. (2018). Java: The complete reference, eleventh edition (11th ed.). McGraw Hill.


//Importing the swing library JOptionPane.
	import javax.swing.JOptionPane;
	
	public class WebSiteInteractions {
	public static void main(String[] args) {
	System.out.println(" - Assignment #1");
		
//Request for user information 	
	String visitorName = requestInput("Kindly provide your name:");

// Verse of the Day
	String dailyVerse = "John 14:6";

// Construct welcome message inclusive of visitor's name and the Verse of the Day
	String greeting = constructGreeting(visitorName, dailyVerse);

// Show the welcome message using a Dialog Box
	displayMessage(greeting);
    }
// Private static method to request input with a custom message.
	private static String requestInput(String requestMsg) {
	return JOptionPane.showInputDialog(null, requestMsg);
    }

// Private static method to construct the greeting message.
	private static String constructGreeting(String visitor, String verse) {
	return "Welcome, " + visitor + ", to The Liberty University Site!\n" +
			"The Verse for the day is: " + verse;
    }

// Private static method to display the message.
	private static void displayMessage(String msg) {
	JOptionPane.showMessageDialog(null, msg);
    }
}
