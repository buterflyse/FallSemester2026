import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Please enter the amount of money you have: ");
		int origWallet = scan.nextInt();
		int wallet = origWallet;
		int die1 = rand.nextInt(1,7);
		int die2 = rand.nextInt(1,7);
		int total = die1+die2;
		int betOut;
		
		if(wallet <= 0){
			System.out.println("NOT ENOUGH! Please enter the amount of money you have:");
			wallet = scan.nextInt();
		}
		while (wallet > 0) {
			
			System.out.println("Place your bet: ");
			int betInput = scan.nextInt();
			
			
			if(betInput <= 0) {
				System.out.println("Error: not enough money bet.");
				break;
			}else if(betInput > wallet) {
				System.out.println("Error: don't bet more than you have.");
				break;
			}else {
				System.out.println("You rolled a " + die1 + " and a " + die2);
				if(total == 3 || total == 6 || total == 9) {
					betOut = betInput *2;
					System.out.println("The dice rolled a total of " + total + ", you win $" + betOut + "!" );
					wallet = wallet + betOut;
					System.out.println("You now own $" + wallet);
				}else if(total == 12) {
					System.out.println("The dice rolled a total of " + total + ", you broke even.");
					System.out.println("You now own $" + wallet);
				}else {
					wallet = wallet - betInput;
					System.out.println("The dice rolled a total of " + total + ", you lose!");
					System.out.println("You now own $" + wallet);
				}
				System.out.println("Do you want to play again? (enter: 1 = yes or 0 = no): ");
				
				int gate = scan.nextInt();
				
				if(gate == 0) {
					break;
				}else if(gate ==1) {
					die1 = rand.nextInt(1,7);
					die2 = rand.nextInt(1,7);
					total = die1 +  die2;
				} else {
					System.out.println("Gonna take that as a yes. :)");
				}
				
			}
			
		}
		
		String outro;
		int dif;
		if(wallet > origWallet) {
			dif = wallet - origWallet;
			System.out.println("In total, you won $" + dif +"! your remaining balance is $" + wallet +", Congragulations! :)");
		} else if(wallet < origWallet) {
			dif = origWallet - wallet;
			System.out.println("In total, you lost $" + dif +", your remaining balance is $" + wallet +", better luck next time! :(");
		} else {
			dif = 0;
			System.out.println("In the end, you broke even, you won nothing, you lost nothing. Leave.");
		} 
		
	
	}

}
