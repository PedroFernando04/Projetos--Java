/*
Faça um programa que leia três números e mostre o maior deles
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe seu 1° número: ");
        float numero = scanf.nextFloat();
        float auxiliar = numero;

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe seu " + (i + 2) +"° número: ");
            numero = scanf.nextFloat();
            if(numero >= auxiliar){
                auxiliar = numero;
            }
        }
        
        System.out.println(auxiliar);
    }
}

