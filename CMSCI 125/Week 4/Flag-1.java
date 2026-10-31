/*
Name: Buterflyse
Date: 9/24/2026
Description: This program uses JFrame to draw a picture of the Dominican Flag. It ensures that you can control the flag
size and position by the variables inside th paint method.
 */

import javax.swing.*; //Imports JFrame
import java.awt.*; //Imports Graphics

public class Flag extends JFrame {
    public Flag(){
        setSize(700, 700); // set dimensions of window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // make sure program ends on close
        setVisible(true); // make window visible
        setTitle("Flag"); // Sets title of page to Drawing
    }
    public void paint(Graphics g){
        //Setting the anchor point for the flag
        int cornerX = 100;
        int cornerY = 150;

        //Setting the dimensions for the inner squares and Stripes.
        int flagW = 600;
        int flagH = flagW/2;
        int midStripeW = (flagH/11)*2;

        //Drawing the shapes:
        g.drawLine(cornerX, cornerY, cornerX, cornerY+(flagH*3)); //Drawing the flag pole.
        g.drawRect(cornerX, cornerY, flagW, flagH); // Drawing the flag outline
        g.setColor(Color.BLUE); // Setting the color to blue for the first two boxes.

        // Creating the shapes for both blue boxes in the flag.
        g.fillRect(cornerX, cornerY,flagW-((flagW/2)+(midStripeW/2)), flagH-((flagH/2)+(midStripeW/2)));
        g.fillRect((cornerX+flagW)-(flagW-((flagW/2)+(midStripeW/2))), (cornerY+flagH)-(flagH-((flagH/2)+(midStripeW/2))),flagW-((flagW/2)+(midStripeW/2)), flagH-((flagH/2)+(midStripeW/2)));
        g.setColor(Color.RED); // Setting the color to Red for the following two boxes.

        //Creating the shapes for both red boxes in the flag
        g.fillRect(cornerX, (cornerY+flagH)-(flagH-((flagH/2)+(midStripeW/2))),flagW-((flagW/2)+(midStripeW/2)), flagH-((flagH/2)+(midStripeW/2)));
        g.fillRect((cornerX+flagW)-(flagW-((flagW/2)+(midStripeW/2))), cornerY, flagW-((flagW/2)+(midStripeW/2)), flagH-((flagH/2)+(midStripeW/2)));

        //Add text to drawing
        g.setColor(Color.BLACK);
        g.drawString("This is the Dominican Flag!", 100, 100);
    }
	
	
    public static void main(String[] args){
        Flag screen = new Flag(); //Initializing the display.
    }
}
