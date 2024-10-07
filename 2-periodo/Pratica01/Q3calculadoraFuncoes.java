import java.util.Scanner;

public class Q3calculadoraFuncoes {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.println("\nBem vindo(a) a Calculadora!");
        System.out.println("Informe qual operação você deseja realizar: ");
        System.out.println("\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
        String operacao = scanf.nextLine();

        while(!operacao.equals("1") && !operacao.equals("2") && !operacao.equals("3") && !operacao.equals("4")){
            System.out.println("\nOperacao inválido!\nInsira um valor da tabela: \n");
            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
            operacao = scanf.nextLine();
        }
        
        System.out.print("\nInforme o 1° número: ");
        double n1 = scanf.nextInt();

        System.out.print("\nInforme o 2° número: ");
        double n2 = scanf.nextInt();
        
        char op = '.';
        double resultado = 0;

        switch(operacao){
            case("1"):
                op = '+';
                resultado = somar(n1, n2);
                break;
            case("2"):
                op = '-';
                resultado = subtrair(n1, n2);
                break;
            case("3"):
                op = 'x';
                resultado = multiplicar(n1, n2);
                break;
            case("4"):
                op = '%';
                resultado = dividir(n1, n2);
                break;
        }

        System.out.println("\n" + n1 + " " + op + " " + n2 + " = " + resultado + "\n");
        scanf.close();
    }

    public static double somar(double n1, double n2){
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public static double dividir(double n1, double n2){
        Scanner scanf = new Scanner(System.in);

        if(n2 != 0){
            scanf.close();
           return n1 / n2;
        }
        else{
            System.out.println("\nERRO: Divisão por 0\n");
            System.out.print("Informe o 2° número novamente: ");
            n2 = scanf.nextDouble();
            return dividir(n1, n2);   
        }
    }
}
