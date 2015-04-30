import java.util.Random;

import javax.swing.JOptionPane;

public class ClassworkStuffYeah2 {
public static void main(String[] args) {
	

	int a, b, count = 0;
	int sum;
	Random gen = new Random();
	do {
		a = gen.nextInt (11);
		b = gen.nextInt (11);
		sum = a + b;
		count = count + 1;
		System.out.println("#" + count + " The sum of " + a + " + " + b + " is " + sum + ".");
	} while ( a != b);
	
	
	
	
	}
}