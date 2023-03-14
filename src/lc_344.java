public class lc_344 {

    public static void reverseString(char[] s){
        int p = 0;
        int q = s.length-1;
        while(p <q){
            Character temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p++;
            q--;

            if(p == q)
                s[p] = s[q];
        }


    }
    public static void main(String[] args) {

    }
}
