import java.util.Scanner;

public class Q1positivoOuNegativo{
    public static void main(String[] args ){
        Scanner scanf = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n = scanf.nextDouble();

        positivoOuNegativo(n);

        scanf.close();

    }

    public static void positivoOuNegativo(double numero){
        if(numero > 0)
            System.out.println('P');
        else   
            System.out.println('N');
    }
}
