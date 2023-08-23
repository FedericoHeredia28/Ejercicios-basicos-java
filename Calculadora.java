import java.util.Scanner;

public class Calculadora {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese una operacion con este formato 'a + b' =");
			String suma = scanner.nextLine();
			
			String[] partes = suma.split(" ");
			if (partes.length != 3) {
				System.out.println("Formato incorrecto. Debe ser 'a + b'.");
				return;
			}
			
			double operando1 = Double.parseDouble(partes[0]);
			String operador = partes[1]; 
			double operando2 = Double.parseDouble(partes[2]);
			
			if (!operador.equals("+") && !operador.equals("-") && !operador.equals("/") && !operador.equals("x")) {
				System.out.println("Ingrese un operador valido.");
				return;
			}
			
			double resultado = 0;
			
			switch(operador) {
			case "+":
				resultado = operando1 + operando2;
				break;
			case "-":
				resultado = operando1 - operando2;
				break;
			case "/":
				resultado = operando1 / operando2;
				break;
			case "x":
				resultado = operando1 * operando2;
				break;
			}
			
			System.out.println("El resultado de la operacion es: " + resultado);
			
	    }
	

}
