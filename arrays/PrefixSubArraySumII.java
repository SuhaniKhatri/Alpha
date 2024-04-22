//time complexity - O(n^2) < O(n^3)
//prefix Sum

package arrays;

public class PrefixSubArraySumII {
    public static void prefixSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        //calculate prefix array
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                currSum = i == 0 ? prefix[j] :  prefix[j] - prefix[i-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        prefixSum(numbers);
    }
}