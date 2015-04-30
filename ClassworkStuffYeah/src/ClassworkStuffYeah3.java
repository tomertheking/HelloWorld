import java.util.Random;

import javax.swing.JOptionPane;

public class ClassworkStuffYeah3 {
public static void main(String[] args) {
	
	
	int orig = 100;
	int secretNum;
	int userNum;
	String response;
	String userAns;
	int bet;
	
	Random gen = new Random ();
		secretNum = gen.nextInt(6);
	
	System.out.println("You have $100.");
		
		do {
		
			userAns = JOptionPane.showInputDialog("How much do you want to bet?");
			bet = Integer.parseInt(userAns);
			
			if ( bet <= orig && bet > 0) {
			
		
				orig = orig - bet;
				System.out.println("You are betting $" + bet + ".");
				
				response = JOptionPane.showInputDialog("Guess a number");
				userNum = Integer.parseInt(response);
		
				if ( userNum == secretNum) {
					orig = orig + 2*bet;
					System.out.println("You're right! You now have $" + orig + ".");
				}
			
				if (userNum != secretNum) {
					System.out.println("You guessed " + userNum + " which is WRONG!");
					System.out.println("You now have " + "$" + orig + ".");
				}
			}
			
		} while(orig > 0);
		
	}
}
