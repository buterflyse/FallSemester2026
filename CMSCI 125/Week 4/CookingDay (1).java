/*
 * Name: Buterflyse
 * Date: 09/25/2026
 * Description: For national cooking day, I drew a chicken leg for you to enjoy using JFrame. This program draws it for me.
 */


import java.awt.Color; //Import Color and custom colors.
import java.awt.Graphics; //Import Graphics
import javax.swing.JFrame; //Import JFrame

public class CookingDay extends JFrame {
	public CookingDay() {
		setSize(700, 700); // set dimensions of window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // make sure program ends on close
        setVisible(true); // make window visible
        setTitle("National Cooking Day"); // Sets title of page to Drawings
        
	}
	
	
	public void paint(Graphics g) {
		
		//Setting the initial position of the chicken leg and it's body length and width.
		int initX = 300;
		int initY = 150;
		int chHei = 200;
		int chWid = chHei/2;
		
		// Defining the colors for each of the chicken leg parts.
		Color brown = new Color(102, 51, 0);
		Color lightGrey = new Color(224, 224, 224);
		
		// Setting a white background color for visibility reasons.
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 700);
		
		//Creating the bone and setting the bone color.
		g.setColor(lightGrey);
		g.fillRect(initX+((chWid/2)-(chWid/12)), initY + 75, chWid/6, chHei);
		g.fillOval(initX+((chWid/2)-(chWid/6)), initY+(67 + chHei), chWid/5, chWid/5);
		g.fillOval(initX+((chWid/2)-(chWid/24)), initY+(67 + chHei), chWid/5, chWid/5);
		
		//Creating the chicken meat itself and setting the chicken color.
		g.setColor(brown);
		g.fillOval(initX, initY, chWid, chHei);
		
		// Putting text for the chicken and making sure it shows up in Black.
		g.setColor(Color.BLACK);
		g.drawString("Here is a chicken leg for National Cooking Day!", 100, 100);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CookingDay screen = new CookingDay(); //Initializing the display.
	}

}
