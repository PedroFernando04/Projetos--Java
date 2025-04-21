import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class grafo2{
    public static void main(String[] args) {
        HashMap<String, List<String>> mapa = new HashMap<>();

        
        mapa.put("A", Arrays.asList("B", "D", "E"));
        mapa.put("B", Arrays.asList("C", "A"));
        mapa.put("C", Arrays.asList("D", "B"));
        mapa.put("D", Arrays.asList("E", "C", "A"));
        mapa.put("E", Arrays.asList("A", "D"));


        System.out.println(mapa);
    }
}
