package es.studium.Ejercicios;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ejercicio5 extends Frame {
	private static final long serialVersionUID = 1L;
	//Definir la lista
	Choice choProv = new Choice();
	
	public Ejercicio5() {
		setLayout(new FlowLayout());
		setTitle("Provincias Españolas");
		
		choProv.add("Álava");
		choProv.add("Albacete");
		choProv.add("Alicante");
		choProv.add("Almería");
		choProv.add("Asturias");
		choProv.add("Ávila");
		choProv.add("Badajoz");
		choProv.add("Barcelona");
		choProv.add("Burgos");
		choProv.add("Cáceres");
		choProv.add("Cádiz");
		choProv.add("Cantabria");
		choProv.add("Castellón");
		choProv.add("Ciudad Real");
		choProv.add("Córdoba");
		choProv.add("Cuenca");
		choProv.add("Girona");
		choProv.add("Granada");
		choProv.add("Guadalajara");
		choProv.add("Guipúzcoa");
		choProv.add("Huelva");
		choProv.add("Huesca");
		choProv.add("Islas Baleares");
		choProv.add("Jaén");
		choProv.add("La Coruña");
		choProv.add("La Rioja");
		choProv.add("Las Palmas");
		choProv.add("León");
		choProv.add("Lleida");
		choProv.add("Lugo");
		choProv.add("Madrid");
		choProv.add("Málaga");
		choProv.add("Murcia");
		choProv.add("Navarra");
		choProv.add("Ourense");
		choProv.add("Palencia");
		choProv.add("Pontevedra");
		choProv.add("Salamanca");
		choProv.add("Segovia");
		choProv.add("Sevilla");
		choProv.add("Soria");
		choProv.add("Tarragona");
		choProv.add("Tenerife");
		choProv.add("Teruel");
		choProv.add("Toledo");
		choProv.add("Valencia");
		choProv.add("Valladolid");
		choProv.add("Vizcaya");
		choProv.add("Zamora");
		choProv.add("Zaragoza");
		
		add(choProv);
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio5();
	}
}
