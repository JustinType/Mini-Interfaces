import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

	public class Rond extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			this.setBackground(new Color(0,0,0,0));
			
			int y = this.getHeight();
			int x = this.getWidth();
			
			g.setColor(Color.BLUE);
			g.fillOval(0,0,50,50);

			
		}
}
