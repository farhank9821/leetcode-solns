import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class lc_2404 {

    public static int mostFrequentEven(int[] nums) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(Objects.equals(list.get(i), list.get(j)) && (i != j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]  nums = {4,4,4,9,2,4};
        System.out.println(mostFrequentEven(nums));
    }
}
