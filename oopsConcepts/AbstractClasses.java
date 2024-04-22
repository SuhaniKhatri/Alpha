package oopsConcepts;

public class AbstractClasses {
    public static void main(String[] args) {

        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken ch = new Chicken();
        // ch.eat();
        // ch.walk();
    }
}

abstract class Animals {
    String color;

    Animals() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}


class Horse extends Animals {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animals {

    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}