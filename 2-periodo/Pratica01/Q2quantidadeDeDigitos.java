import java.util.Scanner;

public class Q2quantidadeDeDigitos{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int contador = 0;
        System.out.print("Informe um número inteiro: ");
        int num = scanf.nextInt();

        System.out.println(num + " tem " + quantidadeDeDigitos(num, contador) + " dígitos");

        scanf.close();
    }

    public static int quantidadeDeDigitos(int numero, int contador){
        numero /= 10;
        contador++;

        if(numero < 1)
            return contador;
        else
            return quantidadeDeDigitos(numero, contador);
    }
}
