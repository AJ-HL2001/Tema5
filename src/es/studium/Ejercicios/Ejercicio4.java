package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Ejercicio4 extends Frame {
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
		
		setSize(500,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejercicio4();
	}
}