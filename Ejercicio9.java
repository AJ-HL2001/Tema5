package es.studium.Ejercicios;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio9 extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;

	MenuBar barraMenu = new MenuBar();
	Menu menuCitas = new Menu("Agenda de Citas");
	Menu menuEventos = new Menu("Eventos");
	Menu menuDirecciones = new Menu("Libreta de Direcciones");

	Menu menuCitasHerramientas = new Menu("Herramientas");
	Menu menuEventosHerramientas = new Menu("Herramientas");
	Menu menuDireccionesHerramientas = new Menu("Herramientas");

	MenuItem mniCitasHeramientasNuevo = new MenuItem("Añadir Cita");
	MenuItem mniCitasHeramientasEliminar = new MenuItem("Eliminar Cita");
	MenuItem mniCitasHeramientasModificar = new MenuItem("Modificar Cita");
	MenuItem mniCitasConsultar = new MenuItem("Consultar Cita");

	MenuItem mniEventosHerramientasNuevo = new MenuItem("Añadir Evento");
	MenuItem mniEventosHerramientasEliminar = new MenuItem("Eliminar Evento");
	MenuItem mniEventosHerramientasModificar = new MenuItem("Modificar Evento");
	MenuItem mniEventosConsultar = new MenuItem("Consultar Evento");

	MenuItem mniDireccionesHerramientasNuevo = new MenuItem("Añadir Dirección");
	MenuItem mniDireccionesHerramientasEliminar = new MenuItem("Eliminar Dirección");
	MenuItem mniDireccionesHerramientasModificar = new MenuItem("Modificar Dirección");
	MenuItem mniDireccionesConsultar = new MenuItem("Consultar Dirección");

	Dialog dlgMenu = new Dialog(this,"Menu", true);
	Label lblMenu = new Label("");
	
	public Ejercicio9() {
		setLayout(new FlowLayout());
		setTitle("Menú");
		setMenuBar(barraMenu);

		menuCitasHerramientas.add(mniCitasHeramientasNuevo);
		menuCitasHerramientas.add(mniCitasHeramientasModificar);
		menuCitasHerramientas.addSeparator();
		menuCitasHerramientas.add(mniCitasHeramientasEliminar);

		menuEventosHerramientas.add(mniEventosHerramientasNuevo);
		menuEventosHerramientas.add(mniEventosHerramientasModificar);
		menuEventosHerramientas.addSeparator();
		menuEventosHerramientas.add(mniEventosHerramientasEliminar);

		menuDireccionesHerramientas.add(mniDireccionesHerramientasNuevo);
		menuDireccionesHerramientas.add(mniDireccionesHerramientasModificar);
		menuDireccionesHerramientas.addSeparator();
		menuDireccionesHerramientas.add(mniDireccionesHerramientasEliminar);

		menuCitas.add(mniCitasConsultar);
		menuCitas.add(menuCitasHerramientas);

		menuEventos.add(mniEventosConsultar);
		menuEventos.add(menuEventosHerramientas);

		menuDirecciones.add(mniDireccionesConsultar);
		menuDirecciones.add(menuDireccionesHerramientas);

		barraMenu.add(menuCitas);
		barraMenu.add(menuEventos);
		barraMenu.add(menuDirecciones);
		
		mniCitasHeramientasNuevo.addActionListener(this);
		mniCitasHeramientasEliminar.addActionListener(this);
		mniCitasHeramientasModificar.addActionListener(this);
		mniCitasConsultar.addActionListener(this);
		
		mniEventosHerramientasNuevo.addActionListener(this);
		mniEventosHerramientasEliminar.addActionListener(this);
		mniEventosHerramientasModificar.addActionListener(this);
		mniEventosConsultar.addActionListener(this);
		
		mniDireccionesHerramientasNuevo.addActionListener(this);
		mniDireccionesHerramientasEliminar.addActionListener(this);
		mniDireccionesHerramientasModificar.addActionListener(this);
		mniDireccionesConsultar.addActionListener(this);
		
		dlgMenu.setLayout(new FlowLayout());
		dlgMenu.add(lblMenu);
		dlgMenu.setLocationRelativeTo(null);
		dlgMenu.setSize(200,150);
		
		dlgMenu.addWindowListener(this);
		addWindowListener(this);
		setSize(400,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio9();
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		
		if(a.equals(mniCitasHeramientasNuevo)) {
			lblMenu.setText("Nueva Cita");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniCitasHeramientasEliminar)) {
			lblMenu.setText("Eliminar Cita");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniCitasHeramientasModificar)) {
			lblMenu.setText("Modificar Cita");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniCitasConsultar)) {
			lblMenu.setText("Consultar Cita");
			dlgMenu.setVisible(true);
		}
		
		if(a.equals(mniEventosHerramientasNuevo)) {
			lblMenu.setText("Nuevo Evento");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniEventosHerramientasEliminar)) {
			lblMenu.setText("Eliminar Evento");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniEventosHerramientasModificar)) {
			lblMenu.setText("Modificar Evento");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniEventosConsultar)) {
			lblMenu.setText("Consultar Evento");
			dlgMenu.setVisible(true);
		}
		
		if(a.equals(mniDireccionesHerramientasNuevo)) {
			lblMenu.setText("Nueva Dirección");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniDireccionesHerramientasEliminar)) {
			lblMenu.setText("Eliminar Dirección");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniDireccionesHerramientasModificar)) {
			lblMenu.setText("Modificar Dirección");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniDireccionesConsultar)) {
			lblMenu.setText("Consultar Dirección");
			dlgMenu.setVisible(true);
		}
	}
	
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {
		if(dlgMenu.isActive()) {
			dlgMenu.setVisible(false);
		}
		else {
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}