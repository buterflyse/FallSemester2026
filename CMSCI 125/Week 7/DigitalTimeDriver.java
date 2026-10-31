/*
 * Name: Buterflyse
 * Date: 10/30/2026
 * Class: CompSci 125
 * Prof: REDACTED
 * Description: This class allows me to test all of the methods in the class DigitalTime. Pt.2.
 */


public class DigitalTimeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a new Digital Time object
		DigitalTime dt = new DigitalTime(12, 1, true);
		
		//testing all of the accessers:
		
		System.out.println(dt.toString());
		System.out.println(dt.getHour());
		System.out.println(dt.getMin());
		System.out.println(dt.checkAM());
		
		//creating a new Digital Time object using default constructor
		DigitalTime defdt = new DigitalTime();
		
		
		// testing all of the mutators
		
		defdt.setHour(15);
		System.out.println(defdt.toString());
		defdt.setHour(5);
		defdt.setMin(55);
		System.out.println(defdt.toString());
		defdt.setHour(12);
		defdt.setMin(59);
		defdt.setAM(true);
		defdt.plusTime();
		System.out.println(defdt.toString());
		defdt.plusTime();
		System.out.println(defdt.toString());
		defdt.plusTime();
		System.out.println(defdt.toString());
		defdt.plusTime();
		System.out.println(defdt.toString());
		
		defdt.setMin(59);
		defdt.setHour(1);
		System.out.println(defdt.toString());
		defdt.plusTime();
		System.out.println(defdt.toString());
		
	}
	
	

}
