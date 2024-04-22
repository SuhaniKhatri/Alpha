//Java Collection framework (part of) - Collection of inbuilt classes and interfaces
//vectors in c++ is same as arraylist in java

package arrayList;
import java.util.ArrayList;

public class arraylistImpl {
    public static void main(String[] args) {
        // ClassName Objectname = new ClassName();  //with new keyword we create space in heap memory
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(4, 12); //O(n)

        // System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //Get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Delete Element - O(n) Linear time Complexity
        list.remove(2);
        System.out.println(list);

        //Set - O(n)
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));

    }
}
