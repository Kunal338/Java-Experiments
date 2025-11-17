abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double sub1, sub2, sub3;

    A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    double getPercentage() {
        double total = sub1 + sub2 + sub3;
        return (total / 300) * 100;
    }
}

class B extends Marks {
    double sub1, sub2, sub3, sub4;

    B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    double getPercentage() {
        double total = sub1 + sub2 + sub3 + sub4;
        return (total / 400) * 100;
    }
}

public class AbstractPercentage {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 95);
        B studentB = new B(80, 75, 85, 90);
        System.out.println("Kunal 24csu338");

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
