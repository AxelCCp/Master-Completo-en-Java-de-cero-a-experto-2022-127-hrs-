package A4_5_flujosDeControl;

public class A6_64_BuclesEtiquetasBuscar {

	public static void main(String[] args) {
		
		//CANTIDAD DE VECES QUE ENCUENTRA EL CARACTER T 
		
		String frase = "tres tristes tigres tragaban trigo en un trigal";
		int max = frase.length();
		int cantidad = 0;
		for(int i=0; i<max; i++) {
			if(frase.charAt(i) != 't') {
				continue;
			}
			cantidad++;
		}
		System.out.println("encontrado = " + cantidad + " veces el caracter 't' en la frase");
	
		
		//AHORA SE BUSCA LA PALABRA TRIGO EN LA FRASE.
		String frase2 = "tres tristes tigres tragaban trigo en un trigal";
		String palabra = "trigo";
		int maxPalabra = palabra.length();		
		int maxFrase2 = frase2.length();
		int cantidad2 = 0;
		
		buscar : for(int i=0; i<maxFrase2; i++) {
			int k = i; 
			for(int j=0; j<maxPalabra;j++) {
				
				if(frase2.charAt(k++) != palabra.charAt(j)) {
					
					continue buscar;
				}
			}
			
			cantidad2++;
			
		}
		System.out.println("encontrado = " + cantidad2 + " veces la palabra " + palabra + " en la frase");
	
		
	}

}
