package maps.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;



    public Contato(String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getNumero()
    {
        return this.numero;
    }

    

    @Override
    public String toString()
    {
        return "Contato{" +
        "nome =" + this.nome +
        "," + "numero = " + this.numero +
        "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
