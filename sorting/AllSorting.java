//Time complexity of BubbleSort, SelectionSort and InsertionSort - O(n^2)
//time complexity of inbuild method Array.sort(arr) - O(n log n) < O(n^2)

package sorting;
import java.util.*;

public class AllSorting {

    public static void bubbleSort(int arr[]) {
        int flag;
        for(int i=0; i<arr.length-1; i++) {
            flag = 0;
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0) {
                System.out.println("already swaped");
                break;
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int j = i-1;
            int x = arr[i];

            while(j >= 0 && arr[j] > x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        Arrays.sort(arr, 0, 3); 
        // Arrays.sort(arr, st, end); end index is exclusive
        // insertionSort(arr);
        printArr(arr);

    }
}
