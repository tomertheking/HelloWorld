import java.util.Random;
import javax.swing.JOptionPane;

public class TextGames3 {
	public static void main(String[] args) {
	
		int compOne;
		int compTwo;
		int playAns;
		int count = 0;
		String response;
	
		System.out.println("Welcome to Numerical Hi-Lo!  I will generate a random number between 1 and 100.  You need to guess if my next number will be higher or lower than my last one.");
		
		do {
			Random gen = new Random ();
			compOne = gen.nextInt(101);

			response = JOptionPane.showInputDialog("My number is " + compOne + ".  Type 0 if you think the next number will be lower, and 1 if you think it will be higher.");
			playAns = Integer.parseInt(response);
		
			compTwo = gen.nextInt(101);
		
			if (compOne > compTwo && playAns == 0) {
				count = count + 1;
				System.out.println("You typed 0.  My number was " + compTwo + ".  You won!  Your score is now " + count + ".");
			}
		
			if (compOne > compTwo && playAns == 1) {
				System.out.println("You typed 1.  My number was " + compTwo + ".  You lose!  Your score is now " + count + ".");
			}
	
			if (compOne < compTwo && playAns == 0) {
				System.out.println("You typed 1.  My number was " + compTwo + ".  You lose!  Your score is now " + count + ".");
			}
		
			if (compOne < compTwo && playAns == 1) {
				count = count + 1;
				System.out.println("You typed 0.  My number was " + compTwo + ".  You won!  Your score is now " + count + ".");
			}

		} while (count < 10);

	}
}