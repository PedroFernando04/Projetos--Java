class No {
    int valor;
    int prioridade;
    No proximo;

    No(int novaPrioridade, int novoValor)
    {
        prioridade = novaPrioridade;
        valor = novoValor;
        proximo = null;
    }
}

class filaPrioridade
{
    No inicio;
    No fim;
    int tamanho;

    filaPrioridade()
    {
        inicio = fim = null;
        tamanho = 0;
    }

    void inserir(int novoValor, int novaPrioridade)
    {
        No novoNo = new No(novaPrioridade, novoValor);

        if (inicio == null)
        {
            inicio = fim = novoNo;
        } 

        else if (novoNo.prioridade > inicio.prioridade)
        {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } 

        else
        {
            No atual = inicio;
            while (atual.proximo != null && atual.proximo.prioridade >= novoNo.prioridade)
            {
                atual = atual.proximo;
            }

            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }

        tamanho++;
    }

    void remover()
    {
        if (inicio == null)
        {
            System.out.println("Fila vazia, nada para remover.");
            return;
        }

        System.out.println("\nRemovendo primeiro item (" + inicio.valor + "): ");
        inicio = inicio.proximo;
        tamanho--;
    }

    int tamanhoFila()
    {
        System.out.println(tamanho);
        return tamanho;
    }

    void exibir()
    {
        if (inicio == null)
        {
            System.out.println("Fila vazia.");
            return;
        }

        No atual = inicio;
        while (atual != null)
        {
            System.out.println("Valor: " + atual.valor + " | Prioridade: " + atual.prioridade);
            atual = atual.proximo;
        }
    }
}

public class Q2 {
    public static void main(String[] args)
    {
        filaPrioridade fila = new filaPrioridade();

        fila.inserir(4, 2);
        fila.inserir(2, 5);
        fila.inserir(5, 1);
        fila.inserir(1, 10);
        fila.inserir(3, 5);

        System.out.println("\nItens da fila:");
        fila.exibir();

        fila.remover();

        System.out.println("\nItens da fila:");
        fila.exibir();

        System.out.println("\nTamanho da fila:");
        fila.tamanhoFila();
    }
}
