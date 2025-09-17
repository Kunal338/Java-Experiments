class Shape {
    void display() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void display() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void display() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void display() {
        System.out.println("Square is a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println("Kunal 24csu338");

        sq.display(); 
        ((Shape) sq).display(); 
      
        Shape s = new Shape();
        Rectangle r = new Rectangle();

        s.display(); 
        r.display(); 
    }
}
