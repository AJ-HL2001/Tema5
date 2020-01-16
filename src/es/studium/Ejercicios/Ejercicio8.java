package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class Ejercicio8 extends Frame {
	private static final long serialVersionUID = 1L;
	
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
		
		setSize(240,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio8();
	}
}
