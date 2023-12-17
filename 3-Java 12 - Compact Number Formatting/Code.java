import java.text.NumberFormat;
import java.util.Locale;

public class APITester {
   public static void main(String[] args) {
      NumberFormat formatter = NumberFormat.getCompactNumberInstance(
         Locale.US, NumberFormat.Style.LONG);

      System.out.println(formatter.format(1000));
      System.out.println(formatter.format(1000000));

      formatter = NumberFormat.getCompactNumberInstance(
         Locale.US, NumberFormat.Style.SHORT);

      System.out.println(formatter.format(1000));
      System.out.println(formatter.format(1000000));
   }
}
Output
1 thousand
1 million
1K
1M