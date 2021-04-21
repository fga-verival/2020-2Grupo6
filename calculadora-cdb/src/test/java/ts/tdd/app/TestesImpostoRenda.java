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
}
