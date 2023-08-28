import java.util.Scanner;

public class ejer2 {

 public static void main(String[] args) {
   System.out.println("Ingrese numeros del 50 al 100 (ambos incluidos) separados por un espacio.");
   Scanner scanner = new Scanner(System.in);
   String lineaNumeros = scanner.nextLine();
   Scanner numerosScanner = new Scanner(lineaNumeros);
   while (numerosScanner.hasNextInt()) {
     int noesprimo = 0;
     int numero = numerosScanner.nextInt();
     if (numero > 100 || numero < 50 ) {
       System.out.println("Ingrese numeros que no sean menores de 50 y que no sean mayores a 100");
       return;
     }
     
    
       for (int x = numero - 1 ; x > 1; x--) {
         if (numero % x == 0 ) {
           noesprimo = 1;
           System.out.printf("%d ", x);
           
         }
       } 
       

     if(noesprimo == 0) {
       System.out.println("Primo:" + numero);
     } else {
       System.out.printf("\n");
     }
   }
   
   numerosScanner.close();
   scanner.close();
 }

}
