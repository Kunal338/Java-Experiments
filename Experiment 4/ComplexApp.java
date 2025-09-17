import java.util.Scanner;

class Complex {
    private int real, imag;

  
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

  
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex multiply(Complex c) {
        int r = this.real * c.real - this.imag * c.imag;
        int i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

  
    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}

public class ComplexApp {
    public static void main(String[] args) {
        System.out.println("Kunal, 24csu338");
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter real part of first complex no.: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex no.: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

       
        System.out.print("Enter real part of second complex no.: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex no.: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

 
        System.out.print("Sum: ");
        c1.add(c2).display();

        System.out.print("Difference: ");
        c1.subtract(c2).display();

        System.out.print("Product: ");
        c1.multiply(c2).display();
    }
}