package vews;

public class vista extends JFrame{
private static final long serialVersionUID =1L;
public JButton euros,dolares;
private JPanel panelB, panelR;
public JLabel lResultado;
public JTextField campoTexto;

 public vista () {
	 getContentPane().setLayout(new BorderLayout());
	 
	 panelB=new JPanel();
	 panelB.setLayout(new FLowLayout());
	 
	 panelR=new JPanel();
	 panelR.setLayout(new FLowLayout());
	 
	 euros= new JButton ("Convertir a Euros.");
	 dolares= new JButton ("Convertir a Dolares.");
	 
	 lResultado=new JLabel("Resultado");
	 campoTexto=new JTextField (20);
	 
	 panelB.add(euros);
	 panelB.add(dolares);
	 
	 panelR.add(lResultado);
	 
	 add(campoTexto,BorderLayout.north);
	 add(panelB,BorderLayout.south);
	 add(panelR,BorderLayout.center);
 }
}
