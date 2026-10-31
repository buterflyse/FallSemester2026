/*
Name: Buterflyse
Date: 9/24/2026
Description: This program uses JFrame to draw a picture of a house that can be manipulated by the variables in the paint
method.
 */

import javax.swing.*; //Imports JFrame
import java.awt.*;    //Imports Graphics

public class House extends JFrame {
    public House(){
        setSize(700, 700); // set dimensions of window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // make sure program ends on close
        setVisible(true); // make window visible
        setTitle("Drawing"); // Sets title of page to Drawing
    }
    public void paint(Graphics g){
        //Setting the anchor point for the house at the top left corner of the main house body.
        int cornerX = 200;
        int cornerY = 350;

        //Setting the house Width, Height, and Ceiling Height respectively.
        int houseW = 250;
        int houseH = 150;
        int ceilH = 100;

        //Setting Door Height and width as well as Window Height and Width.
        int doorH = 100;
        int doorW = 50;
        int winW = 40;
        int winH = 40;

        //Setting ceiling coordinates to ensure that the ceiling remains on top of house and height is controlled by ceilH variable.
        int[] ceilX = {cornerX, cornerX+(houseW/2), cornerX+houseW}; // X coordinates of vertices
        int[] ceilY = {cornerY, cornerY-ceilH, cornerY};

        //Drawing all house shapes.
        g.setColor(Color.BLUE);  //Setting house Color to Blue.
        g.fillRect(cornerX, cornerY, houseW, houseH); // Drawing Main house shape
        g.setColor(Color.BLACK);  // Setting Ceiling color to Black
        g.fillPolygon(ceilX,ceilY,3); // Drawing house Ceiling shape
        g.setColor(Color.WHITE); // Setting house door and window color to White.
        g.fillRect((cornerX+(houseW/2)-doorW/2), cornerY+(houseH-doorH),doorW, doorH); //Drawing door shape to ensure it remains in the middle
        g.fillRect(cornerX+(houseW/5),cornerY+(houseH/2),winW, winH); //Drawing left side window
        g.fillRect((cornerX+houseW)-((houseW/5)+winW),cornerY+(houseH/2), winW, winH); //Drawing right side window

    }
    public static void main(String[] args){
        House screen = new House(); //Initializing the visual screen.
    }
}
