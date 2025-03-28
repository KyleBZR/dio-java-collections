package maps.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

   private Map<Long, Produto> estoqueProduto;

   
    public EstoqueProdutos()
    {
        this.estoqueProduto = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco)
    {
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos()
    {
        System.out.println(estoqueProduto);
    }

    public double calcularValorTotalEstoque()
    {
        double valorTotal = 0.00;
        if(!estoqueProduto.isEmpty())
        {
            for (Produto valor : estoqueProduto.values()) {
            valorTotal += valor.getQuantidade() * valor.getPreco();
        }
        }
        return valorTotal;
    }

    public Produto obteProdutoMaisCaro()
    {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProduto.isEmpty())
        {
            for (Produto elem : estoqueProduto.values()) {
                if(elem.getPreco() > maiorPreco)
                {
                    maiorPreco = elem.getPreco();
                    produtoMaisCaro = elem;
                }
            }
        }  
            return produtoMaisCaro;
    }

    public Produto obteProdutoMaisBarato()
    {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProduto.isEmpty())
        {
            for (Produto elem : estoqueProduto.values()) {
                if(elem.getPreco() < menorPreco)
                {
                    menorPreco = elem.getPreco();
                    produtoMaisBarato = elem;
                }
            }
        }  
            return produtoMaisBarato;
    }
    
    public Produto obteProdutoComMaiorQuantidade()
    {
        Produto produtoComMaiorQuantidade = null;
        Integer maiorQuantidade = Integer.MIN_VALUE;
        if(!estoqueProduto.isEmpty())
        {
            for (Produto elem : estoqueProduto.values()) {
                if(elem.getQuantidade() > maiorQuantidade)
                {
                    maiorQuantidade = elem.getQuantidade();
                    produtoComMaiorQuantidade = elem;
                }
            }
        }  
            return produtoComMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1111111, "nome1", 222, 33.7);
        estoqueProdutos.adicionarProduto(119111, "nome2", 33332, 36.7);
        estoqueProdutos.adicionarProduto(199991111, "nome3", 22, 100.7);
        estoqueProdutos.adicionarProduto(1111311, "nome4", 2, 3.7);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obteProdutoComMaiorQuantidade());
        System.out.println(estoqueProdutos.obteProdutoMaisBarato());
        System.out.println(estoqueProdutos.obteProdutoMaisCaro());
    }
}
