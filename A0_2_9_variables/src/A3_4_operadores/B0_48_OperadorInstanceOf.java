package A3_4_operadores;

public class B0_48_OperadorInstanceOf {

	public static void main(String[] args) {
		
		String texto = new String("Creando un obj de la clase String ... ");
		
		//Integer num = new Integer(7); 
		Integer num = 7;
		
		boolean b1 = texto instanceof String;
		System.out.println("Texto es del tipo String? " + b1);   //true
		
		
		b1 = texto instanceof Object;
		System.out.println("Texto es del tipo Object? " + b1);   //true
		
		
		b1 = num instanceof Integer;
		System.out.println("num es del tipo Integer? " + b1);  //true
		
		//NUMBER ES LA CLASE PADRE DE LOS NUMEROS
		b1 = num instanceof Number;
		System.out.println("num es del tipo Integer? " + b1);  //true
		
		b1 = num instanceof Object;
		System.out.println("num es del tipo Integer? " + b1);  //true
	}

}
