public class lc_2535 {


    public static int differenceOfSum(int[] nums) {
        int sum1 = sumOfArray(nums);
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            while(nums[i] > 0){
                int d = nums[i] % 10;
                sum2 = sum2 + d;
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs(sum1-sum2);
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        int a = 152;
//        int sum = 0;
//        int d ;
//
//        while(a > 0){
//            d = a % 10;
//            sum = sum + d;
//            a = a / 10;
//        }
//        System.out.println(sum);

        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }
}
