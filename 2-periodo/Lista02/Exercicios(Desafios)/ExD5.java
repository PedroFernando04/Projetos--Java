/*
 Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
 Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 */
import java.util.Scanner;

public class ExD5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scanf.nextInt();

        if((numero > -4 && numero < 4) || numero % 2 != 0 && numero % 3 != 0)
            System.out.println("É primo!");
        else
            System.out.println("Não é primo!");
    }
}

