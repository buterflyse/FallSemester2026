/*
 * Name: Buterflyse
 * Class: CMIS 125 A
 * Date: Friday, Sept. 4 2026 
 */

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte courseCredits = 3;
		char midInitial = 'A';
		int attendanceCost = 50000 + 8160 + 7980;
		boolean springBreak = false;
		byte localTempFar = 75;
		double localTempCel = (double) 5/9 * (localTempFar - 32);
		
		System.out.println("the number of credits for CMIS125A is " + courseCredits);
		System.out.println("Professor Weiss's middle initial is " + midInitial);
		System.out.println("The typical cost of tuition, room, and board at Mount St. Mary's University for an undergrad student is " + attendanceCost);
		System.out.println("True or false: March 7 is the first official date of spring break this academic year: " + springBreak);
		System.out.println("The current temperature in Emmitsburg, MD is " + localTempFar + " degrees Farhenheit.");
		System.out.println("The current temperature in Emmitsburg, MD is " + localTempCel + " degrees Celcius.");
	}

}
