import java.util.ArrayList;
import java.util.List;

public class lc_1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
           int largest = greatestElement(candies);
           if( candies[i] >= largest){
               list.add(true);
           }
           else {
               list.add(false);
           }
           candies[i] = candies[i] - extraCandies;
        }
        return list;
    }

    public static int greatestElement(int[] nums){
        int largest = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
//        System.out.println(greatestElement(candies));
    }
}
