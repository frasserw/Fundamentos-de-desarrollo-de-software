package agenciapasajes.logica;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AppAgencia {
	private static Agencia miAgencia =new Agencia(10);
	
	public static void main(String[] args) {
		new Agencia(10).run();
		
	}
	
	
}
