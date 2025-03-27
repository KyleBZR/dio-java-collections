package listas.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private int idade;
    private String nome;
    private double altura;

    public Pessoa(String nome, int idade, double altura)
    {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p)
    {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome()
    {
        return this.nome;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public int getIdade()
    {
        return this.idade;
    }

    public String toString()
    {
        return "Pessoa " +
                "Nome= " + this.nome +
                " Idade:  " + this.idade +
                " Altura: " + this.altura;
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>
{
    
    public int compare(Pessoa p1, Pessoa p2)
    {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
