package A1_strings;

public class B7_31_StringMetodos {
	
	
	public static void main(String[]args) {
		
		
		//UNA CADENA DE STRING ES UN ARRAY DE CARACTERES.
					//   012345
		String nombre = "andres";
		System.out.println("nombre.lenght() = " + nombre.length());
		System.out.println("nombre.toupperCase() = " + nombre.toUpperCase());
		System.out.println("nombre.tolowerCase() = " + nombre.toLowerCase());nombre.equals(nombre);
		System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
		System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("AndReS"));
		System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("andres"));  							//ESTE M�TODO DA 0 SI SON IGUALES. LOS COMPARA LEXICO GRAFICAMENTE SEG�N LOS VALORES UNICODE.
		System.out.println("nombre.charAt() = " + nombre.charAt(0));											//CONVERTIR UN STRING EN CARACTERES U OBTENER UN CARACTER EN PARTICULAR
		System.out.println("nombre.charAt() = " + nombre.charAt(nombre.length() - 1));                          //PARA OBTENER LA �LTIMA LETRA	
		System.out.println("nombre.subString() = " + nombre.substring(3));										//TOMA DESDE EL �NDICE INDICADO HACIA ADELANTE.
		System.out.println("nombre.subString() = " + nombre.substring(2,5));                                    //2 LO INCLUYE , 5 NO LO INCLUYE
		System.out.println("nombre.subString() = " + nombre.substring(nombre.length() - 1));                    //OBTIENE LA �LTIMA LETRA.	 
	
		String trabalenguas = "trabalenguas";
		System.out.println();
	
	}
}
