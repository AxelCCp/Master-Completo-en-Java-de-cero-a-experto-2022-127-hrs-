package A0_variables;

/*
 * JAVA ES FUERTEMENTE TIPADO.

VARIABLES: SON LAS ENTIDADES, CONTIENEN VALORES Y DATOS.

TIPOS DE DATOS : 
	PRIMITIVOS: 
		CONTIENEN 1 SOLO VALOR. LOS TIPOS PRIMITIVOS NO SON OBJETOS, SON VALORES.
		SON TIPOS DE DATOS ESCALARES QUE TIENEN UN SOLO VALOR.
		ES DE TIPADO EST�TICO.  ES DECIR, SE DEFINE EL TIPO DE DATO A LA HORA DE DEFINIR LA VARIABLE.
		
		ENTEROS - FLOTANTES - CARACTERES - BOLEANOS  ------> TODOS LOS TIPOS DE DATOS SE ESCRIBEN EN MIN�SCULA.
		
		ENTEROS ---------------------
			bytes : 8bits
			short : 2 BYTES = 16 BITS
			int : 	4 BYTES = 32 BITS
			long :  8 BYTES = 64 BITS
			
		FLOTANTE---------------------
			float : PRESICION SIMPLE 
			double : PRESICION DOBLE
			
		boolean : 1 BIT
				TRUE / FALSE
		
		CARACTERES ------------------
			char : USA C�DIGO UNICODE Y CADA CARACTER USA 16 BITS.
			
			UN CHAR PUEDE TENER UN SOLO CARACTER, EJ: 
			char a = 'a';
			
			TAMBI�N UN CHAR PUEDE TENER M�S DE UN CARACTER SIEMPRE Y CUANDO SEA UN CODIGO UNICODE 
			char c = '\u0021'
			
			SECUENCIAS DE ESCAPE:
				\b	RETROCESO
				\n	NUEVA L�NEA
				\r	RETORNO DEL CARRO
				\t	TABULADOR
				\\	DIAGONAL INVERTIDA
				\"	COMILLAS DOBLES
			
		-----------------------------------------------------------------------------------------------------------
		VALORES******
		Lista de tipos de datos primitivos en JAVA
		------------------------------------------
		Tipo	Tama�o	Valor m�nimo	Valor m�ximo
		byte	8 bits	-128					127
		short	16 bits	-32768					32767
		int		32 bits	-2147483648				2147483647
		long	64 bits	-9223372036854775808	9223372036854775807
		float	32 bits	-3.402823e38			3.402823e38
		double	64 bits	-1.79769313486232e308	1.79769313486232e308
		chart	16 bits	 NULL EN UNICODE 000 	FFF EN UNICODE
		------------------------------------------------------------------------------------------------------------
		
		
			
	REFERENCIA:
		TIPOS DE UNA CLASE. DE UN OBJ. LOS ARREGLOS, LAS CLASES E INTERFACES.

 * 
 * */




public class A0_2_9_variables {
	public static void main(String[]args) {
		String saludar = "hola mundo desde java";
		System.out.println(saludar);
		System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
		
		int numero = 10;
		System.out.println("numero = " + numero);
	}
	
}

