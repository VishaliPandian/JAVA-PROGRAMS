import java.util.*;

public class Strreverse {
    public static void main(String[] args) {
      String t= "Hello World Hi";
      int cnt=0;
      
      for(int i=0;i<t.length();i++)
      {
        char ch=t.charAt(i);
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
        {
          cnt=cnt+1;
        }
      }
      System.out.println("No of vowels:"+cnt);
      String reversed="";
      for(int i=t.length()-1;i>=0;i--)
      {
        System.out.print(t.charAt(i));
      }
  }
}