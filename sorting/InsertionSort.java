//time Complexity - O(n^2)
package sorting;

public class InsertionSort {
    public static void insertionSort(int arr[], int n) {
        for(int i=1; i<n; i++) {
            int prev = i-1;    //prev = j
            int curr = arr[i];    //curr = x (element which one should inserted)

            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //inserting
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr, 5);
        printArr(arr);
   } 
}
