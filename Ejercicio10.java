package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio10 extends Frame implements WindowListener, ActionListener, MouseListener, KeyListener {
	private static final long serialVersionUID = 1L;

	Button btnInicio = new Button("Iniciar");
	Label lblJug1 = new Label("Jugador 1:");
	Label lblJug2 = new Label("Jugador 2:");
	TextField txtJug1 = new TextField(20);
	TextField txtJug2 = new TextField(20);


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
	Panel juego = new Panel();

	TextField txtGanador = new TextField(25); 
	Button btnNuevo = new Button("Reiniciar");
	Panel informacion = new Panel();

	int turno = 0;
	boolean fin = false;

	public Ejercicio10() {
		setLayout(new FlowLayout());
		setTitle("Inicio");
		add(lblJug1);
		add(txtJug1);
		txtJug1.addMouseListener(this);
		add(lblJug2);
		add(txtJug2);
		txtJug2.addMouseListener(this);
		add(btnInicio);
		btnInicio.setPreferredSize(new Dimension(150,20));
		btnInicio.setForeground(Color.BLUE);
		btnInicio.setBackground(Color.WHITE);
		lblJug1.setForeground(Color.BLUE);
		lblJug2.setForeground(Color.RED);
		txtJug1.setBackground(Color.WHITE);
		txtJug2.setBackground(Color.WHITE);
		setBackground(Color.LIGHT_GRAY);
		setSize(300,130);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false); 

		juego.setLayout(new GridLayout(3,3));
		juego.add(btn1);
		juego.add(btn2);
		juego.add(btn3);
		juego.add(btn4);
		juego.add(btn5);
		juego.add(btn6);
		juego.add(btn7);
		juego.add(btn8);
		juego.add(btn9);

		informacion.setLayout(new FlowLayout());
		txtGanador.setEnabled(false);
		informacion.add(txtGanador);
		informacion.add(btnNuevo);
		btnNuevo.setBackground(Color.GREEN);
		btnNuevo.setForeground(Color.BLUE);

		fJuego.add(informacion, BorderLayout.NORTH);
		fJuego.add(juego, BorderLayout.CENTER);
		fJuego.setBackground(Color.darkGray);
		fJuego.setSize(300,300);
		fJuego.setLocationRelativeTo(null);
		fJuego.setResizable(false);

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
		btnNuevo.addActionListener(this);

		fJuego.addWindowListener(this);
		addWindowListener(this);
		addKeyListener(this);
		txtJug1.addKeyListener(this);
		txtJug2.addKeyListener(this);
	}

	public static void main(String[] args) {
		new Ejercicio10();
	}

	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		if(a.equals(btnInicio)) {
			if((txtJug1.getText().length() != 0)&&(txtJug2.getText().length() != 0)) {
				fJuego.setVisible(true);
			}
			else if(txtJug1.getText().length() == 0) {
				txtJug1.setText("Indica el Jug1");
			}
			else {
				txtJug2.setText("Indica el Jug2");
			}
		}
		else if(a.equals(btnNuevo)) {
			Nuevo();
		}
		else {
			Button boton = (Button) ae.getSource();
			if(turno == 0) {
				if(boton.getLabel().equals("")) {
					boton.setLabel("X");
					boton.setBackground(Color.BLUE);
					boton.setEnabled(false);
					turno = 1;
				}
			}
			else {
				if(turno == 1) {
					boton.setLabel("O");
					boton.setEnabled(false);
					boton.setBackground(Color.RED);
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
		else {
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

	public void mouseClicked(MouseEvent me) {
		if(txtJug1.getText().equals("Indica el Jug1")) {
			txtJug1.selectAll();
			txtJug1.setText("");
		}
		if(txtJug2.getText().equals("Indica el Jug2")) {
			txtJug2.selectAll();
			txtJug2.setText("");
		}
	}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode()==KeyEvent.VK_ENTER) {
			if((txtJug1.getText().length() != 0)&&(txtJug2.getText().length() != 0)) {
				fJuego.setVisible(true);
			}
			if((txtJug1.getText().length() != 0)&&(txtJug2.getText().length() == 0)) {
				txtJug2.requestFocus();
			}
		}
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}


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
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b4.equals("X"))&&(b5.equals("X"))&&(b6.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b7.equals("X"))&&(b8.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b1.equals("X"))&&(b4.equals("X"))&&(b7.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b2.equals("X"))&&(b5.equals("X"))&&(b8.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b3.equals("X"))&&(b6.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b1.equals("X"))&&(b5.equals("X"))&&(b9.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		if((b3.equals("X"))&&(b5.equals("X"))&&(b7.equals("X"))) {
			ganador = 1;
			if(ganador == 1) {
				txtGanador.setText("Ha ganado " + txtJug1.getText());
				fin = true;
			}
		}
		//Ganador Jugador 2
		if((b1.equals("O"))&&(b2.equals("O"))&&(b3.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b4.equals("O"))&&(b5.equals("O"))&&(b6.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b7.equals("O"))&&(b8.equals("O"))&&(b9.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b1.equals("O"))&&(b4.equals("O"))&&(b7.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b2.equals("O"))&&(b5.equals("O"))&&(b8.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b3.equals("O"))&&(b6.equals("O"))&&(b9.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b1.equals("O"))&&(b5.equals("O"))&&(b9.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		if((b3.equals("O"))&&(b5.equals("O"))&&(b7.equals("O"))) {
			ganador = 2;
			if(ganador == 2) {
				txtGanador.setText("Ha ganado " + txtJug2.getText());
				fin = true;
			}
		}
		//En caso de Empate
		if(ganador == 0) {
			if((b1!= "")&&(b2!= "")&&(b3!= "")&&(b4!= "")&&(b5!= "")&&(b6!= "")&&(b7!= "")&&(b8!= "")&&(b9!= "")) {
				txtGanador.setText("EMPATE");
				fin = true;
			}
		}
		if(fin) {
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
		}
	}
	public void Nuevo() {
		fin = false;
		txtGanador.selectAll();
		txtGanador.setText("");
		btn1.setLabel("");
		btn2.setLabel("");
		btn3.setLabel("");
		btn4.setLabel("");
		btn5.setLabel("");
		btn6.setLabel("");
		btn7.setLabel("");
		btn8.setLabel("");
		btn9.setLabel("");
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn1.setBackground(Color.WHITE);
		btn2.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		btn4.setBackground(Color.WHITE);
		btn5.setBackground(Color.WHITE);
		btn6.setBackground(Color.WHITE);
		btn7.setBackground(Color.WHITE);
		btn8.setBackground(Color.WHITE);
		btn9.setBackground(Color.WHITE);
	}
}
