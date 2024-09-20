import java.util.Scanner;

public class media3Notas {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float notas = 0f;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Informa sua " + (i + 1) + "° nota: ");
            notas += scanf.nextFloat();
        }
        System.out.println(notas/3);

        
    }
}
