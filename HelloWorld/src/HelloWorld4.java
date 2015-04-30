
import javax.swing.JOptionPane;


public class HelloWorld4 {
	public static void main(String args[]) {
		
		String response;
		int a, b, c;
	
		
		response = JOptionPane.showInputDialog("enter a number");
		response = JOptionPane.showInputDialog("enter a number");
		response = JOptionPane.showInputDialog("enter a number");
		
		a = Integer.parseInt(response);
		b = Integer.parseInt(response);
		c = Integer.parseInt(response);
		
		System.out.println("a is " + a + " b is " + b + " c is " +c);
	}
}

