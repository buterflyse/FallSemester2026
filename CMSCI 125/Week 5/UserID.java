/*
Name: Buterflyse
Class: CMIS 125
Prof: REDACTED
Date: 10/16/2026
Description: This script takes a string input of a user and checks for the length of that string. If the string provided
is between 6 and 10 characters (inclusive), the script will return a welcome message, otherwise it will return an error.
 */


import java.util.Scanner;

public class UserID {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Scanner item created

        System.out.println("Please enter your user ID: ");
        String userID = scan.nextLine(); //Requesting user input

        if(userID.length() >= 6 && userID.length() <= 10){ //checks for input length
            System.out.println("Welcome, " + userID); //output case 1
        } else {
            System.out.println("Sorry, user ID invalid"); //output case 2
        }
    }
}
