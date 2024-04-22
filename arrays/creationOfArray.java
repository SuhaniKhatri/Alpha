package arrays;

import java.util.Scanner;

public class creationOfArray {
    public static void main(String[] args) {
        int marks[] = new int[20];

        int numbers[] ={1, 2, 3};

        String fruits[] = {"apple", "mango"};

        Scanner sc = new Scanner(System.in);

        //creation
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //Math
        marks[2] = sc.nextInt(); //Chem

        System.out.println("Marks of Physics: " + marks[0]);
        System.out.println("Marks of Maths: " + marks[1]);
        System.out.println("Marks of Chemistry: " + marks[2]);

        int precentage =( marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage: " + precentage + "%");

        //updation 
        // marks[2] = 100;
        // System.out.println("Marks of Chemistry: " + marks[2]);

     }
}
