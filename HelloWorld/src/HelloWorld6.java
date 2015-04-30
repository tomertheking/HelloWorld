import java.util.Random;

import javax.swing.JOptionPane;


public class HelloWorld6 {
	public static void main(String args[]) {
		
		Random generator = new Random ();
		int number = generator.nextInt(101);
		int userNumber;
		String response;
		
		do {
			
			response = JOptionPane.showInputDialog("Guess a number");
			userNumber = Integer.parseInt(response);
			
			if (userNumber == number) {
			System.out.println("Too big");
			
			}
		
			if (userNumber > number) {
			System.out.println("Too big");
			
			}
		
			if (userNumber < number) {
			System.out.println("You got it.");
			
			}
			
		} while (userNumber != number);
	}
}