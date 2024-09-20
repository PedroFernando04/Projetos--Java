/*
 Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser
 --Deseja realizar mais uma soma? [S ou N]--
 */
import java.util.Scanner;

public class whileSoma {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Operação - Adição");

        while(true){
            System.out.println("\nInforme o primeiro número: ");
            float n1 = scanf.nextFloat();

            System.out.println("\nInforme o segundo número:");
            float n2 = scanf.nextFloat();

            float soma = n1 + n2;
            System.out.println("\n"+n1 + " + " + n2 + " = " + soma+'\n');

            System.out.println("Deseja realizar mais uma soma? [S ou N]");
            char loop = scanf.next().toLowerCase().charAt(0);

            if(loop == 'n')
                break;
            else if(loop != 'n' && loop != 's'){
                System.out.println("\nValor inválido!");
                System.out.println("Deseja realizar mais uma soma? [S ou N]");
                loop = scanf.next().toLowerCase().charAt(0);
            }
        }
    }
}
