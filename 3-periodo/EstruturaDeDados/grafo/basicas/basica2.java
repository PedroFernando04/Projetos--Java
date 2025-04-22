import java.util.*;

class Grafo{
    private Map<String, List<String>> grafo;

public Grafo(){
    grafo = new HashMap<>();
}

    void adicionarVertice(String Vertice){
        if(!grafo.containsKey(Vertice)){
        grafo.put(Vertice, new ArrayList());
        System.out.println("Vértice \"" + Vertice + "\" adicionado com sucesso!");
        }

        else
        System.out.println("O vértice \"" + Vertice + "\" já existe");
    }

    void adicionarAresta(String inicio, String fim){
        if (grafo.containsKey(inicio) && grafo.containsKey(fim)){
        grafo.get(inicio).add(fim);
        grafo.get(fim).add(inicio);
        System.out.println("Aresta entre \"" + inicio + "\" e \"" + fim + "\" criada com sucesso!");
        }

        else
        System.out.println("\nSeu(s) vértice(s) inicial(" + inicio + ") e/ou final(" + fim + ") não existe(m).\nVerifique e tente novamente\n");
    }

    void exibir(){
        for (String chave : grafo.keySet()){
            System.out.println(chave + ": " + grafo.get(chave));
        }
    }

}

public class basica2{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo();

        grafo1.adicionarVertice("A");
        grafo1.adicionarVertice("B");
        grafo1.adicionarVertice("C");
        grafo1.adicionarVertice("C");
        grafo1.adicionarVertice("D");
        grafo1.adicionarVertice("E");

        System.out.println("\n");

        grafo1.adicionarAresta("A", "B");
        grafo1.adicionarAresta("B", "C");
        grafo1.adicionarAresta("C", "D");
        grafo1.adicionarAresta("D", "E");
        grafo1.adicionarAresta("E", "A");
        grafo1.adicionarAresta("A", "Z");
        grafo1.adicionarAresta("A", "D");
        

        grafo1.exibir();
    }
}
