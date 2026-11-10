/*
Name: Michael Galva
Date: 11/6/2026
Description: This is the class that defines the circle object for the circle driver, this program contains 3 instance variables and accessors to access them as well as mutators to change them.
 */

public class Circle {

    //Instance VAriables:
    private int x;
    private int y;
    private int radius;

    //Default Constructor:
    public Circle(){
        x = 10;
        y = 10;
        radius = 10;
    }
    //Non-Default Constructor:
    public Circle(int newX, int newY, int newRadius){
        x = newX;
        y = newY;
        radius = newRadius;
    }

    //MUTATORS: One per instance variable:
    public void setRadius(int newRadius){
        radius = newRadius;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }


    // Accessors: One per instance variable:
    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public int getRadius(){
        return radius;
    }


    //ToString replacement: prints all instance variables;
    public String toString(){
        return "Center X coordinate: " + x + ", Center Y coordinate: " + y + ", Radius: " + radius;
    }

    //equals replacement: takes in circle object
    public boolean equals(Object newObject){
        if(newObject instanceof Circle otherCircle){
            if(this.x == otherCircle.getX() && this.y == otherCircle.getY() && this.radius == otherCircle.getRadius()){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    //Accessors: Calculations
    public double getArea(){
        double pi = Math.PI;
        return pi * radius * radius;
    }

    public double getPerimiter(){
        double pi = Math.PI;
        return 2 * pi * radius;
    }
}
