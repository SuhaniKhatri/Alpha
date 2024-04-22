package bitwise;

public class EvenOrOdd {
    public static void oddOrEven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            //even number
            System.out.println("Even number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(2);
    }
}
