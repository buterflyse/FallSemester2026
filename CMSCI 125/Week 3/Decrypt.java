/*
Date: 9/18/2026
Description: This program takes an encrypted 5 letter word with characters in between each letter and returns the original word.
Name: Buterflyse
 */
import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char out1 = input.charAt(0);
        char out2 = input.charAt(2);
        char out3 = input.charAt(4);
        char out4 = input.charAt(6);
        char out5 = input.charAt(8);

        System.out.println(out1+""+out2+""+out3+""+out4+""+out5);
    }
}
