/*
    Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular 
a média alcançada por um aluno e apresentar:
        a. A mensagem "Aprovado", se a média alcançada for maior ou igual a sete
        b. A mensagem "Reprovado", se a média for menor do que sete
        c. A mensagem "Aprovado com Distinção", se a média for igual a dez
 */

 import java.util.Scanner;

public class aprovacaoBimestre {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        float nota = 0f;

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe sua " + (i + 1) + "° nota: ");
            nota += scanf.nextFloat();
        }
        
        float media = nota/2;

        if(media == 10)
            System.out.println("Aprovado com Distinção");
        else if(media >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");



    }
}
