package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;
	//Definicion de los tres grupos
	CheckboxGroup chkgrMotor = new CheckboxGroup();
	CheckboxGroup chkgrPuertas = new CheckboxGroup();
	CheckboxGroup chkgrPint = new CheckboxGroup();
	//Creacion de los elementos
	//Botones
	Button btnCalc = new Button("Calcular presupuesto");
	//Labels
	Label lblMotor = new Label("¿Tipo de motorización?");
	Label lblPuertas = new Label("¿Número de puertas?");
	Label lblPint = new Label("¿Pintura metalizada?");
	//Checkbox--Grupo de motor
	Checkbox chkMotorGas = new Checkbox("Gasolina", false, chkgrMotor);
	Checkbox chkMotorDies = new Checkbox("Diésel", false, chkgrMotor);
	Checkbox chkMotorHibr = new Checkbox("Hibrido", false, chkgrMotor);
	Checkbox chkMotorElec = new Checkbox("Eléctrico", false, chkgrMotor);
	//Checkbox--Grupo de puertas
	Checkbox chkPuertas3 = new Checkbox("3 Puertas", false, chkgrPuertas);
	Checkbox chkPuertas4 = new Checkbox("4 Puertas", false, chkgrPuertas);
	Checkbox chkPuertas5 = new Checkbox("5 Puertas", false, chkgrPuertas);
	//Checkbox--Grupo de pintura
	Checkbox chkPinturaSi = new Checkbox("Si", false, chkgrPint);
	Checkbox chkPinturaNo = new Checkbox("No", false, chkgrPint);
	
	Dialog dlgPresupuesto = new Dialog(this, "Presupuesto", true);
	Label lblPresupuesto = new Label("Presupuesto:");
	Label lblResultado = new Label("............");
	
	static final int motorGas = 7000;
	static final int motorDies = 8000;
	static final int motorHibr = 9000;
	static final int motorElec = 8500;
	
	static final int puertas3 = 2000;
	static final int puertas4 = 3000;
	static final int puertas5 = 2500;
	
	static final int pinturaSi = 1500;
	
	int resultado = 0;

	public Ejercicio4() {
		setTitle("Vehículos");
		setLayout(new FlowLayout());
		add(lblMotor);
		add(chkMotorGas);
		add(chkMotorDies);
		add(chkMotorHibr);
		add(chkMotorElec);

		add(lblPuertas);
		add(chkPuertas3);
		add(chkPuertas4);
		add(chkPuertas5);

		add(lblPint);
		add(chkPinturaSi);
		add(chkPinturaNo);
		add(btnCalc);
		
		btnCalc.addActionListener(this);
		addWindowListener(this);
		setSize(500,200);
		setLocationRelativeTo(null);
		
		dlgPresupuesto.setLayout(new FlowLayout());
		dlgPresupuesto.add(lblPresupuesto);
		dlgPresupuesto.add(lblResultado);
		dlgPresupuesto.setSize(400, 200);
		dlgPresupuesto.addWindowListener(this);
		dlgPresupuesto.setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ejercicio4();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		   if(chkMotorGas.getState() == true) {
			   resultado = resultado + motorGas;
		   }
		   if(chkMotorDies.getState() == true) {
			   resultado = resultado + motorDies;
		   }
		   if(chkMotorHibr.getState() == true) {
			   resultado = resultado + motorHibr;
		   }
		   if(chkMotorElec.getState() == true) {
			   resultado = resultado + motorElec;
		   }
		   
		   if(chkPuertas3.getState() == true) {
			   resultado = resultado + puertas3;
		   }
		   if(chkPuertas4.getState() == true) {
			   resultado = resultado + puertas4;
		   }
		   if(chkPuertas5.getState() == true) {
			   resultado = resultado + puertas5;
		   }
		   
		   if(chkPinturaSi.getState() == true) {
			   resultado = resultado + pinturaSi;
		   }
		   
		   lblResultado.setText(String.valueOf(resultado));
		   dlgPresupuesto.setVisible(true);
	}
	
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {
		if(dlgPresupuesto.isActive())
		{
			dlgPresupuesto.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}
