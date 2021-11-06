import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public final class Dessin extends JPanel {

    private int x;
    private int y;

    private int tailleX;
    private int tailleY;

    public Dessin() {
        super();
        this.x = 0;
        this.y = 0;
        this.tailleX = 8;
        this.tailleY = 8;
    }

    public Dessin(int x, int y) {
        super();
        this.x = 0;
        this.y = 0;
        this.tailleX = x;
        this.tailleY = y;
    }

    public void afficherPlateau(Graphics g) {
        boolean col = false;
        int w = getWidth();
        int h = getHeight();
        for(int i = 0 ; i < this.tailleX ; i++) {
            for (int j = 0; j < this.tailleY; j++) {
                col = (! col);
                g.setColor((col) ? Color.BLACK : Color.WHITE);
                g.fillRect(i * (w / this.tailleX), j * (h / this.tailleY), w / this.tailleX, h / this.tailleY);
            }
            col = (! col);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.afficherPlateau(g);
        g.setColor(Color.YELLOW);

        int w = this.getWidth();
        int h = this.getHeight();

        g.fillOval(this.x * (w/this.tailleX), this.y * (h/this.tailleY), (w/this.tailleX), (h/this.tailleY));
    }

    public int demanderEntier() {
        Scanner scan = new Scanner(System.in);
        int entier = 0;
        try {
            entier = scan.nextInt();
            if (entier < 0 || entier > Math.max(this.tailleX, this.tailleY)) throw new Exception();
        }
        catch (Exception e) {
            entier = 0;
        }
        return entier;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}