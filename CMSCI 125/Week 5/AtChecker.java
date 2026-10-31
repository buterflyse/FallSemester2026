/*
Name: Buterflyse
Class: CMIS 125
Prof: REDACTED
Date: 10/16/2026
Description: This string takes an input from the user, if the string provided contains an @ symbol, the program will return it, if the program doesn't contain an @ but does contain a ., then it will replace the . with an @ and return it.
However, if the string contains neither, it will just return an error.
 */

import java.util.Scanner;

public class AtChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Creating new scanner
        System.out.println("Please input your beautiful string :) : "); // requesting the user input a string.
        String input = scan.nextLine();
        Boolean checker = input.contains("@"); // creating a variable to check whether the input contains @

        //if statement below checks for the @ or the . and does what is described above and automatically outputs.
        if(checker){
            System.out.println(input);
        }else if(!checker && input.contains(".")){
            int getPeriod = input.indexOf(".");
            String part1 = input.substring(0, getPeriod);
            String part2 = input.substring(getPeriod +1, input.length());
            System.out.println(part1 + "@" + part2);
        }else{
            System.out.println("error");
        }
    }
}
