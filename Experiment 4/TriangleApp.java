class Triangle {
    private int a, b, c;

    
    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

   
    public double area() {
        double s = (a + b + c) / 2.0;  
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    
    public int perimeter() {
        return a + b + c;
    }
}

public class TriangleApp {
    public static void main(String[] args) {
        System.out.println("Kunal, 24csu338");
        
        Triangle t = new Triangle();
        
        System.out.println("Area of triangle: " + t.area());
        System.out.println("Perimeter of triangle: " + t.perimeter());
    }
}
