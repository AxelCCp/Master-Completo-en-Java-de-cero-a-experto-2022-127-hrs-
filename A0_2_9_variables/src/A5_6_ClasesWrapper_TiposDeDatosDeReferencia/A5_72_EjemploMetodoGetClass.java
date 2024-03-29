package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

import java.lang.reflect.Method;

public class A5_72_EjemploMetodoGetClass {

	
	public static void main(String[] args) {
		
		//getClass() : RETORNA UNA INSTANCIA DEL TIPO CLASS
		
		
		String texto = "hola que tal";
		Class strClass = texto.getClass();
		
		System.out.println("strClass : " + strClass.getName()); 		// R : strClass : java.lang.String
		System.out.println("strClass : " + strClass.getSimpleName()); 	// R : strClass : String
		System.out.println("strClass : " + strClass.getPackage());		// R : strClass : package java.lang
		System.out.println("strClass : " + strClass);					// R : strClass : class java.lang.String
		
		
		//SE OBTIENEN TODOS LOS M�TODOS DE LA CLASE STRING 
		for(Method metodo : strClass.getMethods()) {
			System.out.println("metodo.getName() = " + metodo.getName());
		}
		
		
		Integer num = 34;
		Class intClass = num.getClass();
		
		System.out.println("intClass = " + intClass);					// R : intClass = class java.lang.Integer
		System.out.println("intClass = " + intClass.getName());		    // R : intClass = java.lang.Integer
		System.out.println("intClass = " + intClass.getSimpleName());   // R : intClass = Integer
		System.out.println("intClass = " + intClass.getPackage());      // R : intClass = package java.lang
		System.out.println("intClass = " + intClass.getSuperclass()); 	// R : intClass = class java.lang.Number
		System.out.println("intClass = " + intClass.getSuperclass().getSuperclass()); 	// R : intClass = class java.lang.Object
	}
}