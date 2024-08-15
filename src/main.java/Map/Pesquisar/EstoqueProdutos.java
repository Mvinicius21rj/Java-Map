package main.java.Map.Pesquisar;

import java.time.Clock;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome,int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calculaCalorTotalEstoque(){
        double valorTotalEstoque = 0d;
        //verificar se esta vazio
        if(!estoqueProdutosMap.isEmpty()){
            //extraindo valores
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() + p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public  Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        //a variavel double com o MIN_VALUE faz com que o primeiro valor de comparação seja o primeiro valor da lista de comparação
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p ;
                }


            }
        }
        return produtoMaisCaro;
        }

         public static void main(String[] args) {
            EstoqueProdutos estoque = new EstoqueProdutos();
            estoque.exibirProdutos();

            estoque.adicionarProduto(1l, "produto A",10,5.0);
            estoque.adicionarProduto(2l, "produto B",5,10.0);
             estoque.adicionarProduto(8l, "produto C",2,15.0);
             estoque.adicionarProduto(9l, "produto M",2,12.0);

             estoque.exibirProdutos();

             System.out.println("Valor Total do estoque: R$ " + estoque.calculaCalorTotalEstoque());
             System.out.println("Valor mais barato" + estoque.obterProdutoMaisCaro());
    }

}
