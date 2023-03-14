public class lc_1588 {

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        if(arr.length % 2 != 0){
            for(int k = 0; k < arr.length; k = k + 2){
                for(int i = 0; i < arr.length - k; i++){
                    sum  = sum + sumOfElements(arr,i,i+k);
                }
            }
        }
        else {
            for(int k = 0; k < arr.length-1; k = k + 2){
                for(int i = 0; i < arr.length - k; i++){
                    sum  = sum + sumOfElements(arr,i,i+k);
                }
            }
        }
        return sum;
    }



    public static int sumOfElements(int[] arr,int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       int[] arr = {10,11,12};
        System.out.println(sumOddLengthSubarrays(arr));
//        System.out.println(sumOfElements(arr,arr.length));
    }
}
