package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;

public class Ejercicio3 extends Frame {
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

		setSize(330,140);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio3();
	}
}
