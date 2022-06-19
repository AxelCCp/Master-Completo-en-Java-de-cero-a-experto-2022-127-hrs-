package A1_strings;

public class B1_25_EjemploString {

	//UN STRING NO ES UN PRIMITIVO, ES UN TIPO ESPECIAL. 
	
	public static void main(String[] args) {
		
		String curso = "Programacion Java";
		
		String curso2 = new String("Programacion Java");	
		
		boolean esIgual = curso == curso2;
		System.out.println("Es igual? = " + esIgual);  //FALSO PQ OCUPAN LUGARES DIFERENTES EN LA MEMORIA.
		
		
		esIgual = curso.equals(curso2);	
		System.out.println(curso.equals(curso2));
		
		
		String curso3 = "Programacion Java";
		esIgual = curso == curso3;
		System.out.println("Es igual? = " + esIgual);  // DA TRUE YA QUE JAVA AHORRA RECURSOS EN MEMORIA, Y TOMA PARA CURSO 3 EL STRING DE CURSO, YA QUE SON IGUALES.
		
	}

}
