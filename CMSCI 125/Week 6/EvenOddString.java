/*
 * Name: Buterflyse
 * Date: Fri, Oct 23, 2026
 * Prof: REDACTED
 * Description: This script takes in a string from user, takes all letters in odd position and returns them first then all letters in even position.
 */

import java.util.Scanner;

public class EvenOddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //initializing scanner
		String input = scan.nextLine(); //creating scanner item
		String odd = ""; //odd characters
		String even = ""; // even characters
		
		//loop to parse through each letter
		for(int i = 0; i < input.length(); i++) {
			if(i % 2 == 0) {				// if even position then add to even
				even = even + input.charAt(i);
			} else {						// if odd position add to odd
				odd = odd + input.charAt(i);
			}
		}
		System.out.println(even+odd); //print output in correct order.
	}

}
