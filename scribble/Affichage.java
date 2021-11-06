import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Affichage {
	private static Color couleur = Color.black;
	private static String forme = "trait";
	
	public static void main(String[]args) {
		// Création de la fenetre
		JFrame fenetre = new JFrame();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(true);
		fenetre.setLocationRelativeTo(null);
		
		// Création de la zone du dessin
		JPanel m = new JPanel();
		Scribble s = new Scribble();
		s.setPreferredSize(new Dimension(800,800));

	
		// Création des composants
		JButton effacer = new JButton("Effacer");
		JButton retour = new JButton("Retour");
		JComboBox cb = new JComboBox(new String[] {"noir","vert","jaune","bleu","rouge"});
		JComboBox cb2 = new JComboBox(new String[] {"trait","rectangle","rond"});
		
		
		// Ajout des listeners sur les composants
		effacer.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				s.removeAll();
				s.repaint();
			}		
		});
		
		retour.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (forme.equals("trait")) {
					s.effacerTrait();
				} else if (forme.equals("rectangle")) {
					s.effacerRectangle();
				} else {
					s.effacerRond();
				}
				s.repaint();
			}		
		});
		
		cb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				switch (cb.getSelectedIndex()) {
					case 0 :
						couleur=Color.black; break;
					case 1 :
						couleur=Color.green; break;
					case 2 :
						couleur=Color.yellow; break;
					case 3 :
						couleur=Color.blue; break;
					case 4 :
						couleur=Color.red; break;
				}
				s.repaint();
			}
		});
		
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				switch (cb2.getSelectedIndex()) {
					case 0 :
						forme = "trait"; break;
					case 1 :
						forme = "rectangle"; break;
					case 2 :
						forme = "rond"; break;
				}
				s.repaint();
			}
		});
			
		
		
		
		
		// Création des mouse listeners
		MouseMotionListener m1 = new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if (forme.equals("trait")) {
					s.getTrait(s.getNbTraits()).setPoint(x,y);
				} else if (forme.equals("rectangle")) {
					s.getRec(s.getNbRec()).setPoint(x,y);
				} else {
					s.getRond(s.getNbRond()).setPoint(x,y);
				}
				s.repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {}
		};
		
		MouseListener m2 = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				if (forme.equals("trait")) {
					s.ajouterTrait(new Trait(couleur));
				} else if (forme.equals("rectangle")) {
					s.ajouterRectangle(new Rectangle(couleur));
				} else {
					s.ajouterRond(new Rond(couleur));
				}	
			}

			@Override
			public void mouseReleased(MouseEvent e) {}
			
		};
		
		
		
		// Ajout des mouse listeners
		s.addMouseMotionListener(m1);
		s.addMouseListener(m2);
		
		// Ajout des composants dans la zone de dessin
		m.add(effacer);
		m.add(retour);
		m.add(cb2);
		m.add(cb);
		
		
		// Positionnement des composants et de la zone de dessin dans la fenetre
		fenetre.add(m,BorderLayout.NORTH);
		fenetre.add(s,BorderLayout.CENTER);
		
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
