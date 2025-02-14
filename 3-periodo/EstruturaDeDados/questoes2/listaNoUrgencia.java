class No{
    String valor;
    No proximo;
    boolean urgencia;

    No(String valorInicial, boolean urgente){
        valor = valorInicial;
        proximo = null;
        urgencia = urgente;
    }
}

class lista{
    No inicio;
    No fim;

    lista(){
        inicio = null;
        fim = null;
    }

    void inserir(No novoNo){

        if(inicio == null){
            inicio = fim = novoNo;
        }

        else if(novoNo.urgencia){
            novoNo.proximo = inicio;
            inicio = novoNo;
        }

        else{
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    void exibir(){
        No atual = inicio;

        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}

public class listaNoUrgencia {
    public static void main(String [] args){
        lista lista = new lista();

        lista.inserir(new No("C", true));
        lista.inserir(new No("D", false));
        lista.inserir(new No("B", true));
        lista.inserir(new No("A", true));

        lista.exibir();
    }
    
}
