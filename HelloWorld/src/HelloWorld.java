import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String args[]) {

			String response;
			double seconds;
			double years;
			
			response = JOptionPane.showInputDialog("Enter a number of years");
			
			years = Double.parseDouble(response);
			
			seconds = years*31536000;
			
					System.out.println("There are " + seconds + " seconds in " + years + " years");

		}
	}