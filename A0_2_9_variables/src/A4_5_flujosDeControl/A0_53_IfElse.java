package A4_5_flujosDeControl;

public class A0_53_IfElse {
	
	public static void main(String[] args) {
		
		float promedio = 5.8f;
		
		if(promedio >= 6.5) {
			System.out.println("Excelente promedio");
		}else if(promedio >= 6.0){
			System.out.println("Muy buen promedio");
		}else if(promedio >= 5.5){
			System.out.println("buen promedio");
		}else if(promedio >= 5.0){
			System.out.println("necesitas esforzarte m�s");
		}else if(promedio >= 4.0){
			System.out.println("insuficiente");
		}else {
			System.out.println("reprobado");
		}
		
		System.out.println("promedio " + promedio);
		
		
		
	}
}
