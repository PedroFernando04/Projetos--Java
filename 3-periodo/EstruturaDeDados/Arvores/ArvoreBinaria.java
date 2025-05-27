//Pedro Fernando Feitosa Barbosa & Paulo Tavares Mendonça Neto

class No{
    int valor;
    No filhoEsquerdo;
    No filhoDireito;

    No(int novoValor){
        this.valor = novoValor;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    void inserirNo(int valorNovoNo){

        if(valorNovoNo > this.valor){
            if(this.filhoDireito == null)
            this.filhoDireito = new No(valorNovoNo);
            
            else
            this.filhoDireito.inserirNo(valorNovoNo);
        }

        else if(valorNovoNo < this.valor){
            if(this.filhoEsquerdo == null)
            this.filhoEsquerdo = new No(valorNovoNo);
            
            else
            this.filhoEsquerdo.inserirNo(valorNovoNo);
        }  
        else
        System.out.println("Valor(" + valorNovoNo + ") já existe");

    }


    void preOrdem(){
        System.out.println(this.valor);
        
        if(this.filhoEsquerdo != null)
        filhoEsquerdo.preOrdem();

        if(this.filhoDireito != null)
        filhoDireito.preOrdem();
    }

 
    void emOrdem(){
        if(this.filhoEsquerdo != null)
        filhoEsquerdo.emOrdem();

        System.out.println(this.valor);

        if(this.filhoDireito != null)
        filhoDireito.emOrdem();
    }

    void posOrdem(){
        if(this.filhoEsquerdo != null)
        filhoEsquerdo.posOrdem();

        if(this.filhoDireito != null)
        filhoDireito.posOrdem();
        
        System.out.println(this.valor);
    }


    boolean buscarValor(int valorBuscado){
        if(this.valor == valorBuscado)
        return true;

        else if(valorBuscado > this.valor){
            if(this.filhoDireito != null)
            return this.filhoDireito.buscarValor(valorBuscado);

            else return false;
        }

        else if(valorBuscado < this.valor){
            if(this.filhoEsquerdo != null)
            return this.filhoEsquerdo.buscarValor(valorBuscado);

            else return false;
        }

        else
        return false;
    }

    int alturaArvore(){

        int alturaDireita;
        int alturaEsquerda;
        

        if(this.filhoEsquerdo != null)
        alturaEsquerda = filhoEsquerdo.alturaArvore();
        else
        alturaEsquerda = 0;


        if(this.filhoDireito != null)
            alturaDireita = filhoDireito.alturaArvore();
        else
        alturaDireita = 0;


        int maiorAltura = alturaEsquerda;
        
        if(alturaDireita > alturaEsquerda)
        maiorAltura = alturaDireita;

        return 1 + maiorAltura;
    }

}

public class ArvoreBinaria{
    public static void main (String[] args){

    No raiz = new No(10);

    
    raiz.inserirNo(20);
    raiz.inserirNo(15);
    raiz.inserirNo(2);
    raiz.inserirNo(0);
    raiz.inserirNo(13);
    raiz.inserirNo(6);

    System.out.println("Pré Ordem: ");
    raiz.preOrdem();

    System.out.println("----------------------------------------------------");

    System.out.println("Em Ordem: ");
    raiz.emOrdem();

    System.out.println("----------------------------------------------------");

    System.out.println("Pós Ordem: ");
    raiz.posOrdem();

    System.out.println("----------------------------------------------------");

    System.err.println("O valor " + 13 + " está presente na árvore?");
    if(raiz.buscarValor(13))
    System.out.println("Sim\n");
    else
    System.out.println("Não\n");

    System.err.println("O valor " + 7 + " está presente na árvore?");
    if(raiz.buscarValor(7))
    System.out.println("Sim\n");
    else
    System.out.println("Não\n");
    
    System.out.println("----------------------------------------------------");

    System.out.println("Altura da árvore: " + raiz.alturaArvore());

    }
}
