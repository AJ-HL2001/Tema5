package es.studium.Ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio7 extends Frame {
	private static final long serialVersionUID = 1L;
	
	MenuBar barraMenu = new MenuBar();
	Menu menuArticulos = new Menu("Articulos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	
	MenuItem mniArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticulosConsultar = new MenuItem("Consultar Artículo");
	
	MenuItem mniClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniClientesConsultar = new MenuItem("Consultar Cliente");
	
	MenuItem mniFacturasNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturasCnsultar = new MenuItem("Consultar Factura");
	
	public Ejercicio7() {
		setLayout(new FlowLayout());
		setTitle("Menú");
		setMenuBar(barraMenu);
		
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
		
		setSize(300,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio7();
	}
}
