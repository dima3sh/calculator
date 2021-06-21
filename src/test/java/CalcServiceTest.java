import org.azati.courses.services.CalcService;
import org.junit.Assert;
import org.junit.Test;

public class CalcServiceTest {

    @Test
    public void testAdd() {
        Assert.assertEquals((CalcService.add(1, 2)), 3);
        Assert.assertEquals((CalcService.add(15, 34.5)), 49.5);
        Assert.assertEquals((CalcService.add(12.06, -2)), 10.06);
        Assert.assertEquals((CalcService.add(32.4, 22.3)), 54.7);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddExcept() {
        Assert.assertEquals((CalcService.add((Float.valueOf("25.3")), 2)), 3);
    }
}
