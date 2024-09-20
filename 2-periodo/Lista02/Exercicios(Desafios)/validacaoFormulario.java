/*
 Faça um programa que leia e valide as seguintes informações:
    1. Nome: maior que 3 caracteres;
    2. Idade: entre 0 e 150;
    3. Salário: maior que zero;
    4. Sexo: 'f' ou 'm';
    5. Estado Civil: 's', 'c', 'v', 'd';
    5. Use a função len(string) para saber o tamanho de um texto(número de caracteres)
 */

 import java.util.Scanner;

public class validacaoFormulario {
   public static void main(String[] args) {
      Scanner scanf = new Scanner(System.in);
      String nome;
      int idade, salario;
      char sexo, estadoCivil;

      System.out.println("Nome: ");
      nome = scanf.nextLine();
      
      System.out.println("Idade: ");
      idade = scanf.nextInt();
      
      System.out.println("Salário: ");
      salario = scanf.nextInt();
      
      System.out.println("Sexo: ");
      sexo = scanf.next().toLowerCase().charAt(0);
      
      System.out.println("Estado Civil: ");
      estadoCivil = scanf.next().toLowerCase().charAt(0);

      boolean[] condicao = {nome.length() > 3, idade >= 0 && idade <= 150, salario > 0, 
         sexo == 'm' || sexo == 'f', 
   estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd', };

   String[][] informacaoCondicaoValidade = {{"Nome", "O nome deve ter mais que 3 caracteres", " "},
    {"Idade", "A idade de ser um valor entre 0 e 150", " "}, 
    {"Salário", "O salário deve ser um valor maior que 0", " "}, 
    {"Sexo", "O sexo deve ser informado como 'M' ou 'F'(maiúsculo ou minúsculo)", " "}, 
    {"Estado Civil", "O Estado Civil deve ser informado com 'S', 'C', 'D' ou 'V'(maiúsculo ou minúsculo)", " "}};

    System.out.println('\n');

    for (int i = 0; i < 5; i++) {
      if(condicao[i])
         informacaoCondicaoValidade[i][2] = "Válido!";
      else
         informacaoCondicaoValidade[i][2] = "Inválido! - " + informacaoCondicaoValidade[i][1];
      
      System.out.println(informacaoCondicaoValidade[i][0] + ' ' + informacaoCondicaoValidade[i][2]+'\n');
    }

   }
}
    

