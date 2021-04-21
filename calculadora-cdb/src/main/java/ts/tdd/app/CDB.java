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

    public float calcularImpostoRenda()
    {
        if (this.tempoAplicacaoDias <= 180){
            return calcularRendimentoBruto() * 0.225f;
        } else if (this.tempoAplicacaoDias >= 181 && this.tempoAplicacaoDias <= 360){
            return calcularImpostoRenda() * 0.2f;
        } else if (this.tempoAplicacaoDias >= 361 && this.tempoAplicacaoDias <= 720){
            return calcularImpostoRenda() * 0.175f;
        } else {
            return calcularImpostoRenda() * 0.15f;
        }
    }
}
