package A4_5_flujosDeControl;

public class A5_63_Etiquetas_en_For_y_While {

	public static void main(String[] args) {
		
		
		//LAS ETIQUETAS SON PARA HACER REFERENCIA A UN DETERMINADO FOR O WHILE
		
		
		bucle1: for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				if(i==2) {
					continue bucle1;
				}
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		bucle2: for(int i=1; i<=7; i++) {
			int j = 1;
			while(j<=8) {
				if(i==6 || i==7) {
					System.out.println("D�a " + i + ": descanso de fin de semana!");
					continue bucle2;
				}
				System.out.println("D�a " + i + ": trabajando a las " + j + " hrs.");
				j++;
			}
		}
		
	
	}
	
}
