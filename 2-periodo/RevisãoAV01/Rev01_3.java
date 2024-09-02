/*
 Escreva um programa que solicite ao usuário um valor inteiro n.
 O programa deve exibir o dobro do valor de todos os números de 1 até n.

 entrada = 5

 Dobro dos número de 1 até 5:
    1:2
    2:4
    3:6
    4:8
    5:10
 */
import java.util.Scanner;

public class Rev01_3 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int n = scanf.nextInt();

        for(int i = 1; i <= n; i++)
            System.out.println(i + ": " + (i*2));
    }    
}
