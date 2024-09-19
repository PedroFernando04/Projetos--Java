import java.util.Scanner;

public class MenorDe3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] lista = new int[3];


        for(int i = 0; i < 3; i++){
            lista[i] = scanf.nextInt();
            //"informe o " + (i + 1) + " número: "

            //if(lista[i] < lista[i + 1])
        }

        if(lista[0] < lista[1] && lista[0] < lista[2])
            System.out.println(lista[0]);
        else if(lista[1] < lista[2] && lista[1] < lista[2])
            System.out.println(lista[1]);
        else
            System.out.println(lista[2]);
    }
}
