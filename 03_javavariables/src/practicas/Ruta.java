/**
 * 
 */
package practicas;

import java.util.Scanner;

/**
 * @author Curso mañana
 *
 */
public class Ruta {

	/**Ruta 
Pide al usuario una ruta (A, B, C, D, E)
En cada ruta... muestra por consola.. un mensaje con la fecha de
inicio y el precio (estos datos te los inventas tu)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Selecciona una ruta A, B, C, D, E");
		Scanner ruta = new Scanner(System.in);
		String dato= ruta.next();
		
		switch (dato) {
		case "A":
			System.out.println("Salida el 01-01 por 100€");
			break;
			
		case "B":
			System.out.println("Salida el 02-02 por 200€");
			break;
			
		case "C":
			System.out.println("Salida el 03-03 por 300€");
			break;
			
		case "D":
			System.out.println("Salida el 04-04 por 400€");
			break;
			
		case "E":
			System.out.println("Salida el 05-05 por 500€");
			break;

		default:
			System.out.println("Esa ruta no existe");
			break;
		}
	}

}
