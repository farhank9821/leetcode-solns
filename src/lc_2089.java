import java.util.*;

public class lc_2089 {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
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
                list.add(mid);
                result = mid;
                end = mid - 1;
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
      int[] nums = {100,1,100};
        System.out.println(targetIndices(nums,100));
    }
}
