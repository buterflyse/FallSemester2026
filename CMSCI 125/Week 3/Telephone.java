/*
Date: 9/18/2026
Description: This program takes an unformatted 10 numbers and returns it in phone number format.
Name: Buterflyse
 */

import java.util.Scanner;
public class Telephone {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long input = in.nextLong();
        String mid = input.toString();
        String out1 = mid.substring(0, 3);
        String out2 = mid.substring(3, 6);
        String out3 = mid.substring(6, 10);
        String output = "(" + out1 +") " + out2 +"-"+out3;
        System.out.println(output);
    }
}
