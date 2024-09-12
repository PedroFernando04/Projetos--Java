import java.util.Scanner;

public class calculadora {
  public static void main(String args[]) {
    Scanner scanf = new Scanner(System.in);

    float n1 = scanf.nextFloat();
    float n2 = scanf.nextFloat();
    float resultadoOperacao = 0f;

    char operacao = scanf.next().charAt(0);
    
    resultadoOperacao = resultado(n1, n2, operacao);

    while(true){
        float n3 = scanf.nextFloat();

        operacao = scanf.next().charAt(0);

        if(operacao == '&')
            break;

        resultadoOperacao = resultado(resultadoOperacao, n3, operacao);
    }
  }

  public static float resultado(float n1, float n2, char operacao){
    
    float resultadoOperacao = 0f;

    switch (operacao) {
        case '+':
            resultadoOperacao = n1 + n2;
            break;
        case '-':
            resultadoOperacao = n1 - n2;
            break;
        case '*':
            resultadoOperacao = n1 * n2;
            break;
        case '/':
        if(n2 != 0)
            resultadoOperacao = n1 / n2;
        else{
            System.out.println("Erro: Divisão por 0");
            return n1;
        }
            
            break;
        default:
            System.out.println("Valor inválido!");
            return n1;
    }
    System.out.printf("%.3f\n", resultadoOperacao);
    return resultadoOperacao;
  }
}
