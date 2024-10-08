import java.util.Scanner;

public class Q4refatorar{
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("\nBem vindo(a) Calculadora!");
        System.out.println("Informe a operação que deseja realizar: ");
        System.out.println("\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
        String operacao = scanf.nextLine();

        //Validação do tipo da operação
        while(!operacao.equals("1") && !operacao.equals("2") && !operacao.equals("3") && !operacao.equals("4")){
            System.out.println("\nOperacao inválido!\nInsira um valor da tabela: \n");
            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
            operacao = scanf.nextLine();
        }
        
        //Recebimento dos números
        System.out.print("\nInforme o 1° número: ");
        double n1 = scanf.nextInt();

        System.out.print("\nInforme o 2° número: ");
        double n2 = scanf.nextInt();
        
        System.out.println("\nResultado: " + calculadora(n1, n2, operacao) + "\n");
    }

    public static double calculadora(double n1, double n2, String operacao){
        Scanner scanf = new Scanner(System.in);

            switch(operacao){
                case("1"):
                    return n1 + n2;
                case("2"):
                    return n1 - n2;
                case("3"):
                    return n1 * n2;
                case("4"):
                    if(n2 != 0)
                        return n1 / n2;
                    else{
                        System.out.println("\nERRO: Divisão por 0");
                        System.out.print("\nInforme o 2° valor novamente: ");
                        n2 = scanf.nextDouble();
                        return calculadora(n1, n2, operacao);
                    }
                default:
                    System.out.println("ERROR 404");
                    return 1;
            }
    }
}
