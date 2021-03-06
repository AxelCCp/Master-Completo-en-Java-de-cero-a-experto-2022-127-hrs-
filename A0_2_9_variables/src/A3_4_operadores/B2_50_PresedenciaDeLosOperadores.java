package A3_4_operadores;

public class B2_50_PresedenciaDeLosOperadores {
	
	public static void main(String[] args) {
		
		//-- TABLA DE PRESEDENCIA DE LOS OPERADORES --------------------------------------------
		/*	
		 * 		++	--	+	-	!						("+" y "-" SON LOS OPERADORES UNARIOS)
		 * 		()
		 * 		*	/ 	%
		 * 		+	-
		 * 		>	>=	<	<=	instanceof
		 * 		==	!=
		 * 		&&
		 * 		||
		 * 		()	?	:
		 * 		=	+=	-=	*=	/=	%=
		 * 
		 */
		//-- TABLA -----------------------------------------------------------------------------
		
		int i = 14;
		int j = 8;
		int k = 20;
		
		double promedio = i+j+k/3; 				// EQUIVALE A : i+j+(k/3)
		System.out.println(promedio);			// R : 28.0
		
		
		double resultado = i+j+k/3d; 			//MANERA CORRECTA DE OBTENER UN RESULTADO DOUBLE.
		System.out.println(resultado); 			// R : 28.666666666666668     VALOR CORRECTO DOUBLE.
		
		
		double promedio2 = (i+j+k)/3d; 			//MANERA CORRECTA DE OBTENER EL PROMEDIO
		System.out.println(promedio2);			// R : 14.0
		
	
		double resultado2 = i + j + k / 3d * 10;       //1RO DIVIDE...2DO MULTIPLICA...3RO SUMA  
		System.out.println(resultado2);				   // R : 88.66666666666667
	
		
		double resultado3 = (i + j + k) / 3d * 10;     //1RO SUMA...2DO DIVIDE...3RO MULTIPLICA      
		System.out.println(resultado3);				   // R : 140.0
		
		
		double resultado4 = ++i + j-- + k / 3d * 10; 
		//                  (15 + 8)  +  20/3d * 10
		//					    23    +  6.6   * 10
		//						23    +    66           =     89.66666666666667 
		System.out.println(resultado4);	
	}
}
