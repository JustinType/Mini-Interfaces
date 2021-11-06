import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class DessinArt extends JPanel {
	private int nb;
	
	public DessinArt() {
		// champ de texte
		this.add(new JLabel("Nombre de figures :"));
		final JTextField tf = new JTextField("");
		tf.setColumns(10);
				
				
		// bouton "Dessiner"
		JButton b = new JButton("Dessiner");
		b.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				nb = Integer.parseInt(tf.getText());
				repaint();
			}	
		});
		
		// Ajout des composants
		this.add(b);
		this.add(tf);	
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int h=getHeight();
		int w=getWidth();
		
		for (int i = 0 ; i < this.nb ; i++) {
			int rouge = (int)(Math.random()*255);
			int vert = (int)(Math.random()*255);
			int bleu = (int)(Math.random()*255);
			Color c = new Color(rouge,vert,bleu);
			g.setColor(c);
			
			int x = (int)(Math.random()*w/2);
			int y = (int)(Math.random()*h/2);
			int width = (int)(Math.random()*w);
			int height = (int)(Math.random()*h);
			g.fillOval(x, y, width, height);
		}
	}
	
	
}



public class Art {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame("Art");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DessinArt dessin = new DessinArt();
		dessin.setPreferredSize(new Dimension(500,500));
		fenetre.setContentPane(dessin);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}