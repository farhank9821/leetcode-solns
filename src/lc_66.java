import java.util.Arrays;

public class lc_66 {

    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int i=0;

        for(i = size-1 ; i >= 0 ; i--){
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }

        // Cases where we get {9,9}, {9} types of array
        if(i == -1) {
            int[] newDigits = new int[size+1];
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(nums)));
//        int num = 0;
//        for (int a : nums) {
//            num = 10*num + a;
//        }
//        System.out.println(num);
    }
}
