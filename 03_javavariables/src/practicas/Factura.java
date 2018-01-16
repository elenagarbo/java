/**
 * 
 */
package practicas;

import java.util.Scanner;

public class Factura {
//Por consola te pregunto cuántas unidades quieres de camisas.
	//cuando me lo digas ... te detallo la factura.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Cuantas camisas quieres?");
		Scanner entrada= new Scanner(System.in);
		int camisas =entrada.nextInt();
		float precio= 6.5f;
		float subtotal = camisas * precio;
		float iva = subtotal * 0.21f;
		float total= subtotal + iva;
		
		System.out.println("El precio sin iva es  "+ subtotal+ "€");
		System.out.println("El IVA es de "+ iva + "€");
		System.out.println("El precio con Iva es "+ total + "€");
		
	}

}
