package es.studium.Temario;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoBotones extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;
	
	Button btn1 = new Button("Uno");
	Button btn2 = new Button("Dos");
	Label lblResultado = new Label("......");
	
	public EventoBotones() {
		setTitle("Diferenciar botones");
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(lblResultado);
		addWindowListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventoBotones();
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

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)) {
			lblResultado.setText("Uno");
		}
		else {
			lblResultado.setText("Dos");
		}
	}
}
