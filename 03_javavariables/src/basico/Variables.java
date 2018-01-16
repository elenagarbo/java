/**
 * 
 */
package basico;

/**
 * @author Curso mañana
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short edad= 18;
		int numero =1200;
		long largo=5000;
		char descuento= 'y';
		String nombre="Juan";
		boolean estudia= true;
		
		String [] ciudades= new String [50];
		System.out.println(edad);
		
		ciudades [0]= "Madrid";
		ciudades [1]= "Valencia";
		ciudades [2]= "Sevilla";
		
		for(int i= 0; i<ciudades.length; i++) {
			System.out.println(ciudades [i]);
		}
		
				
				

		
	}

}
