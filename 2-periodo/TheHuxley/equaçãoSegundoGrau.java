import java.util.Scanner;


public class equaçãoSegundoGrau {
  public static void main(String args[]) {
      
      Scanner scanf = new Scanner(System.in);
      
      float a = scanf.nextFloat();
      float b = scanf.nextFloat();
      float c = scanf.nextFloat();
      
      float Delta = (b*b) - (4 * a * c);
      
      if(a == 0)
        System.out.println("NEESG");
      else if(Delta < 0)
        System.out.println("NRR");
      else{  
          double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
          double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
          
          System.out.printf("%.2f", x1);
          System.out.printf("\n%.2f", x2);
      }
    
  }
}
