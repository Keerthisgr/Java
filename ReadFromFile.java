import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
   public static void main(String[] args) throws IOException {
      File file = new File("newFile.txt");
      FileReader fr = new FileReader(file);
      int ch;
      while ((ch=fr.read()) != -1) {
         System.out.print((char)ch);
      }
      fr.close();
   }
}