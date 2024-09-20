/*
 Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    a. "Telefonou para a vítima?"
    b. "Esteve no local do crime?"
    c. "Mora perto da vítima?"
    d. "Devia para a vítima?"
    e. "Já trabalhou para a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 
como "Cúmplice" e com 5 como "Assassino". 

Caso contrário, ela será classificado como "Inocente"
 */
import java.util.Scanner;

public class interrogatorio {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou para a vítima?"};
        int contador = 0;
        
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(perguntas[i]);
            char resposta = scanf.next().toLowerCase().charAt(0);
            if (resposta == 's')
                contador++;
        }

        switch(contador){
            case 5:
                System.out.println("Assassino");
                break;
            case 4:
            case 3:
                System.out.println("Cúmplice");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            default:
                System.out.println("Inocente");
        }
    }   

}
    

