import javax.swing.JOptionPane;

public class HelloWorld1 {

	public static void main(String args[]) {

		String response;
		double miles, feet;
		
		response = JOptionPane.showInputDialog("Enter a number of miles");
		
		miles = Double.parseDouble(response);
		
		feet = miles*12;
		
		System.out.println("There are " + feet + " feet in " + miles + " miles");
		
		}
	}