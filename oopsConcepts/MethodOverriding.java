package oopsConcepts;

public class MethodOverriding {
    public static void main(String[] args) {

       Big nw = new Big();
        nw.eat();
        // Deer d = new Deer();
        // d.eat();
    }
}

class Big {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
