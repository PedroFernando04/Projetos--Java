import java.util.Scanner;

public class inverter4Algarismos {
    public static void main(String args[]) {
        Scanner scanf = new Scanner(System.in);

        int numero = scanf.nextInt();

        int unidade = (numero % 10);
        int dezena = (numero % 100) / 10;
        int centena = (numero % 1000) / 100;
        int milhar = numero / 1000;

        System.out.println(unidade + "" + dezena + "" + centena + "" + milhar);
    }
    
}
