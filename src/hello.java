import java.util.*;

public class hello {
    public static void printNo(int n){
        if(n == 0)
            return;
        System.out.println(n +" ");
        printNo(n-1);
    }

    public static void printNumbers(int n){
        if(n == 0)
            return;
        printNumbers(n-1);
        System.out.println(n +" ");
    }

    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;     // there might be a possibility that  (start + end) might
            // exceed the range of integer, therefore use s+(e-s)/2
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;                     // -1 indicates that element does not exists

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
////        printNo(n);
////        printNumbers(n);
//        System.out.println(factorial(n));

        int[] nums = {1,2,5,2,3};
        Arrays.sort(nums);
        System.out.println(binary_search(nums,2));


    }
}
