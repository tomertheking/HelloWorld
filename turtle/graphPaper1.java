import processing.core.PApplet;

public class graphPaper1 extends PApplet { 
			
	public void setup() {
		size(600, 600);			// set the size of the window
		noLoop();				
		background(0,255,0);		// set the background color
		      
		Turtle duke;
		
		duke = new Turtle(this);
		
		duke.penup();				// Move turtle to upper right corner
		duke.turnLeft(90);
		duke.forward(270);
		duke.turnLeft(90);
		duke.forward(270);
		duke.turnRight(180);
		duke.pendown();
		
		for ( int n = 5; n <= 25; n = n + 1 ) {
			duke.forward(25);
			duke.turnRight(90);
			duke.forward(550);
			duke.turnRight(90);
			duke.forward(25);
			duke.turnRight(90);
			duke.forward(550);
			duke.turnRight(90);
			duke.forward(25);
		}

		duke.turnRight(90);
		
		for ( int n = 5; n <= 25; n = n + 1 ) {
			duke.forward(25);
			duke.turnRight(90);
			duke.forward(550);
			duke.turnRight(90);
			duke.forward(25);
			duke.turnRight(90);
			duke.forward(550);
			duke.turnRight(90);
			duke.forward(25);
		}
			
		duke.forward(25);
		duke.turnRight(90);
		duke.forward(550);
		duke.turnRight(90);
		duke.forward(25);

	
		}
		
		
	public static void main(String[] args) {
		PApplet.main(new String[]{"Main"});
	}
}