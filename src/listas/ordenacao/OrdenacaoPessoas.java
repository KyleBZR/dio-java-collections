package listas.ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoas {
    private List<Pessoa> pessoaLista;

    public OrdenacaoPessoas()
    {
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura)
    {
        pessoaLista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade()
    {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome 1", 22, 1.89);
        ordenacaoPessoas.adicionarPessoa("nome 2", 23, 1.79);
        ordenacaoPessoas.adicionarPessoa("nome 3", 24, 1.82);
        ordenacaoPessoas.adicionarPessoa("nome 4", 25, 1.60);
        ordenacaoPessoas.adicionarPessoa("nome 5", 26, 1.42);
        System.out.println(ordenacaoPessoas.pessoaLista);
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
