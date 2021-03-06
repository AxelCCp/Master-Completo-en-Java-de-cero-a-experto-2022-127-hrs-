package A3_4_operadores;

public class A6_41_OperadoresLogicos {

	public static void main(String[] args) {
		
		//TIPOS PRIMITIVOS NUMÉRICOS Y UN BOOLEAN
		int i =3;
		byte j = 7;		
		float k = 127e-7F;
		double l = 2.1413e3;
		boolean m = false;
		
		//EVALUAR RELACIONES DE IGUALDAD
		boolean b1 = i==j && k>l;						
		System.out.println("b1 = " + b1);		// R : false

		boolean b2 = i<j && k<l;						
		System.out.println("b2 = " + b2);		// R : true
		
		boolean b3 = i<j && k<l && m==false;						
		System.out.println("b3 = " + b3);		// R : true
		
		
		boolean b4 = i<j || k<l;						
		System.out.println("b4 = " + b4);		// R : true
		
		boolean b5 = i<j || k>l;						
		System.out.println("b5 = " + b5);		// R : true
		
		boolean b6 = i==j || k>l;						
		System.out.println("b6 = " + b6);		// R : false
		
		boolean b7= i==j || (k<l || m==false);						
		System.out.println("b7 = " + b7);		// R : true
		
	
		
		
		
		
		
		
	}

}
