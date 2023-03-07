public class lc_121 {

    public static int maxProfit(int[] prices) {

        int min = minElement(prices, prices.length);
        if(min == prices[prices.length-1]) {
            min = minElement(prices, prices.length-1);
            int index = indexOfSmallest(prices,prices.length-1);
            int max = findMax(prices,index, prices.length-1);
            return max - min;
        }

        int index = indexOfSmallest(prices,prices.length);

        int max = findMax(prices,index,prices.length);

        return max-min;
    }

    public static int minElement(int[] nums, int length){
        int min = nums[0];
        for(int i = 0; i < length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array,int length){

        if (array.length == 0)
            return -1;

        int index = 0;
        int min = array[index];

        for (int i = 1; i < length; i++){
            if (array[i] <= min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMax(int[] nums, int index,int length){
        int max = nums[index];
        for(int i = index + 1; i < length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
      int[] nums = {2,4,1};
//        System.out.println(minElement(nums, nums.length));
//        System.out.println(indexOfSmallest(nums));
//        System.out.println(findMax(nums,index,nums.length));

        System.out.println(maxProfit(nums));

    }
}
