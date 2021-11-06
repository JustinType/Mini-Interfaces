import javax.swing.*;
import java.awt.*;

public class Forme extends JPanel {

    private static int i = 90;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int w = this.getWidth();
        int h = this.getHeight();

        g.setColor(Color.black);
        g.fillRect(0, 0, w, h);

        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{250, 500, 250, 0}, new int[]{0, 250, 500, 250}, 4);

        g.setColor(Color.RED);
        g.fillRect(125,125, 250, 250);

        g.setColor(Color.green);
        g.fillOval(125, 125, 250, 250);

        g.setColor(Color.BLUE);
        //coordonnees coin haut gauche, largeur et hauteur du rectangle, angle depart, angle arrive
        g.fillArc(this.getWidth()/4,this.getHeight()/4,this.getWidth()/2,this.getHeight()/2, i, 50);
    }



    public int getI(){
        return i;
    }

    public void setI(int k){
        this.i = k;
    }

}
