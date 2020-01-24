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

public class Ejercicio7 extends Frame implements WindowListener, ActionListener {
	private static final long serialVersionUID = 1L;
	//Crear barra de menu y los tres elementos
	MenuBar barraMenu = new MenuBar();
	Menu menuArticulos = new Menu("Articulos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	//Menus de Articulos
	MenuItem mniArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticulosConsultar = new MenuItem("Consultar Artículo");
	//Menus de Clientes
	MenuItem mniClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniClientesConsultar = new MenuItem("Consultar Cliente");
	//Menus de Facturas
	MenuItem mniFacturasNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturasCnsultar = new MenuItem("Consultar Factura");
	//Crear el dialogo y el label
	Dialog dlgMenu = new Dialog(this, "Ventana Nueva", true);
	Label lblMenu = new Label("");
	
	public Ejercicio7() {
		setLayout(new FlowLayout());
		setTitle("Menú");
		setMenuBar(barraMenu);
		//Añadir los menus a la barra 
		menuArticulos.add(mniArticulosNuevo);
		menuArticulos.add(mniArticulosEliminar);
		menuArticulos.add(mniArticulosConsultar);

		menuClientes.add(mniClientesNuevo);
		menuClientes.add(mniClientesEliminar);
		menuClientes.add(mniClientesConsultar);

		menuFacturas.add(mniFacturasNueva);
		menuFacturas.add(mniFacturasCnsultar);

		barraMenu.add(menuArticulos);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
		
		//Añadir los listener
		mniArticulosNuevo.addActionListener(this);
		mniArticulosEliminar.addActionListener(this);
		mniArticulosConsultar.addActionListener(this);
		
		mniClientesNuevo.addActionListener(this);
		mniClientesEliminar.addActionListener(this);
		mniClientesConsultar.addActionListener(this);
		
		mniFacturasNueva.addActionListener(this);
		mniFacturasCnsultar.addActionListener(this);
		
		//Establecer la ventana dlgMenu
		dlgMenu.setLayout(new FlowLayout());
		dlgMenu.add(lblMenu);
		dlgMenu.setLocationRelativeTo(null);
		dlgMenu.setSize(200,150);
		
		dlgMenu.addWindowListener(this);
		addWindowListener(this);
		setSize(300,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio7();
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		
		//Articulos
		if(a.equals(mniArticulosNuevo)) {
			lblMenu.setText("Nuevo Artículo");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniArticulosEliminar)) {
			lblMenu.setText("Eliminar Artículo");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniArticulosConsultar)) {
			lblMenu.setText("Consultar Artículo");
			dlgMenu.setVisible(true);
		}
		
		//Clientes
		if(a.equals(mniClientesNuevo)) {
			lblMenu.setText("Nuevo Cliente");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniClientesEliminar)) {
			lblMenu.setText("Eliminar Cliente");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniClientesConsultar)) {
			lblMenu.setText("Consultar Cliente");
			dlgMenu.setVisible(true);
		}
		
		//Facturas
		if(a.equals(mniFacturasNueva)) {
			lblMenu.setText("Nueva Factura");
			dlgMenu.setVisible(true);
		}
		if(a.equals(mniFacturasCnsultar)) {
			lblMenu.setText("Consultar Factura");
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