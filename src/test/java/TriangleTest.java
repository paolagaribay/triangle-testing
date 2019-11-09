import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TriangleTest {

    @Test
    public void equilateralTest () {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Triangle t = new Triangle(1,1,1);
        t.triangleType();

        Assert.assertEquals("Triangle is Equilateral.\r\n", os.toString());
    }

    @Test
    public void isoscelesTest () {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Triangle t = new Triangle(2,2,1);
        t.triangleType();

        Assert.assertEquals("Triangle is Isosceles.\r\n", os.toString());
    }

    @Test
    public void scaleneTest () {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Triangle t = new Triangle(6,3,4);
        t.triangleType();

        Assert.assertEquals("Triangle is Scalene.\r\n", os.toString());
    }

    @Test
    public void sidesTest () {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Triangle t = new Triangle(0,-1,2);
        t.triangleType();

        Assert.assertEquals("Error: Sides must be greater than 0.\r\n", os.toString());
    }

    @Test
    public void validTest () {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Triangle t = new Triangle(1,2,3);
        t.triangleType();

        Assert.assertEquals("Error: Triangle sides are invalid.\r\n", os.toString());
    }

    @Test
    public void areaTest () {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Triangle t = new Triangle(3,4,5);
        t.getArea();

        Assert.assertEquals("Triangle area is 6.00.\r\n", os.toString());
    }
}