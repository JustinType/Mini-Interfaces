import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Dessin extends JPanel{
	
	int y1;
	int x1;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		int y = this.getHeight();
		int x = this.getWidth();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, x, y);
		
		g.setColor(Color.RED);
		g.drawLine(0, this.y1, x, this.y1);
		g.drawLine(this.x1, 0, this.x1, y);
		
	}
	
	public void setMouse(int x1, int y1) {
		this.y1 = y1;
		this.x1 = x1;
	}
	
	
}
