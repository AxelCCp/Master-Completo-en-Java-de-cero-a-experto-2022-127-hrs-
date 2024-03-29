package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A1_68_WrapperInteger {

	public static void main(String[] args) {
		
		
		//ESTO EST� DEPRECATED DESDE LA VERSI�N 7
		Integer intObjeto1 = new Integer(2876);
		
		//FORMA EXPLISITA DE CREAR UN OBJ DE TIPO REFERENCIAL. //FORMA EXPLICITA.
		Integer intObjeto2 = Integer.valueOf(283243);
		
		//ESTA ES LA FORMA AUTOM�TICA DE CREAR UN OBJ DE TIPO DE REFERENCIA.  //FORMA AUTOM�TICA IMPL�CITA.
		Integer intObjeto3 = 176321;
		
		//SE CONVIERTE UN PRIMITIVO EN UN OBJ DE TIPO DE REFERENCIA
		int intPrimitivo = 7384;
		Integer intObj4 = Integer.valueOf(intPrimitivo);

		
		//SE CONVIERTE UN OBJ DE REFERENCIA A UN TIPO PRIMITIVO
		int num = intObj4;  		 	//FORMA AUTOM�TICA IMPL�CITA.
		int num2 = intObj4.intValue();	//FORMA EXPLICITA.
		
		
		//SE CONVIERTE DE UN TIPO STRING A UN TIPO INTEGER
		String valorTvLcd = "23452";
		Integer  valor = Integer.valueOf(intPrimitivo); 
		
		//PERDIDA DE INFORMACI�N AL PASAR UN INTEGER A UN SHORT. // LA PERDIDA DE INFORMACI�N SE PRODUCIR� CUANDO EL VALOR INTEGER SUPERE AL VALOR M�XIMO DE SHORT.
		Short shortObj = intObjeto2.shortValue();
		System.out.println(shortObj);
		//PERDIDA DE INFORMACI�N
		Byte byteObj = intObjeto2.byteValue();
		System.out.println(byteObj);
		//AQU� NO SE PIERDE LA INFORMACI�N
		Long longObj = intObjeto2.longValue();
		System.out.println(longObj);
	}

}
