import javax.swing.JOptionPane;


public class HelloWorld2 {

public static void main(String args[]) {

	String response;
	String answer;
	String number;
	double a;
	double b;
	double c;
	double sum;
	double product;
	double average;

	response = JOptionPane.showInputDialog("Enter a number");
	a = Double.parseDouble(response);

	answer = JOptionPane.showInputDialog("Enter another number");
	b = Double.parseDouble(answer);

	number = JOptionPane.showInputDialog("Enter third number");
	c = Double.parseDouble(number);

	sum = a + b + c;
	product = a*b*c;
	average = (a+b+c)/3;

	System.out.println("The sum of " + a + ", " + b + ", " + "and " + c + " is " + sum);
	
	System.out.println("The product of " + a + ", " + b + ", and " + c + " is " + product);
	
	System.out.println("The average of " + a + ", " + b + ", " + "and " + c + " is " + average);


	}
}