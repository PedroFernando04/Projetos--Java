public class somarDigitos {
    public static void main(String[] args) {

        System.out.println(somar(1234));
        System.out.println(somar(252580));
        System.out.println(somar(1789));
    }

    public static int somar(int numero){
        if (numero == 0)
        return numero;
        
        else
        return (numero % 10) + somar(numero / 10);
    }
}
