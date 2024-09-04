/*
Você foi contratado para desenvolver um sistema de cadastro e autenticação. 
 Para isto as seguintes funcionalidades devem ser desenvolvidas: 

a) Solicite ao usuário que digite 1 se deseja cadastrar;

Exemplo de Saída:

>> Digite a opção: 1

>> Qual nome do usuário? admin

>> Qual senha? admin

b) Solicite ao usuário que digite 2 se deseja entrar no sistema;

Exemplo de Saída:

>> Digite a opção: 2

>> Digite nome do seu usuário: admin

>> Digite sua senha: admin

>> True

c) Solicite ao usuário que digite 3 para sair do sistema.

>> Digite a opção: 3

>> Fim do Programa (Sair do loop)
 */

import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        boolean NC = false, SC = false, loop = true;
        String nomeCadastro = null, senhaCadastro = null, nomeLogin, senhaLogin;

            while(loop){
            System.out.println("Informe qual operação deseja realizar: ");
            System.out.println("1 - Cadastro\n2 - Login\n3 - Fim\n");
            int operacao = scanf.nextInt();

            switch(operacao){
                case 1:
                    scanf.nextLine();
                    System.out.print("Nome: ");
                    nomeCadastro = scanf.nextLine();
                    NC = true;

                    System.out.print("\nSenha: ");
                    senhaCadastro = scanf.nextLine();
                    SC = true;

                    break;

                case 2:
                    if(NC && SC){
                        scanf.nextLine();
                        System.out.print("Nome: ");
                        nomeLogin = scanf.nextLine();
                        System.out.print("\nSenha: ");
                        senhaLogin = scanf.nextLine();

                        System.out.println(nomeLogin.equals(nomeCadastro) && senhaLogin.equals(senhaCadastro));
                    }
                    else
                        System.out.println("\nCadastro não efetuado!\n");
                    break;

                case 3:
                    loop = false;
                    break;
                    
                default:
                    System.out.println("\nDígito inválido!\n");
            }
        }
    }
    
}
