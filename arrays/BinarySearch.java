//time complexity - O(log n)
package arrays;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end)/2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {  //right(2nd half)
                start = mid + 1;
            }else {    //left(1st half)
                end = mid - 1;
            }
           
        }
        return -1;
    }
   public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("Index is found at: " + binarySearch(numbers, key));
   }
       
}
