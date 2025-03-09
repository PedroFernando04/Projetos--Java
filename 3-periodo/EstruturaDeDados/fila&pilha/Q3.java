class No
{
    String valor;
    No proximo;

    No(String valorAtual)
    {
        valor = valorAtual;
        proximo = null;
    }
}

class pilhaEncadeada
{
    No inicio;
    No fim;
    int tamanho;

    pilhaEncadeada()
    {
        inicio = fim = null;
        tamanho = 0;
    }

    void push(String novoValor)
    {
        No novoNo = new No(novoValor);

        if(inicio == null)
        inicio = fim = novoNo;

        else
        {
            novoNo.proximo = inicio;
            inicio = novoNo;
        }

        tamanho++;
    }

    void pop()
    {
        boolean vazio = isEmpty();

        if(!vazio)
        {
            System.out.println("item removido: " + inicio.valor + "\n");
            inicio = inicio.proximo;
            tamanho--;
        }
    }

    void peek()
    {
        System.out.println("Topo atual: " + inicio.valor + "\n");
    }

    boolean isEmpty()
    {
        if(inicio == null)
        {
            System.out.println("Pilha vazia!\n");
            return true;
        }
        
        else
        {
            System.out.println("Pilha com " + tamanho + " elemento(s)\n");
            return false;
        }
    }

    void exibir()
    {
        No atual = inicio;

        while(atual != null)
        {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}

public class Q3
{
    public static void main(String[] args)
    {
        pilhaEncadeada pilha = new pilhaEncadeada();

        pilha.pop();

        pilha.push("FalleN");
        pilha.push("Fer");
        pilha.push("Coldzera");
        pilha.push("Taco");
        pilha.push("FNX");

        pilha.exibir();
        pilha.peek();
        pilha.pop();

        pilha.push("Felps");
        pilha.exibir();
    }
}
