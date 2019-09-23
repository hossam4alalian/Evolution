import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class gui extends JPanel{
	
	boolean setup=true;
	
	BufferedImage bf= new BufferedImage(1200, 800, BufferedImage.TYPE_INT_RGB);
	Graphics2D g2= (Graphics2D) bf.getGraphics();
	
	
	
	minions m= new minions();
	public gui() {
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, 1200, 800);
		if(setup) {
			m.add(1, 400, 400, 30);
			setup=false;
		}
		m.draw(g2);
		m.move();
		
		
		g.drawImage(bf, 0, 0, getWidth(), getHeight(), null);
		repaint();
	}
	
	
	

}
