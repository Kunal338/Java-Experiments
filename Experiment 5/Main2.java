import java.util.Scanner;

class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kunal 24csu338");
        System.out.print("Enter number of tyres: ");
        int n = sc.nextInt();

        Vehicle v;

        if (n == 2) {
            v = new Bike();
        } else if (n == 4) {
            v = new Car();
        } else {
            v = new Vehicle();
        }

        v.display();
    }
}
