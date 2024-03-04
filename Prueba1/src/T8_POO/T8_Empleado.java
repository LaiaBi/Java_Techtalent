package T8_POO;

import javax.swing.Spring;

public class T8_Empleado {
	//Atributos
	private Spring nombre;
	private Spring apellido;
	private int edad;
	private double salario;
	//Metodos
	public boolean plus (double SueldoPlus){
		boolean augmento=false;
		if (edad>40) {
			salario+= SueldoPlus;
			augmento=true;
			return augmento;
		}
		return augmento;
	}
}
