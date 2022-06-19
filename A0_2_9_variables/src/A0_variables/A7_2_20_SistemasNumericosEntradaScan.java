package A0_variables;

import java.util.Scanner;

public class A7_2_20_SistemasNumericosEntradaScan {

	public static void main(String[]args){
		
		//RECIBE EL INPUT STREAM QUE SON LOS DATOS DE ENTRADA DE A TERMINAL
		Scanner scanner  = new Scanner(System.in);
	
		System.out.println("ingresa un numero entero");
	
		String numerostr = scanner.nextLine();			//EL NEXTLINE DEJA EXPERANDO A LA CONSOLA HASTA QUE SE INGERSE UN NUMERO. 	
		
		int numeroDecimal = 0;

	
		try{

			numeroDecimal = Integer.parseInt(numerostr);

		}catch (NumberFormatException e){
			System.out.println("Error...ingesa un n�mero entero");
			main(args);					//SE VUELVE A EJECUTAR EL MAIN EN CASO DE ERROR.
			System.exit(0);
		}
		
		System.out.println("ingresaste este n�mero: " + numeroDecimal);
		
		
	}
	
}
