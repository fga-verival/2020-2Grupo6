package ts.tdd.app;

public class CDB 
{
    private float tempoAplicacaoDias;
    private float aplicacaoInicial;
    private float taxaJuros;

    public CDB(int tempoAplicacaoDias, float aplicacaoInicial, float taxaJuros)
    {
        this.tempoAplicacaoDias = tempoAplicacaoDias;
        this.aplicacaoInicial = aplicacaoInicial;
        this.taxaJuros = taxaJuros;
    }

    public float calcularRendimentoBruto()
    {
        return aplicacaoInicial * (tempoAplicacaoDias / 365) * (taxaJuros / 100);
    }

}
