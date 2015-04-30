import java.util.Random;

import javax.swing.JOptionPane;

public class ClassworkStuffYeah {
public static void main(String[] args){
	
		int num = 0;
		int a;
		Random gen = new Random();
		do {
			a = gen.nextInt(11);
			num = num + 1;
			System.out.println("Random #" + num + " is " + a);
		} while ( a < 7);
	}	
}
