package A0_variables;

import javax.swing.JOptionPane;

public class A6_2_19_SistemasNumericos2 {

	public static void main(String[]args){

		String numerostr = JOptionPane.showInputDialog(null, "Ingrese un n�mero entero: ");
		int numeroDecimal = Integer.parseInt(numerostr);

		//----------------
		System.out.println("Numero decimal = " + numeroDecimal);
		System.out.println("Numero binario  de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));	

		int numeroBinario = 0b111110100;
		System.out.println("numeroBinario = " + numeroBinario); 	//ESTO VA A IMPRIMIR 500 Y NO EL BINARIO.
		
		System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
		
		int numeroOctal = 0764;
		System.out.println(numeroOctal);  				//VA A IMPRIMIR 500.

		System.out.println("NUMERO HEXADECIMAL DE " + numeroDecimal + " = " +  Integer.toHexString(numeroDecimal));
	
		int numeroHex = 0x1f4;
		System.out.println("n�mero hexadecimal = " + numeroHex); 	//DEBE MOSTRAR 500.
		//----------------

		String mensaje = "N�mero binario de " + numeroDecimal + " = " +  Integer.toBinaryString(numeroDecimal);
		mensaje += "\nnumero octal de " + numeroDecimal  + " = " + Integer.toOctalString(numeroDecimal);
		mensaje += "\nnumero hexadecimal de " +  numeroDecimal  + " = " + Integer.toHexString(numeroDecimal);	
		
		JOptionPane.showMessageDialog(null, mensaje);
	
	}
	
	
}
