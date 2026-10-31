/*
 * Name: Buterflyse
 * Date: Fri, Oct 23, 2026
 * Prof: REDACTED
 * Description: This script reads the contents of a file for each word, if the word is a website that ends in .com, it adds to a counter and outputs the amount of sites listed.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameCount {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File input = new File("sitenames.txt"); //importing file
		Scanner scan = new Scanner(input);		//scanning file
		int counter = 0;						//counter for the amount of .com words
		while (scan.hasNext()) {				// loop to iterate through each word
            String word = scan.next();
            if(word.endsWith(".com")) {			//checking for .com
            	counter++;						//adding to counter if it does
            }
            
        }
		System.out.println(counter);			//printing result
	}
}
