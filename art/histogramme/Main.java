import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Histogramme");
        fenetre.setBackground(Color.GRAY);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(600, 500);
        fenetre.setLocationRelativeTo(null);
        Dessin dessin = new Dessin();
        for(int i = 0 ; i < 10 ; i++)
            dessin.ajouterHisto(new Histogramme("Jean", (int) Math.floor(Math.random() * 21)));
        fenetre.setContentPane(dessin);
        fenetre.setVisible(true);
        
    }
}