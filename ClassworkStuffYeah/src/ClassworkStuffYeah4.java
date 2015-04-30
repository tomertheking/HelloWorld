import java.util.Random;

import javax.swing.JOptionPane;

public class ClassworkStuffYeah4 {
public static void main(String[] args) {
	

	int a, b;
	int userNum, sum;
	String response;
	int userAns;
	int numRight = 0;
	int numWrong = 0;
	Random gen = new Random();
	do {
		a = gen.nextInt (101);
		b = gen.nextInt (101);
		sum = a + b;
		response = JOptionPane.showInputDialog("What is " + a + " + " + b + "?");
		userAns = Integer.parseInt(response);
		
		if ( userAns == sum ) {
			
			numRight = numRight + 1;
			
			System.out.println("You're right!");
		}
		
		if ( userAns != sum) {
			
			numWrong = numWrong +1;
			
			System.out.println("You're wrong!");
		}
		
		System.out.println("You now have " + numRight + " right and " + numWrong + " wrong.");
	
	} while ( numRight <= 10);
	
	}
}