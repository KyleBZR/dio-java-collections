package maps.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone)
    {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome)
    {
        if(!agendaContatoMap.isEmpty())
            agendaContatoMap.remove(nome);
    }

    public void exibirContatos()
    {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome)
    {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty())
        {
           numeroPorNome = agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.exibirContatos();
        agendaContato.adicionarContato("nome1", 321093);
        agendaContato.adicionarContato("nome2", 32111093);
        agendaContato.adicionarContato("nome6", 3219093);
        agendaContato.adicionarContato("nome1", 321093);
        agendaContato.adicionarContato("nome1", 321093);

        agendaContato.exibirContatos();

        agendaContato.removerContato("nome2");
        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarPorNome("nome1"));

    }

}
