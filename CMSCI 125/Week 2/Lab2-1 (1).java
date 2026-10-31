/* Name: Buterflyse
 * Class CMSCI 125 A
 * Description: This program asks the user to input a full name all in one line, the program 
 * will then output what they input but with a changed format.
 * Date: 09/11/2026
 */

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		// Initializes the scanner function and asks user for input with string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your first, middle, and last name with only spaces in between each, and then press enter: ");
		
		// Creates the variable where the user will input their full name to.
		String fullName = scan.nextLine();
		
		// Splits each of the names provided in the full name function and makes the middle name an initial.
		String firstName = fullName.substring(0, fullName.indexOf(' '));
		String middleInitial = fullName.substring(firstName.length()+1, firstName.length()+2);
		String lastName = fullName.substring(fullName.lastIndexOf(" ")+1);
		
		// Prints output
		System.out.println(lastName + ", "+firstName+" "+middleInitial+".");
		
	}

}
