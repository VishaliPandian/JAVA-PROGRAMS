import java.util.*;

public class ReverseStringandLengthofString {
    public static void main(String[] args) {
      String str="ice cream";
      int count=0;
      int strlength=str.length();
      System.out.println(strlength);
      for(int i=strlength-1;i>=0;i--)
      {
        char newchar=str.charAt(i);
        count++;
        System.out.println(newchar);
      }
      System.out.println(count);
  }
}