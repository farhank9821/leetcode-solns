import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 2932;
        int[] arr = new int[4];
        int i = 4;
        while(num > 0){
            int d = num % 10;
            arr[i-1] = d;
            num = num / 10;
            i--;
        }
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