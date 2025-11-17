abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {

    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    void CircleArea(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Abstractmain {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Kunal 24csu338");
        obj.RectangleArea(5, 3);
        obj.SquareArea(4);
        obj.CircleArea(2.5);
    }
}
