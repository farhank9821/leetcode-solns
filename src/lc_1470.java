import java.util.Arrays;

public class lc_1470 {

    public static int[] shuffle(int[] nums, int n) {
      int[] ans = new int[2*n];
        for (int i = 0; i <2*n ; i = i +2) {
            if(i == 0){
                ans[0] = nums[0];
            }
            else {
                ans[i-1] = nums[i];
            }
        }
        for (int i = 1; i < 2*n; i = i + 2) {
            if(i == 1){
                ans[1] = nums[1];
            }
            else {
                ans[i-1] = nums[i];
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}
