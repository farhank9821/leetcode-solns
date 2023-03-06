import java.util.Arrays;

public class lc_1920 {

    public static int[] buildArray(int[] nums) {
      int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
    public static void main(String[] args) {
       int[] nums = {5,0,1,2,3,4};
       int[] arr = buildArray(nums);
        System.out.println(Arrays.toString(arr));

    }
}
