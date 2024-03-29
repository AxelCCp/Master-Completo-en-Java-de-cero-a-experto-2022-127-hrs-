package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A2_69_AutoboxingInteger {

	//ESTO ES ANIDAR UN PRIMITIVO EN LA CLASE INTEGER Y VISEVERSA O COMO SE ESCRIBA
	public static void main(String[] args) {
		
		
		//ARREGLO DE ENTEROS DE REFERENCIA
		//DESDE YA SE EST� HACIENDO UN AUTOBOXING AL CONVERTIR INT PRIMITIVOS A UN [] DE INTEGER
		Integer[]enteros = {1,2,3,4,5,6,7,8,9,10};
		
		Integer[]enteros2 = {1,2,Integer.valueOf(3),4,5,6,7,8,9,10};
		
		
		int suma =0;
		//FORMA EXPLICITA
		//EL intValue() RETORNA EL VALOR DEL INTEGER COMO UN VALOR PRIMITIVO INT
		for(Integer i : enteros2) {
			if(i.intValue() % 2 == 0) {
				suma += i.intValue();
			}
		}
		System.out.println("suma = " + suma);
		
		//FORMA IMPLICITA
		for(Integer i : enteros2) {
			if(i % 2 == 0) {
				suma += i;
			}
		}
		System.out.println("suma = " + suma);
	}
	
}
