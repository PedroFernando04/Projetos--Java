/* 
 Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar. 
 Dica: utilize o operador módulo (resto da divisão[%])
 */

import java.util.Scanner;

public class Q1parOuImpar {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
    
        int numero;
        System.out.println("Informe um número inteiro: ");
        numero = scanf.nextInt();
    
        if(numero % 2 == 0)
            System.out.println("É par!");
        else
            System.out.println("É ímpar!");
    }
   

}
