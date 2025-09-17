import java.util.Scanner;

class Area {
    private int length, breadth;

  
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

 
    public int returnArea() {
        return length * breadth;  
    }
}

public class AreaApp {
    public static void main(String[] args) {
        System.out.println("Kunal, 24csu338");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Area rect = new Area(l, b);

        System.out.println("Area of rectangle: " + rect.returnArea());
        
        sc.close();
    }
}
