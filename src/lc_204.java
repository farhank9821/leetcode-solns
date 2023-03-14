public class lc_204 {

    public static int countPrimes(int n) {
        if(n==0 || n==1)
            return 0;

        if(n== 2)
            return 0;
        int count = 0;

        for (int i = 2; i < n ; i++) {
            boolean isPrime = isPrime(i);
            if(isPrime){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        int i = 2;
        while ( i <= n/2){
            if(n % i == 0){
                prime = false;
                break;
            }
            i++;
        }
        return prime;
    }

    public static int prime(int n){
        if(n==0 || n==1)
            return 0;

        if(n== 2)
            return 0;
        int count = 0;

        boolean[] prime = new boolean[n+1];
        for (int i =1 ; i < n+1 ; i++) {
            prime[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(prime[i]){
                for (int j = i; j*i< n; j++) {
                    prime[j*i] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(prime[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(prime(1500000));
//        System.out.println(isPrime(2));
    }
}
