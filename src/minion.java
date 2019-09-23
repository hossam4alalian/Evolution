import java.awt.Color;
import java.awt.Graphics2D;

public class minion {
	private double x;
	private double y;
	
	
	private int size;
	
	private double angle;
	private double speed;
	
	

	public minion(int x, int y, int size) {
		this.x=x;
		this.y=y;
		this.size=size;
		this.angle=0;
		this.speed=2;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillOval((int)x, (int)y, size, size);
	}
	
	public void move() {
		double xvel=  speed*Math.cos(angle);
		double yvel=  speed*Math.sin(angle);
		
		
		x+=xvel;
		y+=yvel;
		
		yvel=0;
		xvel=0;
		
	}
	
	public void moveTo(int px, int py) {
		double dx=x -px;
		double dy=y-py;
		
		
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
