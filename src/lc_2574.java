import java.util.Arrays;

public class lc_2574 {
    public static int[] leftRigthDifference(int[] nums) {
       int[] arr1 = leftSum(nums);
       int[] arr2 = rightSum(nums);
       int[] arr3 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr3[i] = Math.abs(arr1[i]-arr2[i]);
        }
        return arr3;
    }

    public static int[] rightSum(int[] nums){

        int sum = sumOfArray(nums);
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sum - nums[i];
            sum = sum - nums[i];
        }
        return arr;
    }
    public static int[] leftSum(int[] nums){
        int[] arr = new int[nums.length];
        arr[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+nums[i-1];
        }
        return arr;
    }


    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
      int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(rightSum(nums)));
        System.out.println(Arrays.toString(leftSum(nums)));
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
    }
}
