import javax.swing.JOptionPane;


public class elturt {
	public static void main( String[] args ) {
		String message;
	
		message = JOptionPane.showInputDialog("Type in a message, and " + "I'll display it five times.");
		
		for ( int n = 10 ; n <= 20 ; n = n + 2 ) {
			System.out.println( n + ". " + message );
		}
		
	}
}
