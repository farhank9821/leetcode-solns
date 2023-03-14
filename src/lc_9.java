public class lc_9 {

    public static boolean isPalindrome(int x) {
        int sum = 0;
        int a = x;
        if(x < 0)
            return false;

        while(x > 0){
            int d = x % 10;
            sum = 10*sum + d;
            x = x/10;
        }
        if(a != sum)
            return false;

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1441));
    }
}
