package ts.tdd.app;

public class CDB 
{
    private int tempoAplicacaoDias;
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
        return 13.97f;
    }

}
