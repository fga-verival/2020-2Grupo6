package ts.tdd.app;

// import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestesRendimentoLiquido 
{
    @Test
    public void TesteCalculoRendimentoLiquido()
    {
        CDB aplicacao = new CDB(60, 1000.00f, 8.5f);
	    assertEquals(1.08f, aplicacao.calcularRendimentoLiquido(), 0.1f);
    }

    @Test
    public void TesteCalculoRendimentoLiquido2()
    {
        CDB aplicacao = new CDB(120, 500f, 8f);
        assertEquals(2.04f, aplicacao.calcularRendimentoLiquido(), 0.1f);
    }
    
    @Test
    public void TesteCalculoRendimentoBruto3()
    {
        CDB aplicacao1 = new CDB(240, 3000f, 9f);
        CDB aplicacao2 = new CDB(270, 2000f, 8.5f);
        assertEquals(4.73f, aplicacao1.calcularRendimentoLiquido(), 0.01f);
        assertEquals(5.03f, aplicacao2.calcularRendimentoLiquido(), 0.01f);
    }
}
