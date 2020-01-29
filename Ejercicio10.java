package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio10 extends Frame implements WindowListener, ActionListener {
	private static final long serialVersionUID = 1L;

	Button btnInicio = new Button("Iniciar");
	Label lblJug1 = new Label("Jugador 1:");
	Label lblJug2 = new Label("Jugador 2:");
	TextField txtJug1 = new TextField(20);
	TextField txtJug2 = new TextField(20);

	Dialog dlgGanador = new Dialog(this, "Ganador", true);
	Label lblGanador = new Label("");
	Button btnNuevaP = new Button("Otra Partida");
	Button btnCerrar = new Button("Cerrar");

	Frame fJuego = new Frame("Tres en Raya");
	Button btn1 = new Button("");
	Button btn2 = new Button("");
	Button btn3 = new Button("");
	Button btn4 = new Button("");
	Button btn5 = new Button("");
	Button btn6 = new Button("");
	Button btn7 = new Button("");
	Button btn8 = new Button("");
	Button btn9 = new Button("");


	int turno = 0;

	public Ejercicio10() {
		setLayout(new FlowLayout());
		setTitle("Inicio");
		add(lblJug1);
		add(txtJug1);
		add(lblJug2);
		add(txtJug2);
		add(btnInicio);

		fJuego.setLayout(new GridLayout(3,3));
		fJuego.add(btn1);
		fJuego.add(btn2);
		fJuego.add(btn3);
		fJuego.add(btn4);
		fJuego.add(btn5);
		fJuego.add(btn6);
		fJuego.add(btn7);
		fJuego.add(btn8);
		fJuego.add(btn9);
		fJuego.setSize(300,300);
		fJuego.setLocationRelativeTo(null);
		fJuego.setResizable(false);

		dlgGanador.setLayout(new FlowLayout());
		dlgGanador.add(lblGanador);
		dlgGanador.add(btnNuevaP);
		dlgGanador.add(btnCerrar);
		dlgGanador.setSize(150,100);
		dlgGanador.setLocationRelativeTo(null);
		dlgGanador.setResizable(false);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnInicio.addActionListener(this);
		btnNuevaP.addActionListener(this);
		btnCerrar.addActionListener(this);

		dlgGanador.addWindowListener(this);
		fJuego.addWindowListener(this);
		addWindowListener(this);
		setSize(300,140);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Ejercicio10();
	}

	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		if(a.equals(btnCerrar)) {
			System.exit(0);
		}
		if(a.equals(btnNuevaP)) {
			dlgGanador.setVisible(false);
			fJuego.setVisible(false);
			Nuevo();
		}
		if(a.equals(btnInicio)) {
			fJuego.setVisible(true);
		}
		else {
			Button boton = (Button) ae.getSource();
			if(turno == 0) {
				if(boton.getLabel().equals("")) {
					boton.setLabel("X");
					boton.setEnabled(false);
					turno = 1;
				}
			}
			else {
				if(turno == 1) {
					boton.setLabel("O");
					boton.setEnabled(false);
					turno = 0;
				}
			}
		}
		Verificar();
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {
		if(fJuego.isActive()) {
			fJuego.setVisible(false);
		}
		else if(dlgGanador.isActive()) {
			dlgGanador.setVisible(false);
			fJuego.setVisible(false);
			Nuevo();
		}
		else {
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

	public void Verificar() {
		Object b1 = btn1.getLabel();
		Object b2 = btn2.getLabel();
		Object b3 = btn3.getLabel();
		Object b4 = btn4.getLabel();
		Object b5 = btn5.getLabel();
		Object b6 = btn6.getLabel();
		Object b7 = btn7.getLabel();
		Object b8 = btn8.getLabel();
		Object b9 = btn9.getLabel();

		int ganador = 0;
		//Ganador Jugador 1
		if((b1.equals("X"))&&(b2.equals("X"))&&(b3.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b4.equals("X"))&&(b5.equals("X"))&&(b6.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b7.equals("X"))&&(b8.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b1.equals("X"))&&(b4.equals("X"))&&(b7.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b2.equals("X"))&&(b5.equals("X"))&&(b8.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b3.equals("X"))&&(b6.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b1.equals("X"))&&(b5.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b3.equals("X"))&&(b5.equals("X"))&&(b7.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		//Ganador Jugador 2
		if((b1.equals("O"))&&(b2.equals("O"))&&(b3.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio10 extends Frame implements WindowListener, ActionListener {
	private static final long serialVersionUID = 1L;

	Button btnInicio = new Button("Iniciar");
	Label lblJug1 = new Label("Jugador 1:");
	Label lblJug2 = new Label("Jugador 2:");
	TextField txtJug1 = new TextField(20);
	TextField txtJug2 = new TextField(20);

	Dialog dlgGanador = new Dialog(this, "Ganador", true);
	Label lblGanador = new Label("");

	Frame fJuego = new Frame("Tres en Raya");
	Button btn1 = new Button("");
	Button btn2 = new Button("");
	Button btn3 = new Button("");
	Button btn4 = new Button("");
	Button btn5 = new Button("");
	Button btn6 = new Button("");
	Button btn7 = new Button("");
	Button btn8 = new Button("");
	Button btn9 = new Button("");


	int turno = 0;

	public Ejercicio10() {
		setLayout(new FlowLayout());
		setTitle("Inicio");
		add(lblJug1);
		add(txtJug1);
		add(lblJug2);
		add(txtJug2);
		add(btnInicio);

		fJuego.setLayout(new GridLayout(3,3));
		fJuego.add(btn1);
		fJuego.add(btn2);
		fJuego.add(btn3);
		fJuego.add(btn4);
		fJuego.add(btn5);
		fJuego.add(btn6);
		fJuego.add(btn7);
		fJuego.add(btn8);
		fJuego.add(btn9);
		fJuego.setSize(300,300);
		fJuego.setLocationRelativeTo(null);
		fJuego.setResizable(false);

		dlgGanador.setLayout(new FlowLayout());
		dlgGanador.add(lblGanador);
		dlgGanador.setSize(150,100);
		dlgGanador.setLocationRelativeTo(null);
		dlgGanador.setResizable(false);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnInicio.addActionListener(this);

		dlgGanador.addWindowListener(this);
		fJuego.addWindowListener(this);
		addWindowListener(this);
		setSize(300,140);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Ejercicio10();
	}

	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		if(a.equals(btnInicio)) {
			fJuego.setVisible(true);
		}
		else {
			Button boton = (Button) ae.getSource();
			if(turno == 0) {
				if(boton.getLabel().equals("")) {
					boton.setLabel("X");
					boton.setEnabled(false);
					turno = 1;
				}
			}
			else {
				if(turno == 1) {
					boton.setLabel("O");
					boton.setEnabled(false);
					turno = 0;
				}
			}
		}
		Verificar();
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {
		if(fJuego.isActive()) {
			fJuego.setVisible(false);
			Nuevo();
		}
		else if(dlgGanador.isActive()) {
			dlgGanador.setVisible(false);
			fJuego.setVisible(false);
			Nuevo();
		}
		else {
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

	public void Verificar() {
		Object b1 = btn1.getLabel();
		Object b2 = btn2.getLabel();
		Object b3 = btn3.getLabel();
		Object b4 = btn4.getLabel();
		Object b5 = btn5.getLabel();
		Object b6 = btn6.getLabel();
		Object b7 = btn7.getLabel();
		Object b8 = btn8.getLabel();
		Object b9 = btn9.getLabel();

		int ganador = 0;
		//Ganador Jugador 1
		if((b1.equals("X"))&&(b2.equals("X"))&&(b3.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b4.equals("X"))&&(b5.equals("X"))&&(b6.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b7.equals("X"))&&(b8.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b1.equals("X"))&&(b4.equals("X"))&&(b7.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b2.equals("X"))&&(b5.equals("X"))&&(b8.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b3.equals("X"))&&(b6.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b1.equals("X"))&&(b5.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b3.equals("X"))&&(b5.equals("X"))&&(b7.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				lblGanador.setText("Ha ganado " + txtJug1.getText());
				dlgGanador.setVisible(true);
			}
		}
		//Ganador Jugador 2
		if((b1.equals("O"))&&(b2.equals("O"))&&(b3.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b4.equals("O"))&&(b5.equals("O"))&&(b6.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b7.equals("O"))&&(b8.equals("O"))&&(b9.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b1.equals("O"))&&(b4.equals("O"))&&(b7.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b2.equals("O"))&&(b5.equals("O"))&&(b8.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b3.equals("O"))&&(b6.equals("O"))&&(b9.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b1.equals("O"))&&(b5.equals("O"))&&(b9.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		if((b3.equals("O"))&&(b5.equals("O"))&&(b7.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				lblGanador.setText("Ha ganado " + txtJug2.getText());
				dlgGanador.setVisible(true);
			}
		}
		//En caso de Empate
		if(ganador == 0) {
			if((b1!= "")&&(b2!= "")&&(b3!= "")&&(b4!= "")&&(b5!= "")&&(b6!= "")&&(b7!= "")&&(b8!= "")&&(b9!= "")) {
				lblGanador.setText("EMPATE");
				dlgGanador.setVisible(true);
			}
		}
	}
	public void Nuevo() {
		btn1.setLabel("");
		btn2.setLabel("");
		btn3.setLabel("");
		btn4.setLabel("");
		btn5.setLabel("");
		btn6.setLabel("");
		btn7.setLabel("");
		btn8.setLabel("");
		btn9.setLabel("");
	}
}