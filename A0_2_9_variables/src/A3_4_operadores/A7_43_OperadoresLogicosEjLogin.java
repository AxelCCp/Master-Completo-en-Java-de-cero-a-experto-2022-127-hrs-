package A3_4_operadores;

import java.util.Scanner;

public class A7_43_OperadoresLogicosEjLogin {

	public static void main(String[] args) {
		
		String[]usernames = new String[3];
		String[]passwords = new String[3];
		usernames[0] = "andres";
		passwords[0] = "12345";
		usernames[1] = "admin";
		passwords[1] = "12345";
		usernames[2] = "pepe";
		passwords[2] = "12345";

		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el username");
		String usuario = scanner.next();
		System.out.println("Ingresa el password");
		String contrasena = scanner.next();
		
		boolean esAutenticado = false;
		
		for(int i=0;i<usernames.length;i++) {
			
			if((usernames[i].equals(usuario) && passwords[i].equals(contrasena))) {
				esAutenticado = true;
				break;
			}
		}
		
		if(esAutenticado) {
			System.out.println("Acceso correcto");
		}else {
			System.out.println("Acceso restringido");
			System.out.println("username o contraseņa incorrecto");
		}
		
	}

}
