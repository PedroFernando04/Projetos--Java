import java.util.Scanner;

public class inverter4Algarismos {
    public static void main(String args[]) {
        Scanner scanf = new Scanner(System.in);

        int numero = scanf.nextInt();

        int unidade = (numero % 10);
        int dezena = (numero % 100) / 10;
        int centena = (numero % 1000) / 100;
        int milhar = numero / 1000;

        if(unidade == 0){
            if(dezena == 0){
                if(centena == 0)
                    System.out.println(milhar);
                else
                    System.out.println(centena + "" + milhar);
            }
            else
                System.out.println(dezena + "" + centena + "" + milhar);
        }   
        else
            System.out.println(unidade + "" + dezena + "" + centena + "" + milhar);
    }
}
