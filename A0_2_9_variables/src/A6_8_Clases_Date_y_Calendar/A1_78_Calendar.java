package A6_8_Clases_Date_y_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A1_78_Calendar {
	public static void main(String[] args) {
		
		//NO SE PUEDE INSTANCIAR CON EL NEW YA QUE CALENDAR ES UNA CLASE ABSTRACTA.
		//LA INSTANCIA LA MANEJA LA PROPIA CLASE POR DEBAJO, USANDO EL M�TODO STATICO GETINSTANCE
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario);							//IMPRIME TODO
		
		Date fecha = calendario.getTime();
		System.out.println(fecha);								//IMPRIME LA FECHA CON ESTE FORMATO ..  Sun Jul 10 21:28:45 CLT 2022
		
		
		calendario.set(2022, 07, 10);
		fecha = calendario.getTime();
		System.out.println(fecha);
		
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fechaConFormato = formato.format(fecha);
		System.out.println(fechaConFormato);
	}
}
