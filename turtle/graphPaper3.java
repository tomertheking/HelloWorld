import processing.core.PApplet;

public class graphPaper3  extends PApplet {

	public void setup() {
	
		size(600, 600);			// set the size of the window
		noLoop();				
		background(0,255,0);		// set the background color

		Turtle alaska;
		
		alaska = new Turtle(this);
		
		alaska.penup();				// Move turtle to upper right corner
		alaska.turnLeft(90);
		alaska.forward(270);
		alaska.turnLeft(90);
		alaska.forward(250);
		alaska.turnRight(180);
		alaska.pendown();
		
		alaska.forward(475);
		
		for (int x = 1; x<=13; x++) {				// Draws the outline for each row
			alaska.turnRight(60);
			alaska.forward(25);
			alaska.turnRight(60);
			alaska.forward(25);
			alaska.turnRight(60);
			alaska.forward(475);
		
			alaska.penup();					
			alaska.turnRight(60);
			alaska.forward(25);
			alaska.turnRight(60);
			alaska.pendown();
		
			for (int n = 1; n<=20; n++) {			// Draws the triangles inside the outline
				alaska.forward(25);
				alaska.turnRight(120);
				alaska.forward(25);
				alaska.turnRight(60);
				alaska.forward(25);
				alaska.turnRight(120);
				alaska.forward(25);
				alaska.turnRight(120);
				alaska.forward(25);
				alaska.turnLeft(60);
			}
		
			alaska.turnRight(180);				// Goes to next row
			alaska.forward(25);
			alaska.turnLeft(120);
		}
		
		
		
	}
	
public static void main(String[] args) {
	PApplet.main(new String[]{"Main"});
	}
}