/**
 * 
 */
package practicas;

import java.util.Scanner;

/**
 * @author Curso mañana
 *
 */
public class Comision {

	/**
	Los meses de enero, julio y octubre... tienes una comisión de 500
en febrero y noviembre ... de 800
el resto de meses... solo 250

el usuario introduce por consola mes que quiere consultar... y muestras
el resultado correspondiente.  con switch 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mete un mes");
		Scanner comision = new Scanner(System.in);
		String mes= comision.next();
		
		switch (mes) {
		case "enero": case "julio": case "octubre":
			System.out.println("Tiene una comision de 100€");
			break;
			
		case "febrero": case "noviembre":
			System.out.println("Tiene una comision de 200€");
			break;
			
		case "marzo": case "abril": case "mayo": case "junio":
			System.out.println("Tiene una comision de 300€");
			break;
		

		default:
			System.out.println("Esa ruta no existe");
			break;
		}
	}

}
