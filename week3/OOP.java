package week3;

//Atiwit Thongngoen 67070501048
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimiter();

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    private double px, py;
    private double r;

    public Circle(String color, double px, double py, double r) {
        super(color);
        this.px = px;
        this.py = py;
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimiter() {
        return Math.PI * 2 * r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void getP() {
        System.out.printf("(%.2f,%.2f)", this.px, this.py);
    }

}

class Rectangle extends Shape {
    private double p1x, p1y;
    private double p2x, p2y;

    public Rectangle(String color, double p1x, double p1y, double p2x, double p2y) {
        super(color);
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2y = p2y;
        this.p2x = p2x;
    }

    @Override
    public double area() {
        return Math.abs((p2x - p1x) * (p2y - p1y));
    }

    @Override
    public double perimiter() {
        return Math.abs(2 * (Math.abs((p2x - p1x)) + Math.abs((p2y - p1y))));
    }

    public void getP1() {
        System.out.printf("(%.2f,%.2f)", this.p1x, this.p1y);
    }

    public void getP2() {
        System.out.printf("(%.2f,%.2f)", this.p2x, this.p2y);
    }

    public void setP(double p1x, double p1y, double p2x, double p2y) {
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2y = p2y;
        this.p2x = p2x;
    }
}

class Triangle extends Shape {
    private double p1x, p1y;
    private double p2x, p2y;
    private double p3x, p3y;

    public Triangle(String color, double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        super(color);
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p3x = p3x;
        this.p3y = p3y;
    }

    private double side1() {
        return Math.sqrt(Math.pow(p2x - p1x, 2) + Math.pow(p2y - p1y, 2));
    }

    private double side2() {
        return Math.sqrt(Math.pow(p3x - p2x, 2) + Math.pow(p3y - p2y, 2));
    }

    private double side3() {
        return Math.sqrt(Math.pow(p1x - p3x, 2) + Math.pow(p1y - p3y, 2));
    }

    @Override
    public double area() {
        double p1 = side1();
        double p2 = side2();
        double p3 = side3();
        double s = (p1 + p2 + p3) / 2;
        return Math.sqrt(s * (s - p1) * (s - p2) * (s - p3));
    }

    @Override
    public double perimiter() {
        return side1() + side2() + side3();
    }

    public void getP1() {
        System.out.printf("(%.2f,%.2f)", this.p1x, this.p1y);
    }

    public void getP2() {
        System.out.printf("(%.2f,%.2f)", this.p2x, this.p2y);
    }

    public void getP3() {
        System.out.printf("(%.2f,%.2f)", this.p3x, this.p3y);
    }

    public void setP(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p3x = p3x;
        this.p3y = p3y;
    }

}

public class OOP {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 1, 2, 3);

        Rectangle r1 = new Rectangle("green", 1, 3, 2, 7);

        Triangle t1 = new Triangle("blue", 0, 0, 4, 0, 4, 3);

        System.out.printf("C1 used %s : %.2f unit , Black : %.2f \n", c1.color, c1.area(), c1.perimiter());
        System.out.printf("R1 used %s : %.2f unit , Black : %.2f \n", r1.color, r1.area(), r1.perimiter());
        System.out.printf("T1 used %s : %.2f unit , Black : %.2f", t1.color, t1.area(), t1.perimiter());

    }

}
