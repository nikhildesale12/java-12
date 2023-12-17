import java.lang.invoke.MethodHandles;
import java.util.Optional;

public class APITester {
   public static void main(String[] args) {
      String str = "Welcome \nto Tutorialspoint!";
      System.out.println(str.indent(0));
      System.out.println(str.indent(3));

      String text = "Java";
      String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
      System.out.println(transformed);

      Optional<String> optional = text.describeConstable();
      System.out.println(optional);

      String cDescription = text.resolveConstantDesc(MethodHandles.lookup());
      System.out.println(cDescription);
   }
}
Output
Welcome 
to Tutorialspoint!

   Welcome 
   to Tutorialspoint!

avaJ
Optional[Java]
Java