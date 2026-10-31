/*
 * Name: Buterflyse
 * Date: Fri, Oct 23, 2026
 * Prof: REDACTED
 * Description: This script takes a in input and checks if it has 2 numbers in it, if it does then it accepts it otherwise it rejects it.
 */


import java.util.Scanner;

public class IDCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Gets input from users
		String input = scan.nextLine(); // accepts input from users
		int counter = 0; //counter to track how many numbers there are
		
		for(int i = 0; i < input.length(); i++) { //for loop to parse through the string characters
			if(Character.isDigit(input.charAt(i))) { //checks if each character is or isn't a number
				counter ++;
			}
		}
		
		//checking for if 2 numbers, if not 2 then invalid
		if(counter == 2) { 
			System.out.println("Your ID is valid");
		} else {
			System.out.println("INVALID ID");
		}
	}

}
