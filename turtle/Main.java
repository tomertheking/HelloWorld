import processing.core.PApplet;

public class Main extends PApplet { 
	public static Turtle yertle, max;
	
	public void setup() {
		size(600, 600);			// set the size of the window
		noLoop();				
        background(253,50,0);		// set the background color

        int greenish = color(23, 251, 23);
        int x = color(0,29, 199);
        yertle = new Turtle(this);	// create a new turtle
        max = new Turtle(this);
        int count = 0;
        
        yertle.setColor(x);
        
        yertle.forward(50);
        yertle.turnRight(90);
        yertle.forward(50);
        yertle.turnRight(90);
        yertle.forward(50);
        yertle.turnRight(90);
        yertle.forward(50);
        yertle.turnRight(90);
        
        max.setColor(greenish);
        
        max.penup();
        max.forward(50);
        max.turnRight(20);
        max.forward(18);
        max.pendown();
       
        do {
        	max.forward(20);
        	max.turnRight(90);
        	count = count + 1;
        	max.forward(20);
        	max.turnRight(90);
        	count = count + 1;
        	max.forward(20);
        	max.turnRight(90);
        	count = count + 1;
        	max.forward(20);
        	max.turnRight(90);
        	count = count + 1;
        } while (count < 10);
        
        max.penup();
        max.forward(20);
        max.turnLeft(90);
        max.forward(20);
        max.turnLeft(47);
        max.pendown();
        
        max.forward(75);
        max.turnRight(120);
        max.forward(75);
        max.turnRight(120);
        max.forward(75);
        
        
	}
	
	public static void main(String[] args) {
		PApplet.main(new String[]{"Main"});
	}
}