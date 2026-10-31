/*
Name: Buterflyse
Date: 9/24/2026
Description: This program uses JFrame to draw a picture of the Olympic rings.
 */

import javax.swing.*; //imports JFam
import java.awt.*; //imports Graphics

//Creating main window
public class OlympicRIngs extends JFrame {
    public OlympicRIngs(){
        setSize(700, 700); // set dimensions of window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // make sure program ends on close
        setVisible(true); // make window visible
        setTitle("Olympic Rings"); // Sets title of page to Drawing
    }
    public void paint(Graphics g){
        //setting a circle height and width for calculation.
        int cirHeight = 100;
        int cirWidth = 100;

        //setting a start point for calculation.
        int initX = 100;
        int initY = 100;

        // Drawing colored circles below:
        g.setColor(Color.BLUE); //Changing color to blue for first circle.
        g.drawOval(initX, initY, cirWidth, cirHeight); //Drawing 1st circle
        g.setColor(Color.YELLOW); //Changing color to Yellow for second circle.
        g.drawOval(initX+(cirWidth-40),initY+(cirHeight-40),cirWidth,cirHeight); //Drawing 2nd circle
        g.setColor(Color.BLACK); //Changing color to black for third circle.
        g.drawOval(initX+(cirWidth+20), initY, cirWidth, cirHeight); //Drawing 3rd circle
        g.setColor(Color.GREEN); //Changing color to green for fourth circle.
        g.drawOval(initX+(cirWidth+80), initY+(cirHeight-40), cirWidth, cirHeight); //Drawing 4th circle
        g.setColor(Color.RED); //Changing color to red for last circle.
        g.drawOval(initX+(cirWidth+140), initY, cirWidth, cirHeight); //Drawing 5th circle
    }
    public static void main(String[] args){
        OlympicRIngs screen = new OlympicRIngs(); //Initiating the new screen.
    }
}
