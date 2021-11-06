import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Scribble extends JPanel{

	private ArrayList<Trait> tabTrait;
	private ArrayList<Rectangle> tabRectangle;
	private ArrayList<Rond> tabRond;
	int nbTraits, nbRectangle, nbRond = 0;
	
	
	public Scribble() {
		this.tabTrait = new ArrayList<Trait>();
		this.tabRectangle = new ArrayList<Rectangle>();
		this.tabRond = new ArrayList<Rond>();
	}
	
	// Dessin
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (Trait trait : tabTrait) {
			g.setColor(trait.getColor());
			for (int i = 1 ; trait.getX(i)!=0 ; i++) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(5));
				g2.drawLine(trait.getX(i), trait.getY(i), trait.getX(i-1), trait.getY(i-1));
			}			
		}
		
		// Marche pas
		for (Rectangle rec : tabRectangle) {
			g.setColor(rec.getColor());
			for (int j = 1 ; rec.getX(j)!=0 ; j++) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(5));
				g2.drawRect(rec.getX(j), rec.getY(j), rec.getX(j-1), rec.getY(j-1));
			}			
		}
		
		// Marche pas
		for (Rond rond : tabRond) {
			g.setColor(rond.getColor());
			for (int k = 1 ; rond.getX(k)!=0 ; k++) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(5));
				g2.drawOval(rond.getX(k), rond.getY(k), rond.getX(k-1), rond.getY(k-1));
			}			
		}	
	}
	
	// Permet d'ajouter un trait
	public void ajouterTrait(Trait t) {		
		tabTrait.add(t);
		nbTraits++;
	}
	
	// Permet de supprimer le dernier trait
	public void effacerTrait() {
		tabTrait.remove(nbTraits-1);
		nbTraits--;
	}
	
	// Permet d'ajouter un rectangle
	public void ajouterRectangle(Rectangle r) {		
		tabRectangle.add(r);
		nbRectangle++;
	}
	
	// Permet de supprimer le dernier rectangle
	public void effacerRectangle() {
		tabRectangle.remove(nbRectangle-1);
		nbRectangle--;
	}
	
	
	// Permet d'ajouter un rond
	public void ajouterRond(Rond r) {		
		tabRond.add(r);
		nbRond++;
	}
	
	// Permet de supprimer le dernier rond
	public void effacerRond() {
		tabRond.remove(nbRond-1);
		nbRond--;
	}
	
	// Permet de supprimer le dessin
	public void removeAll() {
		this.tabTrait = new ArrayList<Trait>();
		this.tabRectangle = new ArrayList<Rectangle>();
		this.tabRond = new ArrayList<Rond>();
		this.nbTraits = 0;
		this.nbRectangle = 0;
		this.nbRond = 0;
	}
	
	public int getNbTraits() {
		return this.nbTraits-1;
	}
	
	public Trait getTrait(int i) {
		return this.tabTrait.get(i);
	}
	
	public int getNbRec() {
		return this.nbRectangle-1;
	}
	
	public Rectangle getRec(int i) {
		return this.tabRectangle.get(i);
	}
	
	public int getNbRond() {
		return this.nbRond-1;
	}
	
	public Rond getRond(int i) {
		return this.tabRond.get(i);
	}
	

}

