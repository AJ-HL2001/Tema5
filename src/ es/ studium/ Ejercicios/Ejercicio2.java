package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio2 extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	Panel pnl3 = new Panel();
	Panel pnl4 = new Panel();
	TextField txtCampo1 = new TextField (20);
	TextField txtCampo2 = new TextField (20);
	TextField txtCampo3 = new TextField (20);
	Label lblCan = new Label("Introduzca la Cantidad");
	Label lblPor = new Label("Introduzca el Porcentaje");
	Label lblRe = new Label("Resultado:");
	Button btnCal = new Button("Calcular");
	int cant = 0;
	double por = 0;
	double resultado = 0;

	public Ejercicio2() {
		setLayout(new FlowLayout());
		setTitle("Calcular el IVA");

		pnl1.add(lblCan);
		pnl1.add(txtCampo1);
		add(pnl1);

		pnl2.add(lblPor);
		pnl2.add(txtCampo2);
		add(pnl2);
		pnl3.setLayout(new FlowLayout());
		pnl3.add(btnCal);
		pnl3.add(lblRe);
		add(pnl3);

		pnl4.setLayout(new FlowLayout());
		pnl4.add(txtCampo3);
		add(pnl4);
		
		btnCal.addActionListener(this);
		addWindowListener(this);
		setSize(340,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio2();
	}

	public void actionPerformed(ActionEvent arg0) {
		cant = Integer.parseInt(txtCampo1.getText());
		por = Integer.parseInt(txtCampo2.getText());
		resultado = (cant+(cant*(por/100)));
		txtCampo3.setText(String.valueOf(resultado));
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
