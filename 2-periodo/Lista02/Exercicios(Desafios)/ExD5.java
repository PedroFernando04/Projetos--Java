/*
 Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
 Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 */
import java.util.Scanner;

public class ExD5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scanf.nextInt(), contador = 0;

        for(int i = 1; i <= numero; i++){
            if (numero % i == 0)
                contador++;
        }

        if (contador > 2)
            System.out.println("Não é primo!");
        else    
            System.out.println("É primo!");
        
    }
}
