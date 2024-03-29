package A3_4_operadores;

public class B1_49_OperadorInstanceOfTiposGenericos {
	
	public static void main(String[] args) {
		
		//---
		Object texto = new String("Creando un obj de la clase String ... ");
		
		//MANERA M�S CORRECTA PARA INSTANCIAR CON LA CLASE NUMBER UN NUMERO QUE SEA DE UN TIPO COMO INTEGER 
		Number numX = Integer.valueOf(10); 
		Number num = 7;
		//---
		
		Boolean b1 = texto instanceof String;
		System.out.println("texto es del tipo String ... " + b1);		//true
		
		//ESTO SI PERMITE VALIDARLO SIN QUE D� ERROR DE COMPILACI�N
		b1 = texto instanceof Integer;
		System.out.println("texto es del tipo Integer ... " + b1);		//false
		
		b1 = num instanceof Integer;
		System.out.println("num es del tipo Integer ... " + b1);		//true
		
		b1 = num instanceof Long;
		System.out.println("num es del tipo Long ... " + b1);			//false
	
		b1 = num instanceof Double;
		System.out.println("num es del tipo Double ... " + b1);			//false
		
		//---
		Number decimal = 45.54;
		Number decimalX = Double.valueOf(55.77);
		//---
		
		b1 = decimal instanceof Double;
		System.out.println("decimal es del tipo Double ... " + b1);	   	//true
		
		b1 = decimal instanceof Float;
		System.out.println("decimal es del tipo Float ... " + b1);		//false
		
		//---
		Number decimalFloat = 45.54f;
		Number decimalFloatX = Float.valueOf(88.33f);
		//---
		
		b1 = decimalFloat instanceof Double;
		System.out.println("decimalFloat es del tipo Double ... " + b1);	   	//false
		
		b1 = decimalFloat instanceof Float;
		System.out.println("decimalFloat es del tipo Float ... " + b1);		//true
		
		
	}
}
