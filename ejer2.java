 import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		System.out.println("Ingrese numeros del 1 al 50 (ambos incluidos) separados por un espacio.");
		Scanner scanner = new Scanner(System.in);
		String lineaNumeros = scanner.nextLine();
		Scanner numerosScanner = new Scanner(lineaNumeros);
		while (numerosScanner.hasNextInt()) {
			int numero = numerosScanner.nextInt();
			if (numero > 50 || numero < 0 ) {
				System.out.println("Ingrese numeros que no sean mayores de 50 ");
				return;
			}
			
			if (numero == 0 || numero == 1) System.out.printf("%d ", numero);
		
			  //if (numero == 4) System.out.printf("4 2 1");
			  for (int x = numero ; x > 0; x--) {
			    if (numero % x == 0 ) {
			    	
			    	System.out.printf("%d ", x);
			    	
			    }
			  }

			
			System.out.println("Num " + numero);
		}
		
		numerosScanner.close();
		scanner.close();
	}

}