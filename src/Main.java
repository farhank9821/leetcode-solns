import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] arr = twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}