import processing.core.PApplet;

public class graphPaper2 extends PApplet {

	public void setup() {
		size(600, 600);			// set the size of the window
		noLoop();				
		background(0,255,0);		// set the background color
	
		Turtle charlie;
		
		charlie = new Turtle(this);
		
		charlie.penup();				// Move turtle to upper right corner
		charlie.turnLeft(90);
		charlie.forward(270);
		charlie.turnLeft(90);
		charlie.forward(270);
		charlie.turnRight(180);
		charlie.pendown();
		
		for (int x = 1; x<=11; x++) {				// Duplicate rows
			for (int n = 1; n<=11; n++) {			// Duplicate boxes
				charlie.forward(25);				// Make box
				charlie.turnRight(90);
				charlie.forward(25);
				charlie.turnRight(90);
				charlie.forward(25);
				charlie.turnRight(90);
				charlie.forward(25);
				charlie.turnRight(90);
	
				charlie.penup();					// Makes space between boxes
				charlie.forward(50);
				charlie.pendown();
			}
		
				charlie.penup();					// Move to next row
				charlie.turnRight(90);
				charlie.forward(75);
				charlie.turnRight(90);
				charlie.forward(550);
				charlie.turnRight(90);
				charlie.forward(25);
				charlie.turnRight(90);
				charlie.pendown();
			
		}	
	
	}
	

public static void main(String[] args) {
	PApplet.main(new String[]{"Main"});
	}
}