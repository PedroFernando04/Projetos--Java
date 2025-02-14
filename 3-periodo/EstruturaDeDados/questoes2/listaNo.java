class No{
    String valor;
    No proximo;

    No(String valorInicial){
        valor = valorInicial;
        proximo = null;
    }
}

class lista{
    No inicio;
    No fim;

    lista(){
        inicio = null;
        fim = null;
    }

    void inserirNoInicio(No novoNo){
        if(inicio == null){
            inicio = fim = novoNo;
        }

        else{
            inicio.proximo = novoNo;
            inicio = novoNo;
        }
    }

    void inserirNoFim(No novoNo){
        if(fim == null){
            inicio = fim = novoNo;
        }

        else{
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    void exibir(){
        No atual = inicio;

        while( atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}


public class listaNo{
    public static void main(String[] args){
        lista lista = new lista();

        lista.inserirNoInicio(new No("A"));
        lista.inserirNoFim(new No("B"));
        lista.inserirNoFim(new No("C"));
        lista.inserirNoFim(new No("D"));

        System.out.println("Lista:\n");
        lista.exibir();
    }
}
