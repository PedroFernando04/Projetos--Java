/*
 Escreva um programa que peça ao usuário para inserir 10 números inteiros. 
 O programa deve contar quantos desses números são positivos, negativos e zeros, e imprimir esses totais. 

Exemplo de execução:

• Se o usuário inserir -1, 2, 0, -3, 5, 0, 7, -8, 9, 0, o programa deve imprimir:

Positivos: 4

Negativos: 3

Zeros: 3
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int contadorZero = 0, contadorPositivo = 0, contadorNegativo = 0, numero;

        for(int i = 0; i < 10; i++){
            numero = scanf.nextInt();
            if(numero > 0)
                contadorPositivo++;
            else if(numero < 0)
                contadorNegativo++;
            else
                contadorZero++;
        }

        System.out.println("Positivos: " + contadorPositivo);
        System.out.println("Negativos: " + contadorNegativo);
        System.out.println("Zeros: " + contadorZero);
        


    }
}
