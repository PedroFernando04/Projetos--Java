/*
 Silvio Santos era um ícone da TV brasileira, conhecido por seus jogos e brincadeiras. Em homenagem a ele, você deve implementar um jogo do "PIN" em que o objetivo é substituir certos números por "PIN". Escreva um programa que siga as seguintes regras: (2.0)

a) O programa deve solicitar ao usuário que insira um número inteiro. Este número deve ser maior que 100 e menor que 1000. Se o usuário inserir um número fora desse intervalo, o programa deve pedir novamente até que um número válido seja inserido.

b) Após obter um número válido, o programa deve imprimir todos os números de 1 até o número inserido pelo usuário.

c) Para tornar o jogo mais interessante, aplique as seguintes substituições:

- Se um número for múltiplo de 4, substitua-o por "PIN".

- Se um número contiver o dígito 4 em qualquer posição (por exemplo, 14, 241), substitua-o por "PIN".

*Exemplo de execução:*

Suponha que o usuário insira o número 25. O programa deve imprimir:

```

1

2

3

PIN

5

6

7

PIN

9

10

11

PIN

13

PIN

15

PIN

17

18

19

PIN

21

22

23

PIN

25

Implemente este programa utilizando a linguagem de programação de sua escolha.
 */
import java.util.Scanner;

public class PIN {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Informe um número inteiro entre 100 e 1000: ");
            numero = scanf.nextInt();
        } while (numero <= 100 || numero >= 1000);

        for(int i = 1; i <= numero; i++){
            if(i % 4 == 0 || String.valueOf(i).contains("4"))
                System.out.println("PIN");

            else
                System.out.println(i);
        }
    }
}
