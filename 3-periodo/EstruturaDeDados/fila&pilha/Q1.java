class filaSequencial{
    int capacidade;
    String[] fila;
    String[] novaFila;
    int tamanho;

    filaSequencial(int capacidadeAtual){
        capacidade = capacidadeAtual;
        fila = new String[capacidade];
        tamanho = 0;
    }

    void enqueue(String novoCliente){
        if (tamanho == capacidade){
            System.out.println("Fila Cheia! Tente aumentar a capacidade para inserir novos itens");
        }
        else{
            System.out.println("Cliente incluído: " + novoCliente);
            fila[tamanho] = novoCliente;
            tamanho++;
        }
    }

    void dequeue(){
        if (tamanho == 0){
            System.out.println("Fila vazia! Experimente incluir um item primeiro");
        }

        else{
            System.out.println("Cliente removido: " + fila[0]);
            for(int i = 0; i < tamanho; i++){
                fila[i] = fila[i + 1];
            }
            tamanho--;
        }
    }

    void expand(){
        capacidade *= 2;

        novaFila = new String[capacidade];
        for(int e = 0; e < tamanho; e++){
            novaFila[e] = fila[e];
        }

        fila = new String[capacidade];
        for(int e = 0; e < tamanho; e++){
            fila[e] = novaFila[e];
        }

        System.out.println("Nova capacidade da fila: " + capacidade);
    }

    void exibir(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Clientes na fila: ");
        for(int j = 0; j < tamanho; j++){
            System.out.println(fila[j]);
        }
    }
}

public class Q1 {
    public static void main(String[] args){
        filaSequencial fila = new filaSequencial(5);

        fila.dequeue();

        fila.enqueue("Pedro");

        fila.dequeue();

        fila.enqueue("Fernando");
        fila.enqueue("Chadwick");
        fila.enqueue("Selton");
        fila.enqueue("Walter");
        fila.enqueue("Fernanda");
        
        fila.enqueue("Demi");
        
        fila.expand();

        fila.enqueue("Neymar");
        fila.enqueue("Oscar");
        fila.enqueue("Hulk");
        
        fila.expand();
        fila.enqueue("Lupita");
        fila.enqueue("Angela");

        fila.dequeue();

        fila.exibir();
    }
}
