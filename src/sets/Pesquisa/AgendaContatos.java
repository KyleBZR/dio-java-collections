package sets.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero)
    {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos()
    {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome)
    {
        Set<Contato> contatosPorNome = new HashSet<>();
        
        for (Contato cont : contatoSet) {
            if(cont.getNome().startsWith(nome))
            {
                contatosPorNome.add(cont);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero)
    {
        Contato contatoAtualizado = null;
        for (Contato cont : contatoSet) {
            if(cont.getNome().equalsIgnoreCase(nome))
            {
                cont.setNumero(novoNumero);
                contatoAtualizado = cont;
                break;
            }
        }
        return contatoAtualizado;
    
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("nome1", 222);
        agendaContatos.adicionarContato("nome1", 232);
        agendaContatos.adicionarContato("nome4", 252);
        agendaContatos.adicionarContato("nome3", 222);
        agendaContatos.adicionarContato("nome2", 202);
        agendaContatos.exibirContatos();


        System.out.println(agendaContatos.pesquisarPorNome("nome1"));
        agendaContatos.atualizarNumeroContato("nome1", 9999);
        agendaContatos.exibirContatos();
    }
}
