package problema2;

import java.util.Scanner;

public class Persona {

	protected Scanner teclado;
	protected String nombre;
	protected int edad;

	public Persona() {
		teclado = new Scanner(System.in);
	}

	public void cargarDatosPersonales() {
		System.out.print("Ingrese el nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
	}

	public void imprimirDatosPersonales() {
		System.out.print("Nombre: " + nombre + " ");
		System.out.print("Edad: " + edad + " ");
	}

}
