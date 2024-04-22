package sorting;

public class OptimisedBubbleSort {
    public static void modifiedBubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                    swapped = true;
                }
            }
            if(swapped == false) {
                System.out.println("Out of loop");
                break;
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println();
        modifiedBubbleSort(arr);
        printArr(arr);

    }
}
