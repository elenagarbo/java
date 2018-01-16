/**
 * 
 */
package practicas;

public class Pluviometro {

	/**Durante esta semana ha llovido en litros
	lunes = 15.2
			martes = 7.5
			miercoles = 16.89
			jueves=0
			viernes = 8.58
			sabado = 7.98
			domigo = 25.6
			muestra la media de litros y el total
			**/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float lunes = 15.2f;
//		float martes = 7.5f;
//		float miercoles = 16.89f;
//		float jueves = 0f;
//		float viernes = 8.58f;
//		float sabado = 7.98f;
//		float domingo = 25.6f;
//		float total= lunes + martes + miercoles + jueves + viernes +sabado + domingo;
		
		float lluvia[] = {15.2f, 7.5f, 16.89f,  0f, 8.58f, 7.98f, 25.6f};
		float suma=0;
		for (int i=0; i<lluvia.length; i++){
			suma = suma+lluvia[i];
		}
			
	
		float media = suma / lluvia.length;
		System.out.println("Ha llovido un total de " + suma + " Litros esta semana");
		System.out.println("Ha llovido de media " + media + " Litros esta semana");
		
	}

}
