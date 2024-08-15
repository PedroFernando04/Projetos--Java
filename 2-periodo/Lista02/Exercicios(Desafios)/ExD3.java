/*
 Altere o programa anterior para que ele aceite apenas números entre 0 e 1000
 */

 import java.util.Scanner;

 public class ExD3 {
     public static void main(String[] args){
         Scanner scanf = new Scanner(System.in);
 
         System.out.println("\nInfome a quantidade de números que serão inseridos: ");
         int N = scanf.nextInt();
 
         System.out.println("Digite o 1° valor: ");
         float numeros = scanf.nextFloat();
         while(numeros < 0 || numeros > 1000){
            System.out.println("Valor inválido!\n(Digite valores entre 0 e 1000)\n");
            System.out.println("Digite seu 1° valor: ");
            numeros = scanf.nextFloat();
         }
         float maior = numeros, menor = numeros, total = numeros;
 
         for (int i = 2; i <= N; i++) {
             System.out.println("Digite seu "+ i + "° valor: ");
             numeros = scanf.nextFloat();
             while(numeros < 0 || numeros > 1000){
                System.out.println("Valor inválido!\n(Digite valores entre 0 e 1000)\n");
                System.out.println("Digite seu "+ i + "° valor: ");
                numeros = scanf.nextFloat();
             }

             total += numeros;
             if (maior < numeros)
                 maior = numeros;
             if(menor > numeros)
                 menor = numeros;
         }
         System.out.println("\nMenor valor: " + menor);
         System.out.println("Maior valor: " + maior);
         System.out.println("Soma dos valores: " + total);
     }
     
 }