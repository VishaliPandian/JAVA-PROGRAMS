import java.util.Scanner;


public class swappingof2variableswithoutthirdvariable {
   public static void main(String args[]) {
      int a=2,b=4;
      b=a+b;//6
      a=b-a;//4
      b=b-a;
      System.out.println("a="+a+" b="+b);
   }
}
