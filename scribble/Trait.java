import java.awt.Color;

public class Trait {

	private int[] x;
	private int[] y;
	private Color c;
	private int index = 0;
	
	public Trait (Color couleur) {
		this.c = couleur;
		this.x = new int[999999];
		this.y = new int[999999];	
	}
	
	public int getX(int x) {return this.x[x];}
	
	public int getY(int y) {return this.y[y];}
	
	public Color getColor() {return this.c;}
	
	public void setPoint(int x, int y) {
		this.x[index]  = x;
		this.y[index]  = y;	
		index++;
	}
}
