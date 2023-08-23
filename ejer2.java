import java.util.Scanner;

public class ejer2 {

 public static void main(String[] args) {
   System.out.println("Ingrese numeros del 1 al 50 (ambos incluidos) separados por un espacio.");
   Scanner scanner = new Scanner(System.in);
   String lineaNumeros = scanner.nextLine();
   Scanner numerosScanner = new Scanner(lineaNumeros);
   while (numerosScanner.hasNextInt()) {
     int condicion = 0;
     int numero = numerosScanner.nextInt();
     if (numero > 50 || numero < 0 ) {
       System.out.println("Ingrese numeros que no sean mayores de 50 ");
       return;
     }
     
    
       for (int x = numero - 1 ; x > 1; x--) {
         if (numero % x == 0 ) {
           if(numero != x && x != 1) condicion = 1;
           System.out.printf("%d ", x);
           
         }
       } 
       

     if(condicion == 0) {
       System.out.println("primo:" + numero);
     } else {
       System.out.printf("\n");
     }
   }
   
   numerosScanner.close();
   scanner.close();
 }

}
