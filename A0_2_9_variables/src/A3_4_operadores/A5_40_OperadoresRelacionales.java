package A3_4_operadores;

public class A5_40_OperadoresRelacionales {
	public static void main(String[] args) {
		
		//TIPOS PRIMITIVOS NUMÉRICOS Y UN BOOLEAN
		int i =3;
		byte j = 7;		
		float k = 127e-7F;
		double l = 2.1413e3;
		boolean m = false;
		
		//EVALUAR RELACIONES DE IGUALDAD
		boolean b1 = i==j;						
		System.out.println("b1 = " + b1);		// R : false
		
		boolean b2 = !b1;
		System.out.println("b2 = " + b2);		// R : true
		
		boolean b3 = i != j;
		System.out.println("b3 = " + b3);		// R : true
		
		boolean b4 = m == true;
		System.out.println("b4 = " + b4);		// R : false
		
		boolean b5 = m != true;
		System.out.println("b5 = " + b5);		// R : true
		
		boolean b6 = i > j;
		System.out.println("b6 = " + b6);		// R : false
		
		boolean b7 = i < j;
		System.out.println("b7 = " + b7);		// R : true
		
		boolean b8 = l >= k;
		System.out.println("b8 = " + b8);       // R : true  
		
		boolean b9 = l <= k;
		System.out.println("b9 = " + b9);		// R : false
		
	}
}
