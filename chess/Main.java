import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Echiquier");
        fenetre.setBackground(Color.GRAY);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(600, 600);
        fenetre.setLocationRelativeTo(null);
        Dessin dessin = new Dessin();
        fenetre.setContentPane(dessin);
        fenetre.setVisible(true);
        for(;;) {
            System.out.print("Entrez la nouvelle coordonnée X : ");
            dessin.setX(dessin.demanderEntier());
            System.out.print("Entrez la nouvelle coordonnée Y : ");
            dessin.setY(dessin.demanderEntier());
            dessin.repaint();
        }
    }
}