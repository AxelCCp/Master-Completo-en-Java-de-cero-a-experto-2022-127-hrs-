package A1_strings;

public class B9_33_ObtenciónDeExtensionDeArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String archivo = "alguna_imagen.jpeg";
		System.out.println("archivo.length() = " + archivo.length()); // R : 18
		//SE OBTIENE LA EXTENSIÓN DEL ARCHIVO
		System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));  //R : jpeg
	
		
		//AHORA SE USA INDEX OF Y SE OBTIENE EL INDICE DONDE ESTÁ EL PUNTO
		String archivo2 = "codigo.js";
		int i = archivo2.indexOf("."); 
		System.out.println("archivo2.substring(i) = " + archivo2.substring(i));  //R : .js
		
		
		String archivo3 = "documento.pdf";
		int x = archivo3.indexOf(".");
		System.out.println("archivo3.substring(x) = " + archivo3.substring(x+1));  //R : pdf
		
		
		//ESTE MÉTODO ESTÁ MEJOR ... lastIndexOf TE DICE LA ÚLTIMA OCURRENCIA DEL PUNTO
		String archivo4 = "otroDocumento.json";
		int y = archivo4.lastIndexOf("."); 
		System.out.println("archivo4.substring(y) = " + archivo4.substring(y+1));   //R : json
		
		
	}
}
