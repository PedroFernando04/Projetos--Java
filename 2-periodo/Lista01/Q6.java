/*
    Faça um programa que pergunte em que você estuda. Peça para digitar M-matutino ou V-vespertino
ou N-noturno. Imprima a mensagem "Bom Dia!, "Boa Tarde! ou "Boa Noite!" ou "Valor Inválido!", 
conforme o caso"

 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe o horário em que você estuda:\nM - Matutino\nV - Vespertino\nN - Noturno\n");
        char turno = scanf.next().toLowerCase().charAt(0);

        switch (turno) {
            case 'm':
                System.out.println("Bom dia!");
                break;
            case 'v':
                System.out.println("Boa tarde!");
                break;
            case 'n':
                System.out.println("Boa noite!");
                break;
            default:
            System.out.println("Valor Inválido!");
        }
    }
}
