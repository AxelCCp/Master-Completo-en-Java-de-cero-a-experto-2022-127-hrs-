package A4_5_flujosDeControl;

import java.util.Scanner;

public class A7_Tarea7 {

	
	public static void main(String[] args) {
		
		/*
		 * Crear una clase con el m�todo main donde el desaf�o es buscar el n�mero menor de m�nimo 10 valores enteros, 
		 * usando la clase Scanner ingresar la cantidad de n�meros a comparar, luego utilizando una sentencia for iterar 
		 * el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
			
			Calcular el menor n�mero e imprimir el valor.

			Si el menor n�mero es menor que 10, imprimir "El n�mero menor es menor que 10!". 
			si no, imprimir " el numero menor es igual o mayor que 10!".
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int[]numeros = new int[10];		
		String numString;
		int num;
		
		for(int i=0;i<10;i++) {
			
				System.out.println("Ingresa 10 n�meros enteros (" + (i+1) + " de 10) :");
				numString = scan.nextLine(); 
				
				try {
					num = Integer.parseInt(numString);
					numeros[i] = num;
				}catch(Exception e) {
					System.out.println("ERROR, ingresaste un elemento diferente a un numero.");
					i--;
				}
					
				if(i==9) {
					scan.close();
					break;
				}
		}
		
	
		
		for(int z=0; z<numeros.length; z++) {
			System.out.print(" - " + numeros[z] + " - ");
			
		}
		
		
	}
	
}
