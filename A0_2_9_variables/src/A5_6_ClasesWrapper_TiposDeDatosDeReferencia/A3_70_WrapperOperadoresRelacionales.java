package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A3_70_WrapperOperadoresRelacionales {

	public static void main(String[] args) {
		
		
		//ESTOS SON OBJ QUE CONTIENEN UN VALOR ANIDADO DENTRO DE LA INSTANCIA INTEGER 
		Integer num1 = Integer.valueOf(1000);
		Integer num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
													//COMPARA POR EL OBJ
		System.out.println("Son el mismo obj ??? " + (num1==num2));  				//TRUE
		
		num2 = 1000;
		
													//COMPARA POR EL OBJ
		System.out.println("Son el mismo obj ??? " + (num1==num2));  				//FALSE
		
		
													//COMPARA POR EL VALOR DEL OBJ
		System.out.println("Son del mismo valor ??? " + (num1.equals(num2))); 		//TRUE	
		
		
													//SE PASA A INT Y SE COMPARA POR VALOR DEL ENTERO
		System.out.println("Son del mismo valor ??? " + (num1.intValue() == num2.intValue())); 		//TRUE
		
		
		//SE PUEDEN COMPARAR OBJ DE TIPO DE REFERENCIA DE MANERA IMPLICITA
		boolean condicion = num1>num2;
		System.out.println("condición=" + condicion);
		
		//COMPARANDO DE MANERA EXPLICITA
		boolean condicion2 = num1.intValue() > num2.intValue();
		System.out.println("condición=" + condicion2);
		
	}
	
}
