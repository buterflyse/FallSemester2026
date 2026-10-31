/*
Name: Buterflyse
Date: 09/04/2026
Assignment: Homework2
Problem: #4
Description: This program takes 2 string variables, calculates how many characters are found in each, then it adds and multiplies
the two numbers together. The program proceeds to output the results.
 */
import java.util.Scanner;

public class CharacterMath {

    public static void main(String[] args){
        //Initialize the scanner function
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in two words separated by pressing the enter key below.");
        //Initial two string variable scanners
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        //Defining the length of each of the words for the calculations.
        int wordLen1 = word1.length();
        int wordLen2 = word2.length();

        //Caluclating the sum and product of both word lengths.
        int sumTotal = wordLen1 + wordLen2;
        int prodTotal = wordLen1 * wordLen2;

        //Outputting the results of the calculations.
        System.out.println("Sum: " + sumTotal + ", Product: " + prodTotal);
    }
}
