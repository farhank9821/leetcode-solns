import java.util.Arrays;

public class lc_167 {

    public static int[] twoSum(int[] numbers, int target) {
//       int[] ans = new int[2];
       int start = 0;
       int end = numbers.length - 1;

       while(start < end){
           int sum = numbers[start] + numbers[end];
           if(sum == target){
//               ans[0] = start + 1;
//               ans[1] = end + 1;
               return new int[]{start+1,end+1};
           }
           else if(sum <target){
               start++;
           }
           else {
               end--;
           }
       }
       return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}
