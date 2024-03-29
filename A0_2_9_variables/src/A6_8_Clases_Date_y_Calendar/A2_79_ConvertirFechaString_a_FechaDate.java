package A6_8_Clases_Date_y_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A2_79_ConvertirFechaString_a_FechaDate {
	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date fecha = format.parse("2020-01-05");
			System.out.println(fecha);
			System.out.println(format.format(fecha));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa una fecha con formato yyyy-MM-dd");
		String fechaIngresadaString = scan.next();
		try {
			Date fechaIngresadaDate = format.parse(fechaIngresadaString);
			System.out.println(fechaIngresadaDate);
			System.out.println(format.format(fechaIngresadaDate));
			
			Date fecha3 = new Date();
			if(fechaIngresadaDate.after(fecha3)) {
				System.out.println("La fecha del usuario es despues de la fecha3");
			}else if(fechaIngresadaDate.before(fecha3)) {
				System.out.println("La fecha ingresada por el usuario es anterior a la fecha 3");
			}else if(fechaIngresadaDate.equals(fecha3)) {
				System.out.println("Las fechas son exactamente iguales");
			}
			
			
			//TAMBIEN SE PUEDE USAR EL M�TODO "compareTo()" DE LA CLASE DATE. ESTE M�TODO DEVUELVE UN ENTERO. 
			//SI ES MAYOR A 1 => ELEMENTO1 > ELEMENTO2 
			//SI ES NEGATIVO => ELEMENTO1 < ELEMENTO2
			//SI ES IGUAL A 0 => ELEMENTO1 = ELEMENTO2 
			
		}catch(Exception e) {
			System.out.println("no se pudo hacer conversi�n de fecha");
		}
		
	}
}
