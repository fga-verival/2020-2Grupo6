package ts.tdd.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestesRendimentoLiquido 
{
    @Test
    public void TesteCalculoRendimentoLiquido()
    {
        CDB aplicacao = new CDB(60, 1000.00f, 8.5f);
	    assertEquals(1.08f, aplicacao.calcularRendimentoLiquido());
    }   
}
