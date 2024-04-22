package oopsConcepts;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
        b.lunch();
    }
}

interface Herbivore {
    void eats();
}

interface Carnivore {
    void lunch();
}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Eats both");
    }

    public void lunch() {
        System.out.println("This is there lunch");
    }
}




