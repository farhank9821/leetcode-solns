public class lc_2520 {

    public static int countDigits(int num) {
        int m = num;
        int count = 0;
        int[] arr = new int[countNumbers(num)];
        int i = arr.length;
        while(num > 0){
            int d = num % 10;
            arr[i-1] = d;
            num = num/10;
            i--;
        }
        for (int j = 0; j <arr.length ; j++) {
            if(m % arr[j] == 0){
                count++;
            }
        }
        return count;
    }

    public static int countNumbers(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
       int n = 198;
        System.out.println(countDigits(n));
    }
}
