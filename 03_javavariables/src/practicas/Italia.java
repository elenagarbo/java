/**
 * 
 */
package practicas;

import java.util.Scanner;

public class Italia {
//Por consola te pregunta... la capital de Italia. 
//hasta que no digas roma... no deja de preguntarte.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// touppercase, al escribirlo con mayusculas o miusculas lo mete como mayuscula
		//intetnar hacerlo con Do WHILE 
		
		
		String capital =" ";
		
		while (!capital.toUpperCase().equals("ROMA")) {
		
		System.out.println("¿Cuál es la capital de Italia?");
		Scanner entrada = new Scanner(System.in);
		capital= entrada.next();
		}
		
	}
}
	


