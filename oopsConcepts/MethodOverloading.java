package oopsConcepts;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator clac = new Calculator();
        System.out.println(clac.sum(3, 4));
        System.out.println(clac.sum(3, 4, 5));
        System.out.println(clac.sum(1.2f, 3.1f));
    }
}

class Calculator {

    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}
