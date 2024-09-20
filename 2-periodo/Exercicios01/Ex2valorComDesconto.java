import java.util.Scanner;

public class Ex2valorComDesconto {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float valor, desconto = 0.85f;

        System.out.println("Informe o valor do seu produto: ");
        valor = scanf.nextFloat();

        System.out.println("Valor total: " + (valor*desconto));
        System.out.println("(Valor do produto: " + valor + " - Valor do desconto: " + (valor - valor*desconto) + ")");
    }  
}
