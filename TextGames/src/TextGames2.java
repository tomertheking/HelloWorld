import java.util.Random;
import javax.swing.JOptionPane;


public class TextGames2 {
	public static void main(String[] args) {
	
		int rock = 0;
		int paper = 1;
		int scissors= 2;
		String response;
		int compAns;
		int playAns;
		int compWins = 0;
		int count = 0;
		
		System.out.println("Try to win as many games as you can before the I win 10 games!");
		do {
			response = JOptionPane.showInputDialog("Type 0 to choose rock, type 1 to choose paper, type 2 to choose scissors.");
			playAns = Integer.parseInt(response);
		
			Random gen = new Random ();
			compAns = gen.nextInt(3);
			
			if (playAns == 2 && compAns == 1) {
				count = count + 1;
				System.out.println("#" + count + " Scissors vs. Paper...You win!");
			}
		
			if (playAns == 1 && compAns == 0) {
				count = count + 1;
				System.out.println("#" + count + " Paper vs. Rock...You win!");
			}
		
			if (playAns == 0 && compAns == 2) {
				count = count + 1;
				System.out.println("#" + count + " Rock vs. Scissors...You win!");
			}
			
			if (playAns == 0 && compAns == 0) {
				count = count + 1;
				System.out.println("#" + count + " Rock vs. Rock...Draw.");
			}
			
			if (playAns == 1 && compAns == 1) {
				count = count + 1;
				System.out.println("#" + count + " Paper vs. Paper...Draw.");
			}
			
			if (playAns == 2 && compAns == 2) {
				count = count + 1;
				System.out.println("#" + count + " Scissors vs Scissors...Draw.");
			}
			
			if (playAns == 0 && compAns == 1) {
				count = count + 1;
				System.out.println("#" + count + " Rock vs. Paper...You lose!");
				compWins = compWins + 1;
				}
			
			if (playAns == 1 && compAns == 2) {
				count = count + 1;
				System.out.println("#" + count + " Paper vs. Scissors...You lose!");
				compWins = compWins + 1;
				}
			
			if (playAns == 2 && compAns == 0) {
				count = count + 1;
				System.out.println("#" + count + " Scissors vs. Rock...You lose!");
				compWins = compWins + 1;
			}
		} while (compWins < 10);
		System.out.println("You won " + count + " games before I won 10 games.");
	}
}

