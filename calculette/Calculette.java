import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculette extends JPanel{
	private String valMemoire, valAffiche, op;

	public Calculette() {
		
		// Création des composants
		final JTextField tf = new JTextField("0.0");
		tf.setColumns(30);
		JButton zero = new JButton("0");
		JButton un = new JButton("1");
		JButton deux = new JButton("2");
		JButton trois = new JButton("3");
		JButton quatre = new JButton("4");
		JButton cinq = new JButton("5");
		JButton six = new JButton("6");
		JButton sept = new JButton("7");
		JButton huit = new JButton("8");
		JButton neuf = new JButton("9");
		JButton clear = new JButton("Clr");
		JButton puissance = new JButton("x2");
		JButton plus = new JButton("+");
		JButton moins = new JButton("-");
		JButton fois = new JButton("*");
		JButton diviser = new JButton("/");
		JButton egal = new JButton("=");
		JButton racine = new JButton("sqrt");
		JButton rien1 = new JButton("");
		JButton rien2 = new JButton("");
		
		// Création des JPannel
		JPanel boutons = new JPanel();
		boutons.setLayout(new GridLayout(5, 4));
		boutons.add(sept);
		boutons.add(huit);
		boutons.add(neuf);
		boutons.add(plus);
		boutons.add(quatre);
		boutons.add(cinq);
		boutons.add(six);
		boutons.add(moins);
		boutons.add(un);
		boutons.add(deux);
		boutons.add(trois);
		boutons.add(fois);
		boutons.add(zero);
		boutons.add(clear);
		boutons.add(puissance);
		boutons.add(diviser);
		boutons.add(rien1);
		boutons.add(rien2);
		boutons.add(racine);
		boutons.add(egal);
		
		JPanel resultat = new JPanel();
		resultat.add(tf);
		
		// Ajout des JPanel dans le "bon ordre"
		this.setLayout(new BorderLayout());
		this.add(resultat, BorderLayout.NORTH);
		this.add(boutons, BorderLayout.CENTER);
		
		
		// Programmation des boutons
		
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "0";
					} else {
						valAffiche = valAffiche+"0";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "0";
					} else {
						valMemoire = valMemoire+"0";
					}
				}
			}
		});
		
		un.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "1";
					} else {
						valAffiche = valAffiche+"1";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "1";
					} else {
						valMemoire = valMemoire+"1";
					}
				}
			}
		});
		
		deux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "2";
					} else {
						valAffiche = valAffiche+"2";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "2";
					} else {
						valMemoire = valMemoire+"2";
					}
				}
			}
		});
		
		trois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "3";
					} else {
						valAffiche = valAffiche+"3";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "3";
					} else {
						valMemoire = valMemoire+"3";
					}
				}
			}
		});
		
		quatre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "4";
					} else {
						valAffiche = valAffiche+"4";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "4";
					} else {
						valMemoire = valMemoire+"4";
					}
				}
			}
		});
		
		cinq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "5";
					} else {
						valAffiche = valAffiche+"5";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "5";
					} else {
						valMemoire = valMemoire+"5";
					}
				}
			}
		});
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "6";
					} else {
						valAffiche = valAffiche+"6";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "6";
					} else {
						valMemoire = valMemoire+"6";
					}
				}
			}
		});
		
		sept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "7";
					} else {
						valAffiche = valAffiche+"7";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "7";
					} else {
						valMemoire = valMemoire+"7";
					}
				}
			}
		});
		
		huit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "8";
					} else {
						valAffiche = valAffiche+"8";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "8";
					} else {
						valMemoire = valMemoire+"8";
					}
				}
			}
		});
		
		neuf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == null) {
					if (valAffiche == null) {
						valAffiche = "9";
					} else {
						valAffiche = valAffiche+"9";
					}
					tf.setText(valAffiche);
				} else {
					if (valMemoire == null) {
						valMemoire = "9";
					} else {
						valMemoire = valMemoire+"9";
					}
				}
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valAffiche = null;
				valMemoire = null;
				op = null;
				tf.setText("0.0");
			}
		});
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null) {
					op = "+";	
				}
			}
		});
		
		moins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null) {
					op = "-";	
				}
			}
		});
		
		fois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null && op == null) {
					op = "*";	
				}
			}
		});
		
		diviser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null) {
					op = "/";	
				}
			}
		});
		
		puissance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null) {
					op = "x2";	
				}
			}
		});
		
		racine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null) {
					op = "sqrt";		
				}
			}
		});
		
		egal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valAffiche != null && op != null) {
					float res = calcul();
					tf.setText(Float.toString(res));
					valAffiche = null;
					valMemoire = null;
					op = null;
				}
			}
		});
		
	}
	
	public float calcul() {
		float res = 0;
		if (op.equals("+") && valMemoire != null) {
			res = Float.parseFloat(valAffiche)+Float.parseFloat(valMemoire);
		} else if (op.equals("-") && valMemoire != null) {
			res = Float.parseFloat(valAffiche)-Float.parseFloat(valMemoire);
		} else if (op.equals("*") && valMemoire != null) {
			res = Float.parseFloat(valAffiche)*Float.parseFloat(valMemoire);
		} else if (op.equals("/") && valMemoire != null) {
			res = Float.parseFloat(valAffiche)/Float.parseFloat(valMemoire);
		} else if (op.equals("sqrt")) {
			res = (float)Math.sqrt(Double.parseDouble(valAffiche));
		} else if (op.equals("x2")) {
			res = Float.parseFloat(valAffiche)*Float.parseFloat(valAffiche);
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		JFrame fenetre = new JFrame("Calculette");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculette c = new Calculette();
		c.setPreferredSize(new Dimension(500,500));
		fenetre.setContentPane(c);
		fenetre.pack();
		fenetre.setVisible(true);
	}

}
