package oopsConcepts;

public class Example {
    public static void main(String[] args) {
        Vehicle v = new Bus();
        v.print();   //whose obj here bus so bus print method is called
    }
}

class Vehicle {
    void print () {
        System.out.println("Base class vehicle");
    }
}

class Bus extends Vehicle {
    void print() {
        System.out.println("Derived class vehicle");
    }
}
