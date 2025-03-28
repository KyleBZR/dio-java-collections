package sets.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produto;

    

    public CadastroProdutos() {
        this.produto = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade)
    {
        produto.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome()
    {
        Set<Produto> produtosPorNome = new TreeSet<>(produto);

        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco()
    {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produto);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(111111, "produto1", 22.2, 4);
        cadastroProdutos.adicionarProduto(111121, "produto2", 22.2, 4);
        cadastroProdutos.adicionarProduto(11131, "produto5", 29.2, 4);
        cadastroProdutos.adicionarProduto(11555511, "produto9", 122.2, 4);

       // System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

