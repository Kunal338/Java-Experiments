interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void method();
}

class Demo implements C {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }

    public void method() {
        System.out.println("Method C from Interface C");
    }
}

public class Inheritance1C {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Kunal 24csu338");
        obj.methodA();
        obj.methodB();
        obj.method();
    }
}
