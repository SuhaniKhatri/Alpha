//time complexity - O(n log n)
//space complexity - O(n)

package divideNconquer;

public class MergeSort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;     //mid = si + ei/2

        mergeSort(arr, si, mid);    //left part
        mergeSort(arr, mid+1, ei);  //right part

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        //left(0, 3) = 4, //right(4,6) = 3  //(6-0+1) = 7
        int temp[] = new int[ei-si+1];

        int i = si;  //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;      //iterator for temp array

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++; 
            }else {
                temp[k] = arr[j];
                j++; 
            }

            k++;
        }

        //it some parts remains in left or right part 
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part 
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copt temp array to my original array
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
