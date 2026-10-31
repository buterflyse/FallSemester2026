import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Please enter the amount of money you have: ");
		int wallet = scan.nextInt();
		int die1 = rand.nextInt(1,7);
		int die2 = rand.nextInt(1,7);
		int total = die1+die2;
		int betOut;
		
		if(wallet <= 0){
			System.out.println("Error: not enough money to bet");
			System.exit(0);
		}
		
		System.out.println("Place your bet: ");
		int betInput = scan.nextInt();
		
		if(betInput <= 0) {
			System.out.println("Error: not enough money bet.");
		}else if(betInput > wallet) {
			System.out.println("Error: don't bet more than you have.");
		}else {
			System.out.println("You rolled a " + die1 + " and a " + die2);
			if(total == 3 || total == 6 || total == 9) {
				betOut = betInput *2;
				System.out.println("The dice rolled a total of " + total + ", you win " + betOut + "!" );
				wallet = wallet + betOut;
				System.out.println("You now own $" + wallet +", thanks for playing!");
			}else if(total == 12) {
				System.out.println("The dice rolled a total of " + total + ", you broke even.");
				System.out.println("You now own $" + wallet +", thanks for playing!");
			}else {
				wallet = wallet - betInput;
				System.out.println("The dice rolled a total of " + total + ", you lose! :(");
				System.out.println("You now own $" + wallet +", thanks for playing!");
			}
			
		}
	
	}

}
