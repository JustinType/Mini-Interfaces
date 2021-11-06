import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class TD2 {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setSize(740, 185);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setBackground(Color.WHITE);
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez l'immatriculation : ");
        String im = scan.nextLine();
        System.out.println("Entrez le numéro du département : ");
        String dep = scan.nextLine();
        Dessin dessin= new Dessin(im, dep);
        fenetre.setContentPane(dessin);
        fenetre.setVisible(true);
    }
}