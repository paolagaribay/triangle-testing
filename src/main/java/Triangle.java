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
        if ((a > 0 && b > 0 && c > 0) && (a + b > c && b + c > a && c + a > b)) {
            flag = 0;
            if ((a == b) && (b == c)) {
                System.out.println("Triangle is Equilateral.");
            }
            else if ((a == b && b != c) || (b == c && a != c) || (c == a & b != a)){
                System.out.println("Triangle is Isosceles.");
            }
            else if ((a != b) && (b != c) && (a != c)) {
                System.out.println("Triangle is Scalene.");
            }

            if ((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b)) {
                System.out.println("Triangle is Right.");
            }
        }
        else {
            flag = 1;
            System.out.println("Triangle is Invalid.");
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