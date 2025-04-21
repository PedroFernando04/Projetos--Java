import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class grafo1{
    public static void main(String[] args) {
        HashMap<String, List<String>> mapa = new HashMap<>();

        
        mapa.put("A", Arrays.asList("B", "D"));
        mapa.put("B", Arrays.asList("C"));
        mapa.put("C", Arrays.asList("D"));
        mapa.put("D", Arrays.asList("E"));
        mapa.put("E", Arrays.asList("A"));


        System.out.println(mapa);
    }
}
