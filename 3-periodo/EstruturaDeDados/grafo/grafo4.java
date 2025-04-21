import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class grafo4{
    public static void main(String[] args) {
        HashMap<String, List<String>> mapa = new HashMap<>();

        
        mapa.put("A", Arrays.asList("B", "D", "E"));
        mapa.put("B", Arrays.asList("C", "A"));
        mapa.put("C", Arrays.asList("D", "B"));
        mapa.put("D", Arrays.asList("E", "C", "A"));
        mapa.put("E", Arrays.asList("A", "D"));

        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite um vértice: ");
        String chaveVertice = scanf.nextLine();
        

        for(String i : mapa.keySet()){
            List<String> conteudoVertice = mapa.get(i);

            if(conteudoVertice.contains(chaveVertice))
            System.out.println("O vértice " + i + " está ligado ao vértice " + chaveVertice); 

            else
            System.out.println("O vértice " + i + " não está ligado ao vértice " + chaveVertice); 
        }

        scanf.close();
    }
}
