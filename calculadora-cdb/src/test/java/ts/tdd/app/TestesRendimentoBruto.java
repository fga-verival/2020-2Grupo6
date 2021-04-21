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

    @Test
    public void TesteCalculoRendimentoBruto3()
    {
        CDB aplicacao1 = new CDB(240, 3000f, 9f);
        CDB aplicacao2 = new CDB(270, 2000f, 8.5f);
        assertEquals(177.53f, aplicacao1.calcularRendimentoBruto(), 0.01f);
        assertEquals(125.75f, aplicacao2.calcularRendimentoBruto(), 0.01f);
    }

}
