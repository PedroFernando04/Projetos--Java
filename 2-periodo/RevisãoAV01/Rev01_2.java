/*
 Desenvolva um algoritmo que receba 3 notas e faça a média. 
 O sistema deve exibir:
    - Aprovado: se a média for maior ou igual a 7
    - Reposição: se a média for menor que 7 mas maior ou igual a 4;
    - Reprovado: se a média for menor que 4
 */

import java.util.Scanner;

public class Rev01_2 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        float notas = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Informe sua " + (i+1) + "° nota: ");
            notas += scanf.nextFloat();
        }

        float media = notas/3;

        if (media >= 7)
            System.out.println("Aprovado!");
        else if(media >= 4)
            System.out.println("Reposição!");
        else
            System.out.println("Reprovado!");

    }
    
}
