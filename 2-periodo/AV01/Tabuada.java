//Faça um programa que leia um valor inteiro e mostre a tabuada de 1 a 10 do valor lido utilizando estrutura de repetição.

import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanf.nextInt();

        for(int i = 1; i <= 10; i++)
            System.out.println(i + " X " + numero + " = " + (i*numero));
    }
}
