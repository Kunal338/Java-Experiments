interface Shape {
    void draw();
}

interface Circle extends Shape {
    void area();
}

class CircleImpl implements Circle {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void area() {
        System.out.println("Area of Circle = pi * r * r");
    }
}

public class Inheritance1B {
    public static void main(String[] args) {
        CircleImpl c = new CircleImpl();
        System.out.println("Kunal 24csu338");
        c.draw();
        c.area();
    }
}
