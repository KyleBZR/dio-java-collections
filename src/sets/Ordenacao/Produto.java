package sets.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    

    public long getCodigo() {
        return this.codigo;
    }


    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + this.codigo + 
        ", nome=" +  this.nome + 
        ", preco=" + this.preco + 
        ", quantidade=" + this.quantidade + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof Produto produto)) 
        return false;
    return getCodigo() == produto.getCodigo(); 

    }


    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}