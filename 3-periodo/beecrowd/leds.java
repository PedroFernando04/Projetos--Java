//https://judge.beecrowd.com/pt/problems/view/1168
import java.util.Scanner;

public class leds {
 
    public static void main(String[] args){
 
        Scanner scanf = new Scanner(System.in);
        int reps = scanf.nextInt();
        scanf.nextLine();
        
        
        for(int i = 0; i < reps; i++){
            String led = scanf.nextLine();
            String[] leds = led.split("");
            int contador = 0;
            
            for(int j = 0; j < leds.length; j++){
                switch(leds[j]){
                    case "1":
                        contador += 2;
                        break;
                    case "2":
                        contador += 5;
                        break;
                    case "3":
                        contador += 5;
                        break;
                    case "4":
                        contador += 4;
                        break;
                    case "5":
                        contador += 5;
                        break;
                    case "6":
                        contador += 6;
                        break;
                    case "7":
                        contador += 3;
                        break;
                    case "8":
                        contador += 7;
                        break;
                    case "9":
                        contador += 6;
                        break;
                    case "0":
                        contador += 6;
                        break;
                }
            }
        System.out.println(contador + " leds");
        }
    }
}
