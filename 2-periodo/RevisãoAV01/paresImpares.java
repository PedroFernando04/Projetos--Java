/*
 Crie um programa que leia um valor inteiro e exiba todos os números ímpares no intervalo de 1 a esse valor, separando-os.

 valor = 10
 saída:
 Ímpares até 10: 1, 3, 5, 7, 9
 Pares até 10: 2, 4, 6, 8, 10
 */

import java.util.ArrayList;
import java.util.Scanner;

public class paresImpares{
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        int numero = scanf.nextInt();

        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        for(int i = 1; i <= numero; i++){
            if (i % 2 == 0)
                pares.add(i);
            
            else
                impares.add(i);
        }

        System.out.println("Número pares até " + numero + ": " + pares);
        System.out.println("Número ímpares até " + numero + ": " + impares);
    }
}
