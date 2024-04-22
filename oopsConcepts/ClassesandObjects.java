package oopsConcepts;

public class ClassesandObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen obj called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "suhaniKhatri";
        myAcc.setPassword("abcd");
    }
}

class BankAccount {
    public String userName;
    private String password; 

    public void setPassword (String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    int getTip() {
        return this.tip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int math, int chem) {
//         percentage = (phy + chem + math)/3; 
//     }
// }
