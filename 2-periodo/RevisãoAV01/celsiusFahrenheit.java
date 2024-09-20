
import java.util.Scanner;

public class celsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Escolha qual operação deseja realizar: ");
        System.out.println("1 - Celsius para Fahrenheit\n2 - Fahrenreit para Celsius\n");
        int operacao = scanf.nextInt();
        float temperaturaInicial, temperaturaFinal;

        switch(operacao){
            
            case 1:
                System.out.println("\nInforme a temperatua em Celsius: ");
                temperaturaInicial = scanf.nextFloat();
                temperaturaFinal = (temperaturaInicial * 9/5) + 32;
                System.out.println(temperaturaInicial + " graus Celsius é igual a " + temperaturaFinal + " graus Fahrenheit");
                break;
            
            case 2:
                System.out.println("\nInforme a temperatua em Fahrenheit: ");
                temperaturaInicial = scanf.nextFloat();
                temperaturaFinal = (temperaturaInicial - 32) * 5/9;
                System.out.println(temperaturaInicial + " graus Fahrenheit é igual a " + temperaturaFinal + " graus Celsius ");
                break;
            
            default:
                System.out.println("Valor inválido!");
        }
    }
}
