import java.util.stream.Collectors;
import java.util.stream.Stream;

public class APITester {
   public static void main(String[] args) {
      double mean
         = Stream.of(1, 2, 3, 4, 5, 6, 7)
            .collect(Collectors.teeing(
               Collectors.summingDouble(i -> i), Collectors.counting(),
               (sum, n) -> sum / n));

      System.out.println(mean);
   }
}
Output
4.0