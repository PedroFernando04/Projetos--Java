public class somaFatorial {
    public static void main(String[] args) {
     System.out.println(fatorial(5));
     System.out.println(fatorial(27));
     System.out.println(fatorial(53));
    }
    
public static int fatorial(int entrada){
    if (entrada == 1)
    return 1;

    else
    return entrada + fatorial(entrada - 1);
    }
}
