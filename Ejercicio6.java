package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6 extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;

	List listBasket = new List(4, false);
	Label lblCiudad = new Label("...................");
	
	public Ejercicio6() {
		setLayout(new BorderLayout());
		setTitle("Lista");

		listBasket.add("Andorra");
		listBasket.add("Baskonia");
		listBasket.add("Baxi Manresa");
		listBasket.add("Bilbao Basket");
		listBasket.add("CAI Zaragoza");
		listBasket.add("Divina Seguros Joventut");
		listBasket.add("Estudiantes");
		listBasket.add("FC Barcelona");
		listBasket.add("Ford Burgos");
		listBasket.add("Fuenlabrada");
		listBasket.add("Herbalife G.C.");
		listBasket.add("Iberostar T.");
		listBasket.add("Monbus Obradoiro");
		listBasket.add("Real Betis");
		listBasket.add("Real Madrid");
		listBasket.add("UCAM Murcia");
		listBasket.add("Unicaja");
		listBasket.add("Valencia Basket");

		add("North",listBasket);
		add("South",lblCiudad);
		listBasket.addActionListener(this);
		addWindowListener(this);
		setSize(300,130);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio6();
	}
	
	public void actionPerformed(ActionEvent e) {
		if("Andorra".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Andorra");
		}
		if("Baskonia".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Vitoria");
		}
		if("Baxi Manresa".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Manresa");
		}
		if("Bilbao Basket".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Bilbao");
		}
		if("CAI Zaragoza".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Zaragoza");
		}
		if("Divina Seguros Joventut".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Badalona");
		}
		if("Estudiantes".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Madrid");
		}
		if("FC Barcelona".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Barcelona");
		}
		if("Ford Burgos".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Burgos");
		}
		if("Fuenlabrada".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Fuenlabrada");
		}
		if("Herbalife G.C.".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Gran Canaria");
		}
		if("Iberostar T.".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Tenerife");
		}
		if("Monbus Obradoiro".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Santiago de Compostela");
		}
		if("Real Betis".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Sevilla");
		}
		if("UCAM Murcia".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Murcia");
		}
		if("Unicaja".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Málaga");
		}
		if("Valencia Basket".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Valencia");
		}
		if("Real Madrid".equals(listBasket.getSelectedItem())) {
			lblCiudad.setText("Madrid");
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
