package maps.Ordenacao;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    
    public void adicionarEventos(LocalDate data, String nome, String atracao)
    {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda()
    {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento()
    {
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
            {
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data" + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();
        agendaEventos.adicionarEventos(LocalDate.of(2025, 12, 12), "nome1", "atracao1");
        agendaEventos.adicionarEventos(LocalDate.of(2025, 2, 17), "nome2", "atracao2");
        agendaEventos.adicionarEventos(LocalDate.of(2025, 12, 11), "nome3", "atracao3");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
    
}
