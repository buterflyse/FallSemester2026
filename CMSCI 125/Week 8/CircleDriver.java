/*
Name: Michael Galva
Date: 11/6/2026
Description: This is the class meant to test all of the functions of Circle.java
 */

public class CircleDriver {

    public static void main(String[] args){
        Circle cir1 = new Circle(); // Creating default Circle object
        System.out.println(cir1.toString()); // testing replaced toString method
        System.out.println(cir1.getArea()); // testing getArea accessor
        System.out.println(cir1.getPerimiter()); // testing getPerimiter accessor

        Circle cir2 = new Circle(15, 15, 15); //creating non-default circle object
        System.out.println(cir2.getY()); //testing Y coordinate accessor
        System.out.println(cir2.getX()); // testing X coordinate accessor
        System.out.println(cir2.getRadius()); // testing radius accessor
        System.out.println(cir2.equals(cir1)); // testing replaced equals method

        cir2.setRadius(10); // setting new radius to existing circle
        cir2.setX(10); // setting new x coordinate to existing circle
        cir2.setY(10); // setting new y coordinate to existing circle
        System.out.println(cir2.toString()); // ensuring changes worked
        System.out.println(cir2.equals(cir1)); // testing fail cases for equals
    }
}
