import java.util.Scanner;


 public class Condicional {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Digite o primeiro numero");
         int numero = scanner.nextInt();

         System.out.println("Digite o segundo numero");
         int numero2 = scanner.nextInt();


         if (numero > numero2) {
             System.out.println("O numero " + numero + " é maior que " + numero2);
         } else if (numero < numero2) {
             System.out.println("O numero " + numero2 + " é maior que " + numero);
         } else {
             System.out.println("Os dois numeros são iguais");
         }

         scanner.close();
     }
 }