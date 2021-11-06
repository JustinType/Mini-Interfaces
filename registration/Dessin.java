import javax.swing.*;
import java.awt.*;

public class Dessin extends JPanel {

    private String immatriculation;
    private String numeroDep;

    public Dessin(String imat, String numDep) {
        super();
        this.immatriculation = imat;
        this.numeroDep = numDep;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        g.setColor(Color.BLUE);
        g.fillRect(0, 0, w / 8, h);
        g.fillRect(7 * w / 8, 0, w / 8, h);

        g.setColor(Color.WHITE);
        g.drawOval(w / 80 , h / 16, w / 10, w / 10);
        g.drawRect(71 * w / 80 , h / 16, w / 10, w / 10);

        g.setFont(new Font("Arial", Font.BOLD, 45));
        g.drawString("F", 3 * w / 80, 7 * h / 8);
        g.drawString(this.numeroDep, 72 * w / 80, 7 * h / 8);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 70));
        g.drawString(this.immatriculation.toUpperCase(), w / 5, 5 * h / 8);
    }
}