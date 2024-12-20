import static defs.Defs.*;
import java.util.Scanner;

public class telaDeLogin {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        while (true) {
            limpar();
            System.out.println("Informe o que deseja fazer:\n"); 
            System.out.println("1 - Casdastrar\n2 - Logar\n3 - Sair\n");
            int opc = verificadorDeInteiro(scanf);

            scanf.nextLine();
            limpar();

            if(opc == 1){
                System.out.println("Cadastro realizado!");
                delay(scanf);
            }

            else if(opc == 2){
                System.out.println("Login realizado!");
                delay(scanf);
            }

            else if(opc == 3){
                System.out.println("Finalizando o programa!");
                break;
            }

            else{
                System.err.println("Valor inválido!\n");
                delay(scanf);
            }
        }
    }
}
