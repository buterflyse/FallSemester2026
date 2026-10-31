/*
 * Name: Buterflyse
 * Date: Fri, Oct 23, 2026
 * Prof: REDACTED
 * Description: This script takes in two numbers and displays all of the multiples of 7 within the range between the first number and second number inclusively.
 */



import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //initializing scanner
		System.out.println("Input first number: ");
		int num1 = scan.nextInt();				//first input
		System.out.println("Input second number: ");
		int num2 = scan.nextInt();				// second input
		
		//for loop checks if multiple of 7, if so it prints out the number and moves on to the next.
		for(int i = num1; i < num2; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
