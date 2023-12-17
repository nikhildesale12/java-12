import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class APITester {
   public static void main(String[] args) throws IOException {
      Path path1 = Files.createTempFile("file1", ".txt");
      Path path2 = Files.createTempFile("file2", ".txt");

      Files.writeString(path1, "tutorialspoint");
      Files.writeString(path2, "tutorialspoint");

      long mismatch = Files.mismatch(path1, path2);

      if(mismatch > 1L) {
         System.out.println("Mismatch occurred in file1 and file2 at : " + mismatch);
      }else {
         System.out.println("Files matched");
      }

      System.out.println();

      Path path3 = Files.createTempFile("file3", ".txt");
      Files.writeString(path3, "tutorialspoint Java 12");

      mismatch = Files.mismatch(path1, path3);

      if(mismatch > 1L) {
         System.out.println("Mismatch occurred in file1 and file3 at : " + mismatch);
      }else {
         System.out.println("Files matched");
      }

      path1.toFile().deleteOnExit();
      path2.toFile().deleteOnExit();
      path3.toFile().deleteOnExit();
   }
}
Output
Files matched

Mismatch occurred in file1 and file3 at : 14