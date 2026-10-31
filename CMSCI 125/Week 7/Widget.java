/*
 * Name: Buterflyse
 * Date: 10/30/2026
 * Class: Comp.Sci. 125
 * Prof: REDACTED
 * Description: This constructor method contains a constructor method that allows individuals to create instances to track how many buttons are within the instance created in the driver. 
 */
public class Widget {
	//Instance variables: 
	private int buttons;
	
	//Constructor Method Setup:
	
	// -- Default constructor
	public Widget()
	{
		this.buttons = 4;
	}
	
	// -- Editable constructor
	public Widget(int buttons)
	{
		this.buttons = buttons;
	}
	
	// Accessor functions:
	
	// -- returns the number of buttons in your widget instance
	public int getButtons()
	{
		return this.buttons;
	}
	
	// -- returns the maximum amount of buttons allowed.
	public static int getMaxButtons()
	{
		return 7;
	}
	
	
	// Mutator functions:
	
	// -- sets a new button amount provided its within the allowed amount
	public void setButtons(int buttons)
	{
		if(buttons <= 7) {
			this.buttons = buttons;
		}
	}
	
	// -- allows you to remove a button.
	public void removeButton()
	{
		this.buttons--;
	}
}
