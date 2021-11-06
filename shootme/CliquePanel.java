import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class CliquePanel{
	
	
	public static void main(String[]args) {
		JFrame win = new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setResizable(true);
		win.setLocationRelativeTo(null);
		Dessin dess =new Dessin();
		dess.setPreferredSize(new Dimension(500, 500));
		Rond r = new Rond();
		
		r.setPreferredSize(new Dimension(50, 50));
		r.setBounds((int)(Math.random()*500),(int)(Math.random()*500) , 50, 50);
		
		MouseMotionListener m1 = new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent arg0) {}

			@Override
			public void mouseMoved(MouseEvent e) {
				dess.setMouse(e.getX()-10, e.getY()-40);
				win.repaint();
			}
		};
		
		MouseListener m2 = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				r.setBounds((int)(Math.random()*(win.getWidth()-60)),(int)(Math.random()*(win.getHeight()-90)) , 50, 50);
			}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			
			
		};
		
		win.addMouseMotionListener(m1);
		r.addMouseListener(m2);
		win.add(r);
		win.add(dess);
		win.pack();
		win.setVisible(true);
	}
}
