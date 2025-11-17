interface GeometricObject {
    double getPerimeter();
    double getArea();
}

interface Resizable {
    void resize(int percent);
}

class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius = radius * (percent / 100.0);
    }
}

public class exp62 {
    public static void main(String[] args) {

        System.out.println("Kunal 24csu338");

        Circle circle = new Circle(5.0);
        System.out.println("\nCircle:");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("\nResizable Circle (Before Resize): ");
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(50);  // reduce radius to 50%

        System.out.println("\nResizable Circle (After Resize): ");
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}
