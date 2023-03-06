import java.util.Arrays;

public class lc_217 {

    public static boolean containsDuplicate(int[] nums) {
        int count = 0;
        boolean var = false;
        Arrays.sort(nums);
        for ( int i = 0; i < nums.length; i++) {
            for ( int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j] && i != j){
                    count++;
                    if(count >= 1){
                        var = true;
                        break;
                    }
                }
            }
        }
        if(count == 0){
            var = false;
        }

        return var;
    }
    public static void main(String[] args) {

    }
}
