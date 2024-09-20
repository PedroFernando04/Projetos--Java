//Faça um programa que verifique se um letra digitada é uma vogal ou uma consoante;

import java.util.Scanner;

public class vogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite uma letra");
        char letra = scanf.next().toLowerCase().charAt(0);

        if(letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            System.out.println("É uma vogal!");
        else
            System.out.println("É uma consoante!");

        

    }
}
