package es.studium.Ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio9 extends Frame {
	private static final long serialVersionUID = 1L;
	
	MenuBar barraMenu = new MenuBar();
	Menu menuCitas = new Menu("Agenda de Citas");
	Menu menuEventos = new Menu("Eventos");
	Menu menuDirecciones = new Menu("Libreta de Direcciones");
	
	Menu menuCitasHerramientas = new Menu("Herramientas");
	Menu menuEventosHerramientas = new Menu("Herramientas");
	Menu menuDireccionesHerramientas = new Menu("Herramientas");
	
	MenuItem mniCitasHeramientasNuevo = new MenuItem("A�adir Cita");
	MenuItem mniCitasHeramientasEliminar = new MenuItem("Eliminar Cita");
	MenuItem mniCitasHeramientasModificar = new MenuItem("Modificar Cita");
	MenuItem mniCitasConsultar = new MenuItem("Consultar Cita");
	
	MenuItem mniEventosHerramientasNuevo = new MenuItem("A�adir Evento");
	MenuItem mniEventosHerramientasEliminar = new MenuItem("Eliminar Evento");
	MenuItem mniEventosHerramientasModificar = new MenuItem("Modificar Evento");
	MenuItem mniEventosConsultar = new MenuItem("Consultar Evento");
	
	MenuItem mniDireccionesHerramientasNuevo = new MenuItem("A�adir Direcci�n");
	MenuItem mniDireccionesHerramientasEliminar = new MenuItem("Eliminar Direcci�n");
	MenuItem mniDireccionesHerramientasModificar = new MenuItem("Modificar Direcci�n");
	MenuItem mniDireccionesConsultar = new MenuItem("Consultar Direcci�n");
	
	public Ejercicio9() {
		setLayout(new FlowLayout());
		setTitle("Men�");
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
		
		setSize(400,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio9();
	}
}
