package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1  extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;
	Button btnCel = new Button("Celsius a  Fahrenheit ");
	Button btnFa = new Button("Fahrenheit a Celsius");
	TextField txtCampo1 = new TextField ();
	TextField txtCampo2 = new TextField ();
	Label lblFa = new Label("Fahrenheit");
	Label lblCel = new Label("Celsius");
	int gradosCel = 0;
	int gradosFa = 0;
	
	public Ejercicio1() {
		setLayout(new GridLayout(3,2));
		setTitle("Conversión de Temperaturas");
		add(lblCel);
		add(txtCampo1);
		add(lblFa);
		add(txtCampo2);
		add(btnCel);
		add(btnFa);
		
		addWindowListener(this);
		btnCel.addActionListener(this);
		btnFa.addActionListener(this);
		setSize(600,175);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio1();
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		
		if(a.equals(btnCel)) {
			txtCampo2.setText(String.valueOf(((Float.parseFloat(txtCampo1.getText())*9)/5)+32));
		}
		else {
			txtCampo1.setText(String.valueOf(((Float.parseFloat(txtCampo2.getText())-32)*5/9)));
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
