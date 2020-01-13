package es.studium.Temario;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoCerrarBoton extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;

	Button btnCerrar = new Button("CERRAR");
	
	public EventoCerrarBoton() {
		setTitle("Ventana que se cierra");
		setLayout(new FlowLayout());
		setSize(300,200);
		add(btnCerrar);
		addWindowListener(this);
		btnCerrar.addActionListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventoCerrarBoton();
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

	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}

}
