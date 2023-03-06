import java.util.Arrays;

public class lc_34 {

    public static int[] searchRange(int[] nums, int target) {
        int start = firstPos(nums,target);
        int end = lastPos(nums,target);

        return new int[]{start, end};
    }

    public static int firstPos(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target > nums[mid]){
                start = mid +1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target == nums[mid]){
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    public static int lastPos(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int result = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target > nums[mid]){
                start = mid +1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target == nums[mid]){
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,6)));
    }
}
