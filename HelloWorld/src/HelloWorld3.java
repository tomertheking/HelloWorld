
import javax.swing.JOptionPane;


public class HelloWorld3 {

	public static void main(String args[]) {
		
		String response;
		double circumference;
		double diameter;
		double area;
		double r;
		
		response = JOptionPane.showInputDialog("Enter the radius");
		
		r = Double.parseDouble(response);
		
		circumference = 2*r*Math.PI;
		diameter = 2*r;
		area = Math.PI*r*r;
	
		System.out.println("If the radius is " + r + ", " + "the corresponding circle's circumference is " + circumference + ", " + "diameter is " + diameter + ", and area is " + area + ".");
	}
}