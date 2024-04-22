package oopsConcepts;

public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish fis = new Fish();
        fis.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Can walk");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird Flies");
    }
}
