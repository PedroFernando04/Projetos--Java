//Pedro Fernando Feitosa Barbosa & Paulo Tavares Mendonça Neto

import java.util.ArrayList;
import java.util.List;

class No{
    String nome;
    List<No> filhos;

    No(String novoNome){
        this.nome = novoNome;
        this.filhos = new ArrayList<>();
    }

    void inserirFilho(No filho){
        filhos.add(filho);
    }

    void inserirFilhos(String[] filharada){
        for(String titulo : filharada){
            No novoNo = new No(titulo);
            this.inserirFilho(novoNo);
        }
    }

    No buscaPorDescricao(String descricao){
        if(this.nome.equalsIgnoreCase(descricao)){
            return this;
        }
        for(No filho : filhos){
            No resultadoBusca = filho.buscaPorDescricao(descricao);
            if (resultadoBusca != null)
            return resultadoBusca;
        }
        return null;
    }

    void preOrdem(){
        System.out.println(nome);
        for (No filho : filhos){
            filho.preOrdem();
        }
    }

    void posOrdem(){
        for (No filho : filhos){
            filho.posOrdem();
        }
        System.out.println(nome);
    }

    void inserirFilhoPorDescricao(String nomePai, String novoFilho){
        No clube = buscaPorDescricao(nomePai);
        if(clube != null){
            No novoNo = new No(novoFilho);
            clube.inserirFilho(novoNo);
        }
        else{
            System.out.println("Clube não encotrado!");
        }
    }

    int alturaArvore(){
        if(filhos.isEmpty())
        return 1;

        else{
            int maiorAltura = 0;

            for(No filho : filhos){
                int alturaFilho = filho.alturaArvore();
                if (alturaFilho > maiorAltura){
                    maiorAltura = alturaFilho;
                }
            }
            return maiorAltura + 1;
        }
    }
}

public class ArvoreGenerica{
    public static void main(String[] args){
        System.out.println("Títulos CR7\n");

        No papaiCris = new No("Cristiano Ronaldo\n");


        No Sporting = new No("Sporting");
        String[] titulosSporting = {"Supertaça Cândido de Oliveira"};
        
        No Manchester = new No("Manchester United");
        String[] titulosManchester = {"Premier League", "Premier League", "Premier League", "Taça de Inglaterra", "League Cup", "Community Shield", "Champions League", "Mundial de Clubes", "Supertaça Europeia"};

        No Real = new No("Real Madrid");
        String[] titulosReal = {"Champions League", "Champions League", "Champions League", "Champions League", "La Liga", "La Liga", "Copa do Rei", "Copa do Rei", "Supertaça de Espanha", "Supertaça de Espanha", "Mundial de Clubes", "Mundial de Clubes", "Supertaça Europeias", "Supertaça Europeia" }; 

        No Juve = new No("Juventus");
        String[]  titulosJuve = {"Série A", "Série A", "Supertaça da Itália", "Supertaça da Itália", "Taça de Itália"};

        No AlNassr = new No("Al Nassr");
        String[] titulosAlNassr = {};

        No Portugal = new No("Seleção Portuguesa");
        String[] titulosGuianaBrasileira = {"Eurocopa", "UEFA Nations League"};


        papaiCris.inserirFilho(Sporting);
        papaiCris.inserirFilho(Manchester);
        papaiCris.inserirFilho(Real);
        papaiCris.inserirFilho(Juve);
        papaiCris.inserirFilho(AlNassr);
        papaiCris.inserirFilho(Portugal);

        Sporting.inserirFilhos(titulosSporting);
        Manchester.inserirFilhos(titulosManchester);
        Real.inserirFilhos(titulosReal);
        Juve.inserirFilhos(titulosJuve);
        AlNassr.inserirFilhos(titulosAlNassr);
        Portugal.inserirFilhos(titulosGuianaBrasileira);

        System.out.println("Inserção por descrição: ");
        papaiCris.inserirFilhoPorDescricao("Al Nassr", "Taça dos Campeões dos Clubes Árabes");

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.print("Pré Orde: ");
        AlNassr.preOrdem();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.print("Pós Ordem: ");
        Portugal.posOrdem();

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.print("Altura: ");
        System.out.println(papaiCris.alturaArvore());

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.print("Busca: ");
        System.out.println(papaiCris.buscaPorDescricao("Champions League").nome);

    }
}
