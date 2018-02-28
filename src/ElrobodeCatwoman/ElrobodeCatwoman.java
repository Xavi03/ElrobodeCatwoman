package ElrobodeCatwoman;

import java.util.Scanner;


/**
 * <h2>El robo de Catwoman </h2>
 * @version 3-2018
 * @author Xavi Perez
 * @since 20-2-2018
 
*/

public class ElrobodeCatwoman {
	
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Atributo Digito Correcto Caja Fuerte
		 */
		int num = 4359;
		
		/**
		 * Atributo utilizado para simular un booleano
		 */
		int digitosacertados = 0;
		
		/**
		 * Atributo para poder salir del bucle
		 */
		int a = 0;
		
		/**
		 * Atributo Casos de Prueba
		 */
		int casos;
		
		/**
		 * Atributo Digito Caja Fuerte
		 */
		int digitos;
		
		casos = scan.nextInt();
		
		

		while (digitosacertados != 1 && (a < casos)) {
		
			digitos = scan.nextInt();
			error(digitos, num);
			acertada(digitos, num, digitosacertados);
			a++;
		}
		
		if(digitosacertados == 0) {
			cjalarma();
		}
	}
	
		
		/**
		 * Si el atributo digitos es distinto que el atributo num te da un error
		 * @param digitos Digito Prueba  
		 * @param num Contrasenya Caja Fuerte
		 * @return 0
		 */

	public static int error(int digitos, int num) {
		if(digitos != num) {
			cjerror();
		}
		return 0;
	}
	
	/**
	 * Si el atributo digitos es igual que el atributo num te dara un mensaje que te dira que la caja fuerte esta abierta
	 * @param digitos Digito Prueba  
	 * @param num Contrasenya Caja Fuerte
	 * @param digitosacertados Digito Acertado
	 * @return 0
	 */
	public static int acertada(int digitos, int num, int digitosacertados) {
		if(digitos == num) {
			digitosacertados = 1;
			cjabierta();
			System.exit(0); 
		}
		return 0;
	}
	
	/**
	 * Metodo que te devuelve un mensaje de ERROR
	 * @return cajafuerteerror Error de la Caja Fuerte
	 */
	private static String cjerror() {
		String cajafuerteerror = "ERROR";
		System.out.println(cajafuerteerror);
		return cajafuerteerror;
	}
	
	/**
	 * Metodo que te devuelve un mensaje de ALARMA
	 * @return cajafuertealarma Alarma de la Caja Fuerte
	 */
	private static String cjalarma() {
		String cajafuertealarma = "ALARMA";
		System.out.println(cajafuertealarma);
		return cajafuertealarma;	
	}
	
	/**
	 * Metodo que te devuelve un mensaje que te dice que la caja fuerte esta ABIERTA
	 * @return cajafuerteabierta Mensaje acierto en la contrasenya de la Caja Fuerte
	 */
	private static String cjabierta() {
		String cajafuerteabierta = "ABIERTA";
		System.out.println(cajafuerteabierta);
		return cajafuerteabierta;	
	}
}
