public class potenciaRecursiva {
    public static void main(String[] args) {

     System.out.println(potencia(2, 3));
     System.out.println(potencia(3, 5));
     System.out.println(potencia(4, 10));
        
    }

    public static int potencia(int x, int y){
        if (y == 1)
        return x;

        else
        return x * potencia(x, y - 1);
    }
}
