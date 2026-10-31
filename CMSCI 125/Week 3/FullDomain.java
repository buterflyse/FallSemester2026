/*
Name: Buterflyse
Date: 9/18/2026
Description: This program adds www. before and .com after the name of a provided domain name, resulting in the website.
 */
import java.util.Scanner;
public class FullDomain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String output = "www." + input + ".com";
        System.out.println(output);
    }
}
