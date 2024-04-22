//time Complexity - O(n^2)

package sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int swap;
        for(int turn=0; turn<arr.length-1; turn++) {
            swap = 0;
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swap++;
                }
            }
            if(swap == 0) {
                System.out.println("Already sorted");
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
    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
}
