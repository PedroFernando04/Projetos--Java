//Faça um programa que peça dois números e imprima o maior deles

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        float numero1, numero2;

        System.out.println("Informe o 1° valor: ");
        numero1 = scanf.nextFloat();

        System.out.println("Informe o 2° valor: ");
        numero2 = scanf.nextFloat();

        if(numero1 > numero2)
            System.out.println(numero1 + " É maior!");
        else if(numero2 > numero1)
            System.out.println(numero2 + " É maior!");
        else
            System.out.println("São iguais!");


    }
    
}
