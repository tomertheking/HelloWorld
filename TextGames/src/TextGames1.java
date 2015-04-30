import javax.swing.JOptionPane;


public class TextGames1 {
public static void main(String[] args) {
	
	int playOne;
	int playTwo;
	int numStones = 20;
	int winner = 0;
	String response;
	
	
	System.out.println("Welcome to Race to 20.  Try to pick up the last stone.");
	
	do {
			System.out.println("Player 1's turn.");
			do {
				response = JOptionPane.showInputDialog("The pile contains " + numStones + " stones.  Do you want to take 1 or 2 stones?");
				playOne = Integer.parseInt(response);
			} while (playOne != 1 && playOne != 2);
		
			numStones = numStones - playOne;
	
			if (numStones < 0) numStones = 0;
			
			System.out.println("You removed " + playOne + " stones.  The total is now " + numStones + ".");
			
			if (numStones <= 0) {
				winner = 1;
				break;
			}
		
			
			System.out.println("Player 2's turn.");

			do {
				response = JOptionPane.showInputDialog("The pile contains " + numStones + " stones.  Do you want to take 1 or 2 stones?");
				playTwo = Integer.parseInt(response);
			} while (playTwo != 1 && playTwo != 2);	
			
			numStones = numStones - playTwo;
	
			if (numStones < 0) numStones = 0;
			
			System.out.println("You removed " + playTwo + " stones.  The toal is now " + numStones + ".");
			
			if (numStones <=0) {
				winner = 2;
				break;
			}
			
	} while (numStones > 0);
	
	System.out.println("Player " + winner + " is the winner!");
	
	}
}
	
