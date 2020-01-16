package es.studium.Ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class Ejercicio6 extends Frame {
	private static final long serialVersionUID = 1L;
	
	List listBasket = new List(6, false);
	
	public Ejercicio6() {
		setLayout(new FlowLayout());
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
		
		add(listBasket);
		
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio6();
	}
}
