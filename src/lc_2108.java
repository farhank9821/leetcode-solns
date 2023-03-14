public class lc_2108 {
    public static String firstPalindrome(String[] words) {
       boolean isPalindrome = false;
       String a = "";
        for (int i = 0; i < words.length; i++) {
            isPalindrome = isPalindrome(words[i]);
            if(isPalindrome){
//                return words[i];
                a = words[i];
                break;
            }
        }
        return a;
    }
    public static boolean isPalindrome(String words){
        boolean IsPalindrome = false;
        String a = "";
        for (int i =words.length()-1; i >= 0; i--) {
            a = a + words.charAt(i);
        }
        if(words.toLowerCase().equals(a.toLowerCase())){
            IsPalindrome = true;
        }
        return IsPalindrome;
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String a = firstPalindrome(words);
        System.out.println(a);

    }
}
