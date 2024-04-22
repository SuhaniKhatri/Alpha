//time complexity - O(n)

package arrayList;
import java.util.ArrayList;

public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        //Reverse print
        for(int i=lst.size()-1; i>=0; i--) {
            System.out.print(lst.get(i)+" ");
        }
        System.out.println();

    }
}
