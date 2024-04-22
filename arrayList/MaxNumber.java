//time complexity - O(n)\

package arrayList;
import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(5);
        num.add(9);
        num.add(6);
        num.add(8);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.size(); i++) {
            max = Math.max(max, num.get(i));
            // if(num.get(i) > max) {
            //     max = num.get(i);
            // }
        }
        System.out.println("max element = " + max);
    }

}
