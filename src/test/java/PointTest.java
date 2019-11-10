import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void testLength() {
        Point a = new Point(5, 7);
        Point b = new Point(2, 4);
        double p = a.getLength(b);
        Assert.assertEquals(4.243, p, 0.001);
    }
}