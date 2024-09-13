import java.util.Scanner;

public class inverter2Algarismos {
  public static void main(String args[]) {
    Scanner scanf = new Scanner(System.in);

    int numero = scanf.nextInt();
    
    int dezena = numero / 10;
    int unidade = numero % 10;

    if (unidade != 0)
        System.out.println(unidade + "" + dezena);
    else
        System.out.println(dezena);
  }
}
