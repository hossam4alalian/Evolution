import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class minions {
	
	
	
	ArrayList<minion> m= new ArrayList<minion>();
	public minions() {
		
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		for( int i=0; i<m.size(); i++) {
			m.get(i).draw(g);
		}
	}
	
	public void add(int amount, int x, int y, int size) {
		for(int i=0; i<amount; i++) {
			m.add(new minion(x, y, size));
			
		}
	}
	
	public void move() {
		
		for( int i=0; i<m.size(); i++) {
			m.get(i).move();
			m.get(i).setAngle(Math.PI);
		}
	}
	
}
