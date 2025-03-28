package sets.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados()
    {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite)
    {
        convidadoSet.add(new Convidado("Convidado1", 123));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite)
    {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite)
            {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados()
    {
        return convidadoSet.size();
    }

    public void exibirConvidados()
    {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidado("nome1", 123);
        conjuntoConvidados.adicionarConvidado("nome55'", 123);
        conjuntoConvidados.adicionarConvidado("nome2", 123);
        conjuntoConvidados.adicionarConvidado("nome4", 523);
        conjuntoConvidados.adicionarConvidado("nome15", 223);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

    }
}
