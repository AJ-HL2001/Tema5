package es.studium.Temario;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoCerrar extends Frame implements WindowListener{
	private static final long serialVersionUID = 1L;
		
	public EventoCerrar() {
		setTitle("Ventana que se cierra");
		setSize(300,200);
		addWindowListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventoCerrar();
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
