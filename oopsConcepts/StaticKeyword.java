package oopsConcepts;

public class StaticKeyword {
    public static void main(String[] args) {
        // Teacher.schoolName = "JVM";
        // System.out.println(Teacher.schoolName);
    //    Teacher s1 = new Teacher();
    //     s1.schoolName = "JMV";
        
    //     Teacher s2 = new Teacher();
    //     System.out.println(s2.schoolName);
    }
}

class Teacher {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName () {
        return this.name;
    }
}
