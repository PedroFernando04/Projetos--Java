import static defs.Defs.*;
import java.util.Scanner;

public class tabuada {

    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);

        System.out.println("Vamos calcular tabuadas!\n\n");
        System.out.print("Informe um número inteiro: ");
        int numero = verificadorDeInteiro(scanf);

        limpar();
        System.out.println("Tabuada de " + numero + "\n");

        for(int i = 1; i <= 10; i++){
        System.out.println(i + " X " + numero + " = " + (numero * i));
        }

        scanf.close();
    }
}
