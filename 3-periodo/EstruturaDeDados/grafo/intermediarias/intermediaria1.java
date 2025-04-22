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

    void exibirVizinhos(String Vertice){
        System.out.println("Vizinhos de \"" + Vertice + "\": " + grafo.get(Vertice));
    }

    void ligação(String Vertice1, String Vertice2){
        

        if (grafo.containsKey(Vertice1) && grafo.containsKey(Vertice2)){
            if(grafo.get(Vertice1).contains(Vertice2)){
                System.out.println("Existe ligação");
            }
            else
            System.out.println("Não existe ligação");
        }
        else
        System.out.println("\nPelo menos um de seus vértices(\"" + Vertice1 + "\" e \"" + Vertice2 + "\") não existe.\nVerifique e tente novamente\n");
    }
    void removerVertice (String Vertice){
        if (!grafo.containsKey(Vertice)) {
            System.out.println("\nVértice \"" + Vertice + "\" não existe.");
            return;
        }
        
        for(String chave : grafo.keySet()){
            if(grafo.get(chave).contains(Vertice))
            grafo.get(chave).remove(Vertice);
        }
        System.out.println("\nArestas removidas!");

        grafo.remove(Vertice);
        System.out.println("\nVertice removido!\n");
    }

    void tamanho(){
        int arestas = 0;

        System.out.println("\nTamanho do Grafo: ");
        System.out.println("Vértices: " + grafo.size());
        
        for(String chave : grafo.keySet()){
            arestas += grafo.get(chave).size();
        }
        System.out.print("Arestas: " + arestas);
    }
}

public class intermediaria1{
    public static void main(String[] args) {
        Grafo grafo1 = new Grafo();

        grafo1.adicionarVertice("A");
        grafo1.adicionarVertice("B");
        grafo1.adicionarVertice("C");
        grafo1.adicionarVertice("D");
        grafo1.adicionarVertice("E");

        System.out.println("\n");

        grafo1.adicionarAresta("A", "B");
        grafo1.adicionarAresta("B", "C");
        grafo1.adicionarAresta("C", "D");
        grafo1.adicionarAresta("D", "E");
        grafo1.adicionarAresta("E", "A");
        grafo1.adicionarAresta("A", "D");

        System.out.println("\n");

        grafo1.exibir();

        grafo1.tamanho();
    }
}
