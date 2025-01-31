public class fibonacciRecursiva {
    public static void main(String[] args) {
        System.out.println(fibonacci(6, 1, 0));
        System.out.println(fibonacci(12, 1, 0));
        System.out.println(fibonacci(24, 1, 0));
    }

    public static int fibonacci(int numero, int x, int y){
        if (numero == 1)
        return x;
        
        else
        return fibonacci(numero - 1, (x + y), x);
    }
    
}
