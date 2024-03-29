package A4_5_flujosDeControl;

import java.util.Scanner;

public class A8_tarea8 {

	
	public static void main(String[] args) {
		
		/*
		 * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). 
		 * Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
		   Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los c�lculos (contadores, sumas).
		   Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		String notaString;
		double nota = 0;
		double[]notas = new double[20]; 
		
		notas:for(int i=0; i<20;i++) {
		
			System.out.println("\nIngresa las 20 notas finales del alumno ("+ (i+1) + " de 20): ");
			notaString = scan.nextLine();
			
			try {
				nota = Double.parseDouble(notaString);
				if(nota == 0.0) {
					i--;
					continue notas; 
				}
			}catch(Exception e) {
				System.out.println("Ingresaste un valor incorrecto");
				i--;
			}
			notas[i] = nota;
			
			for(int j=0; j<=i; j++) {
				System.out.print(notas[j] + " / ");
			}
			
			if(i==19) {
				scan.close();
				break;
			}
		}
		
		
		double sumaNotas = 0;
		int count = notas.length;
		System.out.println("\nTOTAL NOTAS [" + (count) + "] :::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		double masDe5 = 0.0;
		double menosDe4 = 0.0;
		int notasMas5 = 0;
		int notasMenosDe4 = 0;
		int notasIgual1 = 0;
	
		for(int k=0; k<count; k++) {
			System.out.print(notas[k] + " / ");
			sumaNotas += notas[k]; 
			
			if(notas[k] > 5.0) {
				masDe5 += notas[k];
				notasMas5++;
			}else if(notas[k] < 4.0) {
				menosDe4 += notas[k];
				notasMenosDe4++;
				
				if(notas[k] == 1.0) {
					notasIgual1++;
				}
			}
			
		}
		
		double promedio = sumaNotas / count;
		System.out.println("\nPromedio Total Notas = " + promedio);
		System.out.println("\nPromedio de Notas mayores a 5 = " + masDe5/notasMas5);
		System.out.println("Cantidad de notas mayores a 5: " + notasMas5);
		System.out.println("\nPromedio de notas menores a 4 = " + menosDe4/notasMenosDe4);
		System.out.println("Cantidad de notas menores a 4: " + notasMenosDe4);
		System.out.println("\nCantidad de notas iguales a 1 = " + notasIgual1);
		
		
	}
	
}

