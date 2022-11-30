import java.util.Scanner;


public class vowel_check_and_consonant_check {
   public static void main(String args[]) {
      String str="Helloworld";
      int vcount=0,ccount=0;
      int length=str.length();
      for(int i=0;i<length;i++)
      {
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
          vcount=vcount+1;
          System.out.println(ch+" is a vowel");
        }
        else
        {
          System.out.println(ch+" is a consonant");
          ccount=ccount+1;
        }
      }
      System.out.println("vowel count is:"); 
      System.out.println(vcount);
      System.out.println("consonant count is:");
      System.out.println(ccount);
   }
}
