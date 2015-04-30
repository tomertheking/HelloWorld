import processing.core.PApplet;

public class Turtle {
        private float x, y;
        private float direction;	// stored in degrees
        private PApplet p;
        private int color;
        private int weight = 1;
        private boolean pendown = true;
        
        public Turtle(float x, float y, float direction, PApplet p) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.p = p;
            this.color = p.color(0, 180, 0);
            p.fill(color);
        }
        
        public Turtle(PApplet p) {
        	this (p.width/2, p.height/2, 0, p);
        }

        public void forward(float distance) {
            float[] point = pointInDirection(distance, direction);
            if (pendown) {
            	p.stroke(this.color);
            	p.strokeWeight(weight);
            	p.fill(color);
            	p.line(x, y, point[0], point[1]);
            }
            x = point[0];
            y = point[1];
        }

        public void turnRight(float angle) {
            direction -= angle;
        }

        public void turnLeft(float angle) {
            direction += angle;
        }
        
        public void penup() {
        	this.pendown = false;
        }
        
        public void pendown() {
        	this.pendown = true;
        }
        
        public void goToPoint(float x, float y) {
        	this.x = x;
        	this.y = y;
        }
        
        public void setDirection(float direction) {
        	this.direction = direction;
        }
        
        // gets the color a fixed distance ahead of the turtle in its current
        // direction.
        public int getColorAhead(float distance) {
        	p.loadPixels();
        	float[] point = pointInDirection(distance, direction);
        	if (outOfBounds(x, y)) return p.color(0);
        	int newx = (int)point[0];
        	int newy = (int)point[1];
        	p.updatePixels();
        	if (outOfBounds(newx, newy)) return p.color(0);
        	System.out.println("x: " + newx + " y: " + newy);
        	return p.pixels[newy*p.width+newx];
        }

        private boolean outOfBounds(float x2, float y2) {
			return (x2 < 0 || y2 < 0 || x2 >= p.width || y2 >= p.height);
		}

		public float[] pointInDirection(float distance, float direction) {
            float xmag, ymag, newx, newy;
            xmag = distance*PApplet.cos(PApplet.radians(direction));
            ymag = distance*PApplet.sin(PApplet.radians(direction));
            newx = x + xmag;
            newy = y - ymag;
            return new float[] {newx, newy};
        }
        
        public void setColor(int c) {
        	this.color = c;
        }
    }