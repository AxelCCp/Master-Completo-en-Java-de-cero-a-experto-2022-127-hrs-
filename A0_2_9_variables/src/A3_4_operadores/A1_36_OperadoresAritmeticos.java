package A3_4_operadores;

import javax.swing.JOptionPane;

public class A1_36_OperadoresAritmeticos {

	
	public static void main(String[]args) {
		
		int i = 5, j = 7, suma = i + j;
		
		System.out.println("Suma : " + suma);  // R : 12
		
		System.out.println("i+j = " + i+j);	   // R : ESTO CONCATENA ... i+j = 57
		
		System.out.println(i+j+"i+j");		   // R : ESTO SUMA Y DESPUES CONCATENA ... 12i+j
		
		System.out.println("i+j = " + (i+j));  // R : PRIMERO REALIZA LA SUMA EN LOS () Y DESPU�S CONCATENA ... i+j = 12
		
		int resta = i - j;
		
	  //System.out.println("i-j = " + i-j);    // R : ESTO DA UN ERROR
		
		System.out.println("i-j = " + (i-j));  // R : i-j = -2
		
		int multi = i*j;
		
		System.out.println("multiplicaci�n = " + i*j);
		
		int div = i/j;
		
		System.out.println("divisi�n = " + div);	// R : 0 ... POR SER VALORES DEL TIPO INT.
		
		float div2 = i/j;
		
		System.out.println("divisi�n = " + div2);   // R : 0.0 ... FALTA HACWRLE CAST AL I Y/O J
		
		div2 = (float)i/(float)j;
		
		System.out.println("divisi�n = " + div2);	// R : 0.71428573 ... OK
		
		int resto = i%j;
		
		System.out.println("resto = " + resto);		// R : resto = 5 ???
		
		resto = 8%5;
		
		System.out.println("resto = " + resto);		// R : resto = 3
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un n�mero"));
		if(numero%2 == 0) {
			System.out.println("El n�mero " + numero + " es PAR");
		}else
			System.out.println("El n�mero " + numero + " es IMPAR");
			
	}
	
	
}
