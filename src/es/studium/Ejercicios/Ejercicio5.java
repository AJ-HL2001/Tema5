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
		setTitle("Provincias Espa�olas");
		
		choProv.add("�lava");
		choProv.add("Albacete");
		choProv.add("Alicante");
		choProv.add("Almer�a");
		choProv.add("Asturias");
		choProv.add("�vila");
		choProv.add("Badajoz");
		choProv.add("Barcelona");
		choProv.add("Burgos");
		choProv.add("C�ceres");
		choProv.add("C�diz");
		choProv.add("Cantabria");
		choProv.add("Castell�n");
		choProv.add("Ciudad Real");
		choProv.add("C�rdoba");
		choProv.add("Cuenca");
		choProv.add("Girona");
		choProv.add("Granada");
		choProv.add("Guadalajara");
		choProv.add("Guip�zcoa");
		choProv.add("Huelva");
		choProv.add("Huesca");
		choProv.add("Islas Baleares");
		choProv.add("Ja�n");
		choProv.add("La Coru�a");
		choProv.add("La Rioja");
		choProv.add("Las Palmas");
		choProv.add("Le�n");
		choProv.add("Lleida");
		choProv.add("Lugo");
		choProv.add("Madrid");
		choProv.add("M�laga");
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
