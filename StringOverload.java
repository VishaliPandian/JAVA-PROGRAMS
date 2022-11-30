import java.util.*;

class StringOverload 
{
  void check(String str,char ch,char ch1)
  {
    int charcount=0;
    for(int i=0;i<str.length();i++)
    {
      ch1=str.charAt(i);
      if(ch1==ch)
      {
        charcount++;
      }
    }
    System.out.println("No of "+ch+" in "+str+" "+charcount+" times");
  }
  void check(String str)
  {
    String s=str.toLowerCase();
    System.out.println("Vowels present in a String");
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        System.out.println(ch+",");
      }
    }
  }
}
public class FunctionOverloadstrMain
{
  public static void main(String[] args) 
    {
      StringOverload ob= new StringOverload();
      ob.check("success",'s');
      ob.check("wonderful");
    }
}