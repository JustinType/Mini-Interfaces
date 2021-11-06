import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Connection extends JPanel{

	public Connection() {
		JLabel login = new JLabel("Login :");
		JLabel mdp = new JLabel("Mot de passe :");
		final JTextField tf1 = new JTextField("");
		tf1.setColumns(10);
		final JPasswordField tf2 = new JPasswordField("");
		tf2.setColumns(10);
		JButton b1 = new JButton("OK");
		JButton b2 = new JButton("Annuler");
		
		JPanel haut = new JPanel();
		haut.setLayout(new GridLayout(2, 2));
		haut.add(login);
		haut.add(tf1);
		haut.add(mdp);
		haut.add(tf2);
		
		JPanel bas = new JPanel();
		bas.add(b1);
		bas.add(b2);
		
		this.setLayout(new BorderLayout());
		this.add(haut, BorderLayout.CENTER);
		this.add(bas, BorderLayout.SOUTH);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel loginAffiche = new JLabel("Login : "+tf1.getText()+" - Votre compte est activé");
				haut.removeAll();
				bas.removeAll();
				haut.add(loginAffiche);
				haut.validate();
				repaint();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
			}
		});
		
	}
		
		

	public static void main(String[] args) {
		JFrame fenetre = new JFrame("Connection");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Connection c = new Connection();
		c.setPreferredSize(new Dimension(500,100));
		fenetre.setContentPane(c);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
