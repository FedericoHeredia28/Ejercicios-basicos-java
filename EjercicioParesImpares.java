package omaiga;
import java.util.Scanner;

public class Ejercicio_numeros_pares {
	
	public static void main(String args[]) {
		
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(a >= 0 && a <= 100) {
			
            System.out.print("Ingresar un numero del 1 al 100: ");
			a = scanner.nextInt();
			
			if (a < 0 || a > 100) {
				System.out.print("El numero tiene que ser del 1 al 100");
				return;
			}
			
			System.out.println("El numero ingresado es: " + a);
			
			if(a%2 == 0) {
				System.out.print("El numero es par\n");
			}
			else {
				System.out.print("No es par\n");
			}			
		}	
	}
}
