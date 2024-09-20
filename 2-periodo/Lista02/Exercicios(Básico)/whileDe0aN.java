/*Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite 
inserido pelo usuário*/
import java.util.Scanner;

public class whileDe0aN {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int N = scanf.nextInt();

        System.out.println("\n");

        for (int i = 0; i <= N; i++) 
            System.out.println(i);
    }
}
