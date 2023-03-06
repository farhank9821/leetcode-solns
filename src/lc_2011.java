import java.util.Objects;

public class lc_2011 {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if(Objects.equals(operations[i], "++X") || Objects.equals(operations[i], "X++")){
                x = x + 1;
            }
            else if(Objects.equals(operations[i], "--X") || Objects.equals(operations[i], "X--")){
                x = x - 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
     String[] operations = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
