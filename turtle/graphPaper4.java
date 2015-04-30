import processing.core.PApplet;

public class graphPaper4 extends PApplet {

	public void setup() {
	
		size(600, 600);			// set the size of the window
		noLoop();				
		background(0,255,0);		// set the background color

		Turtle august;
		
		august = new Turtle(this);
		
		august.penup();				// Move turtle to upper right corner
		august.turnLeft(90);
		august.forward(250);
		august.turnLeft(90);
		august.forward(270);
		august.turnRight(180);
		august.pendown();
		
		august.turnLeft(60);
		august.forward(25);
		august.turnRight(60);
		august.forward(50);
		august.turnRight(60);
		august.forward(25);
		august.turnRight(120);
		august.forward(25);
		august.turnRight(60);
		august.forward(25);
		august.turnLeft(120);
		august.forward(25);
		august.turnRight(60);
		august.forward(25);
		august.turnLeft(120);
		august.forward(25);
		august.turnLeft(60);
		august.forward(25);
		august.turnLeft(120);
		august.forward(25);
		august.turnLeft(180);
		august.forward(25);
		august.turnLeft(120);
		august.forward(25);
		
		
		
		

		
		
	}
	
public static void main(String[] args) {
		PApplet.main(new String[]{"Main"});
		}
	}
