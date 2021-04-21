package ts.tdd.app;

// import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestesImpostoRenda {
    @Test
    public void TesteCalcularImpostoRenda()
    {
        CDB aplicacao = new CDB(60, 1000.00f, 8.5f);
        assertEquals(3.14f, aplicacao.calcularImpostoRenda(), 0.1);
    }

    @Test
    public void TesteCalcularImpostoRenda2()
    {
        CDB aplicacao = new CDB(120, 500f, 8f);
        assertEquals(2.96f, aplicacao.calcularImpostoRenda(), 0.1);
    }

    @Test
    public void TesteCalcularImpostoRenda3()
    {
        
        CDB aplicacao1 = new CDB(240, 3000f, 9f);
        CDB aplicacao2 = new CDB(270, 2000f, 8.5f);
        
        assertEquals(35.51f, aplicacao1.calcularImpostoRenda(), 0.1);
        assertEquals(25.15f, aplicacao2.calcularImpostoRenda(), 0.1);
    }
}
