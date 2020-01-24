package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	Panel pnl3 = new Panel();
	Button btnCom = new Button("Comprobar");
	Checkbox chk1 = new Checkbox("Correr");
	Checkbox chk2 = new Checkbox("Nadar");
	Checkbox chk3 = new Checkbox("Andar");
	Checkbox chk4 = new Checkbox("Leer");
	Checkbox chk5 = new Checkbox("Ir al cine");
	Checkbox chk6 = new Checkbox("Bailar");
	Checkbox chk7 = new Checkbox("Futbol");
	Checkbox chk8 = new Checkbox("Tenis");
	Checkbox chk9 = new Checkbox("Baloncesto");
	Checkbox chk10 = new Checkbox("Deportes de vela");

	public Ejercicio3() {
		setTitle("Aficiones");
		setLayout(new BorderLayout());
		pnl1.add(chk1);
		pnl1.add(chk2);
		pnl1.add(chk3);
		pnl1.add(chk4);
		pnl1.add(chk5);
		add("North", pnl1);

		pnl2.add(chk6);
		pnl2.add(chk7);
		pnl2.add(chk8);
		pnl2.add(chk9);
		add("Center", pnl2);

		pnl3.add(chk10);
		pnl3.add(btnCom);
		add("South", pnl3);
		
		btnCom.addActionListener(this);
		addWindowListener(this);
		setSize(330,140);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio3();
	}

	public void actionPerformed(ActionEvent arg0) {
		if(chk1.getState() == true) {
			System.out.println(chk1.getLabel());
		}
		if(chk2.getState() == true) {
			System.out.println(chk2.getLabel());
		}
		if(chk3.getState() == true) {
			System.out.println(chk3.getLabel());
		}
		if(chk4.getState() == true) {
			System.out.println(chk4.getLabel());
		}
		if(chk5.getState() == true) {
			System.out.println(chk5.getLabel());
		}
		if(chk6.getState() == true) {
			System.out.println(chk6.getLabel());
		}
		if(chk7.getState() == true) {
			System.out.println(chk7.getLabel());
		}
		if(chk8.getState() == true) {
			System.out.println(chk8.getLabel());
		}
		if(chk9.getState() == true) {
			System.out.println(chk9.getLabel());
		}
		if(chk10.getState() == true) {
			System.out.println(chk10.getLabel());
		}
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}

