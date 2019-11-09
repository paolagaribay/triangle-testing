import java.math.BigDecimal;
import java.math.RoundingMode;

class Triangle {

    private double a;
    private double b;
    private double c;
    private int flag;

    Triangle(double side1, double side2, double side3){
        a = side1;
        b = side2;
        c = side3;
    }
    void triangleType() {
        double as = (new BigDecimal(a * a).setScale(1, RoundingMode.HALF_UP)).doubleValue();
        double bs = (new BigDecimal(b * b).setScale(1, RoundingMode.HALF_UP)).doubleValue();
        double cs = (new BigDecimal(c * c).setScale(1, RoundingMode.HALF_UP)).doubleValue();

        if (!(a > 0 && b > 0 && c > 0)) {
            flag = 1;
            System.out.println("Error: Sides must be greater than 0.");
        }
        else {
            if (a + b > c && b + c > a && c + a > b) {
                flag = 0;
                if ((a == b) && (b == c)) {
                    System.out.println("Triangle is Equilateral.");
                }
                else if ((a == b && b != c) || (b == c && a != c) || (c == a & b != a)) {
                    System.out.println("Triangle is Isosceles.");
                }
                else if ((a != b) && (b != c) && (a != c)) {
                    System.out.println("Triangle is Scalene.");
                }
                if ((as + bs == cs) || (bs + cs == as) || (cs + as == bs)) {
                    System.out.println("Triangle is Right.");
                }
            }
            else {
                flag = 1;
                System.out.println("Error: Triangle sides are invalid.");
            }
        }
    }
    void getArea() {
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        String str = String.format("%.02f", area);
        if (flag != 1) {
            System.out.println("Triangle area is " + str + ".");
        }
    }
}