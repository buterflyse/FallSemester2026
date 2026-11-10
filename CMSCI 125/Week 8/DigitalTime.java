/*
 * Name: Buterflyse
 * Date: 10/30/2026
 * Class: CompSci 125
 * Prof: REDACTED
 * Description: This class contains a constructor method that allows individuals to use this class as a digital clock that they can manually set and manually advance. Pt.1.
 */



import java.text.DecimalFormat;

public class DigitalTime {

// -- CONSTANT VARIABLES:
	
	private boolean isAM;
	private int hour;
	private int min;
	
	DecimalFormat df = new DecimalFormat("00");
	
	// -- CONSTRUCTOR METHOD SETUPS:
	
	public DigitalTime() {
		isAM = true;
		hour = 12;
		min = 00;
	}
	
	public DigitalTime(int newHour, int newMin, boolean newIsAM) {
		if(newHour >= 1 && newHour <= 12) {
			hour = newHour;
		}
		if(newMin >= 0 && newMin <= 59) {
			min = newMin;
		}
		isAM = newIsAM;
	}
	
	// -- MUTATORS:
		
	public void setMin(int newMin) {
		if(newMin <= 59 && newMin >= 0) {
			min = newMin;
		} 
	}
	
	public void setHour(int newHour) {
		if(newHour <= 12 && newHour >= 1) {
			hour = newHour;
		}
	}
	
	public void toggleAM() {
		if(isAM == true) {
			isAM = false;
		} else {
			isAM = true;
		}
	}
	
	public void plusTime() {
		if(min == 59) {
			min = 0;
			if(hour == 12) {
				hour = 1;
				if(isAM == true) {
					isAM = false;
				} else {
					isAM = true;
				}
			} else {
				hour=hour+1;
			}
		}else {
			min=min+1;
		}
	}
	// -- ACCESSERS:
	
	public String toString() {
		String temp;
		if(isAM == true){temp = "AM";} else {temp = "PM";}
		return hour + ":" + df.format(min) +" "+ temp;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMin() {
		return min;
	}
	
	public boolean checkAM() {
		return isAM;
	}
	
}
