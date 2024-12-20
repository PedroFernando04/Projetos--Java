package defs;

import java.util.Scanner;

public class Defs {
    public static void limpar(){
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro ao tentar limpar a tela: " + e);
        }
    }

    public static int verificadorDeInteiro(Scanner scanf){
    while (true){
        try{
            return scanf.nextInt();
            }
        catch(Exception e){
            limpar();
            System.out.print("Valor inválido!\n\nInforme um número inteiro: ");
            scanf.next();
            }
        }
    }

    public static void delay(Scanner scanf){
        scanf.nextLine();
    }
}
