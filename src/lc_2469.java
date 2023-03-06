import java.util.*;
public class lc_2469 {

    public static double[] convertTemperature(double celsius) {
      double k = celsius + 273.15;
      double f = (celsius * 1.80) + 32.0;
      return new double[] {k ,f};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double[] a = convertTemperature(c);
        System.out.println(Arrays.toString(a));

    }
}
