package oopsConcepts;

public class SuperKeyword {
    public static void main(String[] args) {
        Ballpen bp = new Ballpen();
        System.out.println(bp.caps);
    }     
}

class Pen {
    String caps;
    Pen() {
        System.out.println("pen constructor is called");
    }
}

class Ballpen extends Pen {
    Ballpen() {
        super.caps = "blue";
        // super();
        System.out.println("this is the ballpen");
    }
}
