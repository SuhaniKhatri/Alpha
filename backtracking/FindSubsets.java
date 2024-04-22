//time Complexity - O(n * 2^n)
//space complexity - o(n)

package backtracking;

public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        //base case
        if(i == str.length()) {
            if(ans == "") {
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }

        //recursion kaam
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
        
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println();
        findSubsets(str, "", 0);
    }
}
