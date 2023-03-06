public class lc_2529 {

    public static int maximumCount(int[] nums) {
//        int pos = 0;
//        int neg = 0;
//        int low = 0;
//        int high = nums.length-1;
//        while(low <= high){
//            int mid = low + (high-low)/2;
//            if(nums[mid] > 0){
//                pos++;
//                high = mid - 1;
//            }
//            else if(nums[mid] < 0){
//                neg++;
//                low = mid +1;
//            }
//        }
//        return Math.max(pos, neg);
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                pos++;
            }
            else if(nums[i] < 0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
    public static void main(String[] args) {
       int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }
}
