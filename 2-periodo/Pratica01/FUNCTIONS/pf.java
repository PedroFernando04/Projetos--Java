//Q1

  public static void positivoOuNegativo(double numero){
        if(numero > 0)
            System.out.println('P');
        else   
            System.out.println('N');
//Q2

public static int quantidadeDeDigitos(int numero, int contador){
        numero /= 10;
        contador++;

        if(numero < 1)
            return contador;
        else
            return quantidadeDeDigitos(numero, contador);
//Q3
