package sorting;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void printArr(Integer nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);


        /*for reverse sorting we have to use COllection and it is 
        only used on Objects so instead of int we have to use Integer*/
        Integer nums[] = {4,7,6,5,1,3,8,2};

        Arrays.sort(nums, Collections.reverseOrder());

        printArr(nums);
    }
     
}