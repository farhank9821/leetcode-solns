public class lc_1588 {

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = sumOfElements(arr,arr.length);
//        int sum = 0;
        if(arr.length%2 != 0){
            for(int i = arr.length; i >=0; i = i - 2){
                sum = sum + sumOfElements(arr,i);
            }
        }

      return sum;
    }

    public static int sumOfElements(int[] arr,int length){
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
//        System.out.println(sumOfElements(arr,arr.length));
    }
}
