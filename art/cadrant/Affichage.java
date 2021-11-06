import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Affichage {

    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);

        Forme f = new Forme();
        f.setPreferredSize(new Dimension(500, 500));

        fenetre.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;
        gbc.gridx = 0;

        fenetre.add(f, gbc);

        JPanel jpButtons = new JPanel(new GridBagLayout());

        JButton bGauche = new JButton("Gauche");
        JButton bDroite = new JButton("Droite");
        bGauche.setPreferredSize(new Dimension(100, 50));
        bDroite.setPreferredSize(new Dimension(100, 50));

        bGauche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f.setI(f.getI()+15);
                f.removeAll();
                f.updateUI();
                f.paintComponent(f.getGraphics());
            }
        });

        bDroite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f.setI(f.getI()-15);
                f.removeAll();
                f.updateUI();
                f.paintComponent(f.getGraphics());
            }
        });

        KeyListener kl = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent keyEvent) { }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.VK_RIGHT){
                    f.setI(f.getI()+15);
                    f.removeAll();
                    f.updateUI();
                    f.paintComponent(f.getGraphics());
                } else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT){
                    f.setI(f.getI()-15);
                    f.removeAll();
                    f.updateUI();
                    f.paintComponent(f.getGraphics());
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) { }
        };

        f.setFocusable(true);
        f.requestFocus();
        f.requestFocusInWindow();

        f.addKeyListener(kl);

        jpButtons.add(bGauche, gbc);

        gbc.gridx = 1;
        jpButtons.add(bDroite, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;

        fenetre.add(jpButtons, gbc);
        fenetre.pack();
        fenetre.setVisible(true);

    }

}
