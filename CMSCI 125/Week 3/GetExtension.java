/*
Date: 9/18/2026
Description: This program takes in the name of a file and returns only the extension.
Name: Buterflyse
 */
import java.util.Scanner;
public class GetExtension {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = input.substring(input.indexOf(".")+1);
        System.out.println(output);
    }
}
