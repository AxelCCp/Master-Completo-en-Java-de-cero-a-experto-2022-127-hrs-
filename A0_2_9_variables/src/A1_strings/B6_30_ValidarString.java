package A1_strings;

public class B6_30_ValidarString {
	
	
	
	
	public static void main(String[]args) {
		
		String curso = null;
		boolean esNulo = curso == null;
		
		System.out.println("esNulo = " + esNulo);
		
		
		if(esNulo) {
			curso = "Programación en java"; 
		}
		
		
		boolean esVacio = curso.length() == 0;
		
		//if(!(curso.lenght() == 0)){}
		if(esVacio == false) {
			System.out.println(curso.toUpperCase());
			System.out.println("Bienvenido al curso de ".concat(curso));
		}
		
	}
	
	
}
