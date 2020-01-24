package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 extends Frame implements WindowListener, ItemListener{
	private static final long serialVersionUID = 1L;
	//Definir la lista
	Choice choProv = new Choice();
	Panel pnlGent = new Panel();
	Label lblGent = new Label(".......................................");

	public Ejercicio5() {
		setLayout(new BorderLayout());
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

		add("North",choProv);

		pnlGent.add(lblGent);
		add("South",pnlGent);
		choProv.addItemListener(this);
		addWindowListener(this);
		setSize(400,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio5();
	}

	public void itemStateChanged(ItemEvent ie) {
		if("Álava".equals(ie.getItem())) {
			lblGent.setText("Alavense/Alavensa");
		}
		if("Albacete".equals(ie.getItem())) {
			lblGent.setText("Albanense/Albanensa");
		}
		if("Alicante".equals(ie.getItem())) {
			lblGent.setText("Alicantino/Alicantina");
		}
		if("Albacete".equals(ie.getItem())) {
			lblGent.setText("Albanense/Albanensa");
		}
		if("Almería".equals(ie.getItem())) {
			lblGent.setText("Almeriense/Almeriensa");
		}
		if("Asturias".equals(ie.getItem())) {
			lblGent.setText("Asturiano/Asturiana");
		}
		if("Ávila".equals(ie.getItem())) {
			lblGent.setText("Abulense/Abulensa");
		}
		if("Badajoz".equals(ie.getItem())) {
			lblGent.setText("Pacense/Pacensa");
		}
		if("Barcelona".equals(ie.getItem())) {
			lblGent.setText("Barcelones/Barcelonesa");
		}
		if("Burgos".equals(ie.getItem())) {
			lblGent.setText("Burgales/Burgalesa");
		}
		if("Cáceres".equals(ie.getItem())) {
			lblGent.setText("Cacereño/Cacereña");
		}
		if("Cádiz".equals(ie.getItem())) {
			lblGent.setText("Gaditano/Gaditana");
		}
		if("Cantabria".equals(ie.getItem())) {
			lblGent.setText("Cantabrio/Cantabria");
		}
		if("Castellón".equals(ie.getItem())) {
			lblGent.setText("Castellonense/Castellonensa");
		}
		if("Ciudad Real".equals(ie.getItem())) {
			lblGent.setText("Ciudadrealino/Ciudadrealina");
		}
		if("Córdoba".equals(ie.getItem())) {
			lblGent.setText("Cordobes/Cordobesa");
		}
		if("Cuenca".equals(ie.getItem())) {
			lblGent.setText("Conquense/Conquensa");
		}
		if("Girona".equals(ie.getItem())) {
			lblGent.setText("Gerundense/Gerundensa");
		}
		if("Granada".equals(ie.getItem())) {
			lblGent.setText("Granadino/Granadina");
		}
		if("Guadalajara".equals(ie.getItem())) {
			lblGent.setText("Caracense/Caracensa");
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
