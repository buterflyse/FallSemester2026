/*
Name: BUTERFLYSE
Date: 10/30/2026
Class: Comp. Sci. 125
Description: This program reads a file named test.txt and finds the lowest of the 7 provided doubles in the file, it then outputs that double.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DowJones {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("./src/test.txt"); //Creating a file object that saves the file path.
        Scanner scan = new Scanner(file);  //Scanner object that reads the file
        double smallest = Double.MAX_VALUE;  //Setting a starting point of max value to work down from.
        int day = 0;                        //Day variable starting point to track what day it is

        //For loop to look through the 7 doubles as we know there are only 7
        for(int i = 0; i < 7; i++){


            double num = scan.nextDouble(); //Scanning each double in the file
            //checking for a smaller number and tracking teh day
            if(num < smallest){
                smallest = num;
                day = i+1;
            }
        }

        System.out.println("The smallest number in the file is "+smallest+" and it appears on day no. " + day); //output

    }


}
