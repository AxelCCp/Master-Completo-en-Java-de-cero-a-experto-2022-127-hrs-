package A1_strings;

public class B8_32_String {

	public static void main(String[]args) {
	
		
		//CLASE 32 

		//SE REEMPLAZA UN CARACTER POR OTRO 
		String trabalenguas = "trabalenguas";  
		//SE REEMPLAZAN LAS "a" POR UN PUNTO ... LA INSTANCIA QUE RETORNA EL M�TODO REPLACE CON LA NUEVA CADENA CON PUNTOS, NO REEMPLAZA A LA CADENA ORIGINAL.
		System.out.println("trabalenguas: " + trabalenguas.replace("a","."));


		//M�TODO PARA SABER SI SE ENCUENTRA UN CARACTER DENTRO DE UNA POSICI�N ... RETORNA LA 1RA OCURRENCIA EN QUE APARECE ESTE CARACTER "A".
		System.out.println("trabalenguas.indexOf() : " + trabalenguas.indexOf('a')); //TAMBN PUEDE RECIBIR UN STRING


		//M�TODO QUE TE DICE DONDE OCURRE LA �LTIMA OCURENCIA DE UN CARACTER  ... SI EL CARACTER BUSCADO NO SE ENCUENTRA DENTRO DEL STRING, RETORNA -1
		System.out.println("trabalenguas.lastIndexOf() : " + trabalenguas.lastIndexOf('a')); //TAMBN PUEDE RECIBIR UN STRING


		//ESTE M�TODO EN CAMBIO, DEVUELVE UN BOOLEAN ... Y RECIBE SI O SI UN STRING 
		System.out.println("trabalenguas.contains() : " + trabalenguas.contains("t"));  //TRUE OR FALSE

		//ESTE M�TODO, DEVUELVE UN BOOLEAN ... RECIBE UN STRING ... COMPRUEBA SI UN STRING COMIENZA CON EL STRING INDICADO.
		System.out.println("trabalenguas.startsWith() : " + trabalenguas.startsWith("lenguas"));  //TRUE OR FALSE ... FALSE


		//M�TODO QUE QUITA LOS ESPACIOS EN BLANCO
		String trabalenguas2 = "  trabalenguas ";
		System.out.println(trabalenguas.trim());  
		
		
	}
	
}
