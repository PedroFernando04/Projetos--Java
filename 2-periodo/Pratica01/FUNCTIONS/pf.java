    /* 

//Q1

public static void positivoOuNegativo(double numero){
    if(numero > 0)
        System.out.println('P');
    else   
        System.out.println('N');
}

//Q2

public static int quantidadeDeDigitos(int numero, int contador){
    numero /= 10;
    contador++;

    if(numero < 1)
        return contador;
    else
        return quantidadeDeDigitos(numero, contador);
}

//Q3

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
    
    */
