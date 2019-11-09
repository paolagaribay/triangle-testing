import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 's' to input sides or 'p' to input points: ");
        char input = sc.next().charAt(0);
        System.out.println();
        try {
            if (input == 's') {
                System.out.print("Enter side 1: ");
                double side1 = sc.nextDouble();
                System.out.print("Enter side 2: ");
                double side2 = sc.nextDouble();
                System.out.print("Enter side 3: ");
                double side3 = sc.nextDouble();
                System.out.println();

                Triangle s = new Triangle(side1, side2, side3);
                s.triangleType();
                s.getArea();
            }
            else if (input == 'p') {
                System.out.print("Enter x1 point: ");
                double x1 = sc.nextDouble();
                System.out.print("Enter y1 point: ");
                double y1 = sc.nextDouble();
                System.out.print("Enter x2 point: ");
                double x2 = sc.nextDouble();
                System.out.print("Enter y2 point: ");
                double y2 = sc.nextDouble();
                System.out.print("Enter x3 point: ");
                double x3 = sc.nextDouble();
                System.out.print("Enter y3 point: ");
                double y3 = sc.nextDouble();
                System.out.println();

                Point point1 = new Point(x1, y1);
                Point point2 = new Point(x2, y2);
                Point point3 = new Point(x3, y3);

                double edge1 = point1.getLength(point2);
                double edge2 = point2.getLength(point3);
                double edge3 = point3.getLength(point1);

                Triangle p = new Triangle(edge1, edge2, edge3);
                p.triangleType();
                p.getArea();
            }
            else {
                System.out.println("Error: Input invalid. Enter 's' or 'p'.");
            }
        } catch(InputMismatchException e) {
            System.out.println("Error: Input invalid. Enter only numbers.");
        }
    }
}