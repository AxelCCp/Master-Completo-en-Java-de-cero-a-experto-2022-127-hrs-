package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A4_71_WrapperBoolean {

	public static void main(String[] args) {
		
		Integer num1, num2;
		num1 = 1;
		num2 = 2;
		boolean  primBoolean = num1 > num2; 	// false
		
		Boolean objBoolean1 = false;							//MANERA IMPLICITA
		Boolean objBoolean2 = Boolean.valueOf(primBoolean);		//MANERA EXPLICITA
		
		//TAMBN SE PUEDE HACER ESTO CON UN STRING
		Boolean objBoolean3 = Boolean.valueOf("false");
		
		
		System.out.println("primBoolean = " + primBoolean);//FALSE
		System.out.println("objBoolean1 = " + objBoolean1);//FALSE
		System.out.println("objBoolean2 = " + objBoolean2);//FALSE
		System.out.println("objBoolean3 = " + objBoolean3);//FALSE
		
		//COMPARACIÓN DE 2 OBJ BOOLEAN
		System.out.println("Comparando 2 objs boolean :::: objBoolean1 == objBoolean2 :::: " + (objBoolean1 == objBoolean2));		//TRUE
		System.out.println("Comparando 2 objs boolean :::: objBoolean1.equals(objBoolean2) :::: " + (objBoolean1.equals(objBoolean2))); //TRUE
		
		
		//PASANDO DE OBJ Boolean A PRIMITIVO boolean
		boolean primBoolean2 = objBoolean1.booleanValue();
		System.out.println("primBoolean2 : " + primBoolean2);//FALSE
		
	}
	
}
