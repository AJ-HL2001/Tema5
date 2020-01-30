package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8 extends Frame implements WindowListener, ActionListener {
	private static final long serialVersionUID = 1L;

	float operador1, operador2, resultado;
	int operacion;
	boolean segundo, fin;

	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btn0 = new Button("0");
	Button btnMas = new Button("+");
	Button btnMenos = new Button("-");
	Button btnEntre = new Button("/");
	Button btnPor = new Button("*");
	Button btnPunto = new Button(".");
	Button btnIgual = new Button("=");

	TextField txtResultado = new TextField();

	public Ejercicio8() {
		setLayout(new FlowLayout());
		setTitle("Calculadora");

		setLayout(new GridLayout(5,4));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btnMas);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btnMenos);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btnPor);
		add(btnPunto);
		add(btn0);
		add(btnIgual);
		add(btnEntre);
		add(txtResultado);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btnMas.addActionListener(this);
		btnMenos.addActionListener(this);
		btnEntre.addActionListener(this);
		btnPor.addActionListener(this);
		btnPunto.addActionListener(this);
		btnIgual.addActionListener(this);

		addWindowListener(this);
		setSize(240,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Ejercicio8();
	}

	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		if(a.equals(btn1)) {
			if(segundo) {
				operador2 = 1;
			}
			else {
				operador1 = 1;
			}
		}
		if(a.equals(btn2)) {
			if(segundo) {
				operador2 = 2;
			}
			else {
				operador1 = 2;
			}
		}
		if(a.equals(btn3)) {
			if(segundo) {
				operador2 = 3;
			}
			else {
				operador1 = 3;
			}
		}
		if(a.equals(btnMas)) {
			//Suma
			segundo = true;
			operacion = 1;
		}
		if(a.equals(btn4)) {
			if(segundo) {
				operador2 = 4;
			}
			else {
				operador1 = 4;
			}
		}
		if(a.equals(btn5)) {
			if(segundo) {
				operador2 = 5;
			}
			else {
				operador1 = 5;
			}
		}
		if(a.equals(btn6)) {
			if(segundo) {
				operador2 = 6;
			}
			else {
				operador1 = 6;
			}
		}
		if(a.equals(btnMenos)) {
			//Resta
			segundo = true;
			operacion = 2;
		}
		if(a.equals(btn7)) {
			if(segundo) {
				operador2 = 7;
			}
			else {
				operador1 = 7;
			}
		}
		if(a.equals(btn8)) {
			if(segundo) {
				operador2 = 8;
			}
			else {
				operador1 = 8;
			}
		}
		if(a.equals(btn9)) {
			if(segundo) {
				operador2 = 9;
			}
			else {
				operador1 = 9;
			}
		}
		if(a.equals(btnPor)) {
			//Multiplicacion
			segundo = true;
			operacion = 3;
		}
		if(a.equals(btnPunto)) {
			//Decimales
		}
		if(a.equals(btn0)) {
			if(segundo) {
				operador2 = 0;
			}
			else {
				operador1 = 0;
			}
		}
		if(a.equals(btnEntre)) {
			//Division
			segundo = true;
			operacion = 4;
		}
		if(a.equals(btnIgual)) {
			switch(operacion) {
			case 1:
				resultado = operador1 + operador2;
				fin = true;
				break;
			case 2:
				resultado = operador1 - operador2;
				fin = true;
				break;
			case 3:
				resultado = operador1 * operador2;
				fin = true;
				break;
			case 4:
				resultado = operador1 / operador2;
				fin = true;
				break;
			}
			segundo = false;
			operacion = 0;
			fin = true;
		}
		if(fin) {
			txtResultado.setText(String.valueOf(resultado));
			fin = false;
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
