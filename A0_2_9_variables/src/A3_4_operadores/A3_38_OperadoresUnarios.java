package A3_4_operadores;

public class A3_38_OperadoresUnarios {

	public static void main(String[]args) {
		
		
		//EXSISTEN 2 OPERADORES UNARIOS, EL   "+"  	Y EL   "-"
		//ESTOS INVIERTEN EL SIGNO DEL N�MERO
		
		//  - * - = +
		//  + * - = -
		
		int i = -5;
		int j = +i;    // j = i*1 = -5
		System.out.println(j);  											// R : -5
		
		int k = -i;    // k = -5*-1 = -(-5) = 5
		System.out.println(k);												// R : 5
		
	}	
	
}
