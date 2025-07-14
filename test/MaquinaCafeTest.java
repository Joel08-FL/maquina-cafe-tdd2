import org.junit.Test;
import static org.junit.Assert.*;

public class MaquinaCafeTest {
    @Test
    public void testCafePequeno() {
        MaquinaCafe mc = new MaquinaCafe();
        String resultado = mc.servirCafe("pequeno", 2);
        assertEquals("Sirviendo café de 3oz con 2 azúcar.", resultado);
    }
}
