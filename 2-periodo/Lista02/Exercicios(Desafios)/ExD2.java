/*
Faça um programa que, dado um conjunto de N números, determine o menor valor,
o maior valor e a soma dos valores
*/

import java.util.Scanner;

public class ExD2 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.println("\nInfome a quantidade de números que serão inseridos: ");
        int N = scanf.nextInt();

        System.out.println("Digite o 1° valor: ");
        float numeros = scanf.nextFloat();
        float maior = numeros, menor = numeros, total = numeros;

        for (int i = 2; i <= N; i++) {
            System.out.println("Digite seu "+ i + "° valor: ");
            numeros = scanf.nextFloat();
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
