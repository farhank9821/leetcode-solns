import java.util.Arrays;

public class lc_1480 {
    public static int[] runningSum(int[] nums) {
      int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sumOfArray(nums,i);
        }
        return arr;
    }

    public static int sumOfArray(int[] nums, int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
