package A6_8_Clases_Date_y_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A0_76_ClaseDate_formatosDeFecha {
	
	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println(fecha);
		SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
		String fechaStr = df.format(fecha);
		System.out.println(fechaStr);
		
		
		
		long j = 0;
		for(int i=0; i<10000000;i++) {
			j+=i;
		}
		Date fecha2 = new Date();
		long tiempofinal = fecha2.getTime() - fecha.getTime();
		System.out.println(j);
		System.out.println(tiempofinal);
	}
}
