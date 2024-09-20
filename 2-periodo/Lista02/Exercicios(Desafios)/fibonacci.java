/*
 A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,...
 Faça um programa que gere a série até que o valor seja maior que 500.
 */

public class fibonacci {
    public static void main(String[] args) {
        int i = 0, auxiliar = 1, fibo;

        while(true){
            if(i > 500){
                System.out.println(i);
                break;
            }
            fibo = i + auxiliar;

            System.out.println(i);
 
            i = auxiliar;
            auxiliar = fibo;
        }
    }
}
