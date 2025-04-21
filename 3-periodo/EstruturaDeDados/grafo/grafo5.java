import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class grafo5 {
    public static void main(String[] args) {
        HashMap<String, List<String>> mapa = new HashMap<>();

        mapa.put("A", new ArrayList<>(Arrays.asList("B", "D", "E")));
        mapa.put("B", new ArrayList<>(Arrays.asList("C", "A")));
        mapa.put("C", new ArrayList<>(Arrays.asList("D", "B")));
        mapa.put("D", new ArrayList<>(Arrays.asList("E", "C", "A")));
        mapa.put("E", new ArrayList<>(Arrays.asList("A", "D")));

        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite um vértice: ");
        String chaveVertice = scanf.nextLine();

        System.out.println("Antes: " + mapa);

        for (String i : mapa.keySet()) {
            List<String> conteudoVertice = mapa.get(i);

            conteudoVertice.remove(chaveVertice);
        }

        mapa.remove(chaveVertice); 

        System.out.println("Depois: " + mapa);

        scanf.close();
    }
}
