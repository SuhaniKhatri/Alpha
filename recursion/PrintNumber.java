package recursion;

public class PrintNumber {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    } 

    public static void printInc(int n) {
        if(n == 1) {
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n) {  //O(n)
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;

    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }

        int Snm1 = sum(n-1);
        int Sn = n + sum(n-1);
        return Sn;
    }

    //fibonacci series
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //Sorted or not   Time COmplexity - O(n), Space - O(n)
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    //first occurence of key in an array
    public static int firstOcc(int arr[], int key, int i) {
        if(i == arr.length-1) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

     //last occurence of key in an array
     public static int lastOcc(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        } 

        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key)  {
            return i;
        }

        return isFound;
     }

     //print x^n

     public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
     }


     //optimized approch for x^n   Time Complexity - O(n)
     public static int optimizedPower(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n%2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
     }

     //tiling problem
     public static int tilingProblem(int n) {   //2 * n (floor size)
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //kaam
        //vertical choice 
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

     }

     //remove duplicate String
     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {   //index
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx, newStr.append(currChar), map);
        }
     } 
     
     public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        //choice 
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalPairs
        int totalPairs = fnm1 + pairWays; 
        return totalPairs;

        // return  friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

     }

     public static void printBinString(int n, int lastPlace, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        //kaam
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str+"1");
        }
     }


    public static void main(String[] args) { 

        printBinString(3, 0, new String(""));

        // System.out.println(friendsPairing(3));

        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // int a = 2;
        // int n = 10;

        // System.out.println(optimizedPower(a, n));

        // System.out.println(tilingProblem(4));

        // int n = 5;
        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(power(2, 10));

        // System.out.println(lastOcc(arr, 5, 0));
    }
}


