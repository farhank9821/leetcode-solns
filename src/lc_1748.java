public class lc_1748 {

    public static int sumOfUnique(int[] nums){
       int sum = 0;
       int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i != j){
                    count++;
                }
            }
            if(count == 0){
                sum = sum + nums[i];
            }
            count = 0;

        }
     return sum;
    }


    public static void main(String[] args) {
       int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
}
