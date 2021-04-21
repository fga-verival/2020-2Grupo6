package ts.tdd.app;

// import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestesRendimentoBruto 
{
    @Test
    public void TesteCalculoRendimentoBruto()
    {
        CDB aplicacao = new CDB(60, 1000.00f, 8.5f);
        assertEquals(13.97f, aplicacao.calcularRendimentoBruto(), 0.01f);
    }

    @Test
    public void TesteCalculoRendimentoBruto2()
    {
        CDB aplicacao = new CDB(120, 500.00f, 8f);
        assertEquals(13.15f, aplicacao.calcularRendimentoBruto(), 0.01f);
    }

}
