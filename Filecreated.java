import java.io.File;
import java.io.IOException;
public class MyClass {
    public static void main(String args[])throws IOException {
      System.out.println("Creating File");
      File myfile=new File("Hello.txt");
      if(myfile.createNewFile())
      {
          System.out.println("File Created");
      }
      else
      {
      System.out.println("File Already Exists");
      }
    }
}