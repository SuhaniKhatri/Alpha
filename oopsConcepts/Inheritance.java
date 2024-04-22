package oopsConcepts;

public class Inheritance {
    public static void main(String[] args) {
        Animal lion = new Animal();
      

        Fish shark = new Fish();
        shark.eat();

    }
}

//Base CLass
class Animal{
    String skinColor;
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived CLass
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}