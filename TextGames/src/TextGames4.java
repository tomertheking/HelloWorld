import java.util.Random;
import javax.swing.JOptionPane;


public class TextGames4 {
	public static void main(String[] args) {
		
		String response;
		int playNum;
		int compOne;
		int playAns;
		int playCount = 0;
		int compCount = 0;
		
		System.out.println("There are 5 numbers: 1, 2, 3, 4 and 5.  You will choose a number.  You get $2 from this number.  Then, I will choose a random number.  You can choose to either pick again or not.  You get $5 for every additional number you pick, however, if you choose my number I get $25.  Try to beat me to $100.");
	
		do {
			response = JOptionPane.showInputDialog("Pick a number between 1 and 5, inclusive");
			playNum = Integer.parseInt(response);
			playCount = playCount + 2;
	
			response = JOptionPane.showInputDialog("You now have $" + playCount + ".  I have $" + compCount + ".  Do you want to pick again?  If yes type 0, if not type 1.");
			playAns = Integer.parseInt(response);
		
			if (playAns == 0) {
			
				do {
					response = JOptionPane.showInputDialog("Pick a number between 1 and 5, inclusive");
					playNum = Integer.parseInt(response);
			
					Random gen = new Random ();
					compOne = gen.nextInt(6);
			
					if (compOne != playNum) {
						playCount = playCount + 5;
						response = JOptionPane.showInputDialog("You now have $" + playCount + ".  I have $" + compCount + ".  Do you want to pick again?  If yes type 0, if not type 1.");
					}
					
					if (compOne == playNum) {
						compCount = compCount + 25;
						System.out.println("You now have $" + playCount + ".  I have $" + compCount + ".");
					}
				} while (compOne != playNum);
			}
	
		} while (compCount != 100 && playCount != 100);
		if (playCount == 100) {
			System.out.println("You won!");
		} else {
			System.out.println("HAHAHA I won!");
		}
}
}