import java.lang.Math;

public class MyTriangle {
    double sideA;
    double sideB;
    double sideC;

    public MyTriangle() throws NotATriangleException {
        this.sideA = 5.0;
        this.sideB = 5.0;
        this.sideC = 5.0;
    }

    public MyTriangle(double a) throws NotATriangleException {
        this.sideA = a;
        this.sideB = a;
        this.sideC = a;
    }

    public MyTriangle(double a, double b) throws NotATriangleException {
        if (a * 2 >  b) {
            this.sideA = a;
            this.sideB = a;
            this.sideC = b;
        } else throw new NotATriangleException();
    }

    public MyTriangle(double a, double b, double c) throws NotATriangleException {
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        } else throw new NotATriangleException();
    }

    public double area() {
        double s = (this.sideA + this.sideB + this.sideC) / 2;
        double a = Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
        return a;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Triangle1: Default");
            MyTriangle triangle1 = new MyTriangle();
            System.out.println("Area of Triangle1: " + triangle1.area() + "\n");
            System.out.println("Triangle2: Equilateral triangle with side length 6");
            MyTriangle triangle2 = new MyTriangle(6.0);
            System.out.println("Area of Triangle2: " + triangle2.area() + "\n");
            System.out.println("Triangle3: Ispsceles triangle with isosceles 5 and bottom 4");
            MyTriangle triangle3 = new MyTriangle(5.0, 4.0);
            System.out.println("Area of Triangle3: " + triangle3.area() + "\n");
            System.out.println("Triangle4: A triangle with 3, 4, 5");
            MyTriangle triangle4 = new MyTriangle(3.0, 4.0, 5.0);
            System.out.println("Area of Triangle4: " + triangle4.area());
        } catch (NotATriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

class NotATriangleException extends Exception {
    public NotATriangleException() {
        super("Not A Triangle. Length is INVALID.");
    }
}
