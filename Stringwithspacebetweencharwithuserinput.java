import java.util.*;

public class Stringwithspacebetweencharwithuserinput {
    public static void main(String[] args) {
      String str;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      str=sc.nextLine();
      int length=str.length();
      for(int i=0;i<=str.length();i++)
      {
       char alp=str.charAt(i);
       System.out.print(alp+" ");
      }
    }
}