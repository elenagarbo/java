/**
 * 
 */
package practicas;

import java.util.Scanner;

//por consola me preguntas cuantas unidades quieres. despues a que precio quieres,
//pones el precio,  te saca el total, precio con decimales

public class Venta {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("¿Cuántas unidades quieres?");
			Scanner entrada = new Scanner(System.in);
			int unidades = entrada.nextInt();
			System.out.println("¿A qué precio quieres?");
			float precio = entrada.nextFloat();
			System.out.println("el total es " + unidades * precio);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Debe ser un nummero");
			
	
		}
		
		
	}

}
