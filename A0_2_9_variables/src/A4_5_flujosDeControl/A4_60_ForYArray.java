package A4_5_flujosDeControl;

public class A4_60_ForYArray {
	
	public static void main(String[] args) {
		
		
		String[]nombres = {"Andres","Pape","Maria","Paco","Luis","Bea","Pepa","asd"};
		
		//ESTA ES LA MANERA CORRECTA DE ITERAR SOBRE UN ARRAY, DECLARANDO EL CONTADOR FUERA DEL FOR, PARA QUE NO EVAL�E A CADA VUELTA DE BUCLE.
		int count = nombres.length;
		
		//		   	 i<=count-1;
		for(int i=0; i<count; i++) {
			System.out.println(nombres[i]);
		}	
		
		System.out.println("");
		
		//CON EL CONTINUE SE SALTA LOS VALORES DEL IF PARA QUE NO LOS IMPRIMA.
		for(int i=0; i<count; i++) {
			
			if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("paco")) {
				
				continue;
			}
			System.out.println(nombres[i]);
		}	
	}
}
