package A0_variables;

public class A2_2_13_PrimitivosFloat {

	public static void main(String[]args){
		
		//realFloat EN NOTACI�N CIENT�FICA SE ESCRIBE AS�:	

		float realFloat = 2120f;
		float realFloat2 = 2.12E3f;

		System.out.println("realFloat = " + realFloat);
		System.out.println("realFloat2 = " + realFloat2);

		//EJEMPLO DE CUANDO LA COMA SE CORRE HACIA LA IZQUIERDA CON NOTACI�N CIENT�FICA:

		float realFloat3 = 1.5E-10f;
		float realFloat4 = 0.00000000015f;
	
		System.out.println("realFloat3 = " + realFloat3);
		System.out.println("realFloat4 = " + realFloat4);

		
		//CLASE 14_PRIMITIVOS NUMERICOS DE PUNTO FLOTANTE Y SUS CONSTANTES -----------------------

		System.out.println("float corresponde en bytes a = " + Float.BYTES);
		System.out.println("float corresponde en bits a = " + Float.SIZE);

		System.out.println("M�ximo valor para float es = " + Float.MAX_VALUE);  //EL VALOR LO ARROJA CON NOTACI�N CIENT�FICA,  	3.4028235E38
		System.out.println("M�NIMO valor para float es = " + Float.MIN_VALUE);

		//VALORES DE DOBLE PRESICI�N
		double realDouble = 3.4028235E39;   //SE CAMBIA EL 8 POR EL 9 EN EL �LTIMO D�GITO PAA SUPERAR AL  FLOAT MAX.

		System.out.println("double corresponde en bytes a = " + Double.BYTES);
		System.out.println("double corresponde en bits a = " + Double.SIZE);

		System.out.println("M�ximo valor para double es = " + Double.MAX_VALUE); //1.7976931348623157E308	
		System.out.println("M�NIMO valor para double es = " + Double.MIN_VALUE); //4.9E-324

		
		//USANDO VAR 
		var varFlotante = 3.1416; //POR TENER PUNTO PASA INMEDIATAMENTE A TIPO DOUBLE.  SI SE LE PONE UNA F PASA A FLOTANTE.  TAMBI�N SE PUEDE PONER UNA D PARA INDICAR DE FORMA EXPLICITA QUE ES UN DOUBLE.
		
		var varFlotante2 = 45;  //POR NO TENER PUNTO LA RECONOCER� COMO UNA INT.

		var varFlotante3 = 127f;
	
		System.out.println("varFlotante : "  +  varFlotante);
		System.out.println("varFlotante : "  +  varFlotante2);
		System.out.println("varFlotante : "  +  varFlotante3); 
			
		//SE IMPRIME LA VARIABLE QUE EST� FUERA DEL MAIN. SE PUEDE ACCEDER A ESTA VARIABLE YA QUE ES STATIC IGUAL QUE EL M�TODO MAIN. 
		System.out.println("variableDeClase  : "  +  variableDeClase);
		System.out.println("variableDeClase  : "  +  variableDeClase2); //ES DA 0, YA QUE UNA VARIABLE QUE EST� FUERA DEL MAIN, NO NECESARIAMENTE DEBE TENER UN VALOR INICIALIZADO. MIENTRAS QUE LAS VARIABLES DECLARADAS DENTRO DE UN M�TODO DEBEN ESTAR INICIALIZADAS CON UN VALOR ASIGNDO .

	}
	
	//VARIABLE PERTENECIENTE A LA CLASE Y FUERA DEL MAIN.
	static float variableDeClase = 45.45f;
	static float variableDeClase2;
	
	
}
