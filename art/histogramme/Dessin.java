import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Dessin extends JPanel {

    protected ArrayList<Histogramme> histo;

    public Dessin() {
        super();
        this.histo = new ArrayList<Histogramme>();
    }

    public void ajouterHisto(Histogramme h) {
        this.histo.add(h);
    }

    public void afficherAxes(Graphics g) {
        int w = this.getWidth();
        int h = this.getHeight();
        g.drawLine(h/ 16, 15 * h / 16 , h / 16, h/ 16);
        g.drawLine(h/ 16, h / 16 , h / 16 -h/32 , h/ 16 + h/32);
        g.drawLine(h/ 16, h / 16 , h / 16 + h/32 , h/ 16 + h/32);

        g.drawLine(h/ 16, 15 * h / 16 , 15 * w / 16, 15 * h/ 16);
        g.drawLine(15 * w / 16, 15 * h / 16 , 15 * w / 16 - h / 32, 15 * h/ 16 - h / 32);
        g.drawLine(15 * w / 16, 15 * h / 16 , 15 * w / 16 - h / 32, 15 * h/ 16 + h / 32);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.afficherAxes(g);

        int w = this.getWidth();
        int h = this.getHeight();

        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 32));
        int ind = 0;
        for(Histogramme hist : this.histo) {
            int val = hist.getValeur();
            g.setColor(new Color(alea(255), alea(255), alea(255)));
            g.fillRect(h / 16 + ind * (w / 12),
                       15 * h / 16 - val * (h/32),
                       w / 12,
                       val * (h/32)
            );
            g.drawString("" + val,
                        h / 16 + ind * (w / 12),
                       15 * h / 16 - val * (h/32)
            );
            ind++;
        }
    }

    private int alea(int max) {
        return (int) Math.floor(Math.random() * (max+1));
    }
}