/*
 * Name: Buterflyse
 * Date: 10/30/2026
 * Class: Comp.Sci. 125
 * Prof: REDACTED
 * Description: This java file is the driver for the widget.java file and contains all of the tests to ensure that all of the widget constructor method functions work.
 */
public class WidgetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Widget wid = new Widget(); // new widget instance
		
		System.out.println(wid.getButtons()); //checking the amount of buttons in instance
		
		System.out.println(wid.getMaxButtons()); //checking the maximum amount of allowed buttons
		
		Widget wid2 = new Widget(7); // Creating a non default widget item
		
		wid2.setButtons(8); //setting buttons to 8
		
		System.out.println(wid2.getButtons()); //checking for changes
		
		wid2.setButtons(6); //setting buttons to 6
		
		System.out.println(wid2.getButtons()); //checking for changes
		
		wid2.removeButton(); //getting rid of a button
		
		System.out.println(wid2.getButtons()); //checking for changes.
		
	}

}
