class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

interface Friendly {
    void greet();
}

class Dog extends Animal implements Pet, Friendly {
    public void play() {
        System.out.println("Dog loves to play");
    }

    public void greet() {
        System.out.println("Dog wags its tail in greeting");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Kunal 24csu338");
        d.eat();
        d.play();
        d.greet();
    }
}
