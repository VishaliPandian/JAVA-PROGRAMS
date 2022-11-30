import java.util.Scanner;
import java.lang.*;
public class Astrongnum {
    public static void main(String[] args) {
      int orgnum,num,num1,d,count=0;
      double sum=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter num:");
      num=sc.nextInt();
      orgnum=num;
      num1=num;
      while(num1!=0)
      {
        num1=num/10;
        ++count;
      }
      System.out.println(count);
      while(num>0)
      {
        d=num%10;
        sum=sum+(Math.pow(d,3));
        num=num/10;
      }
      if(sum==orgnum)
      {
        System.out.println(orgnum+"is Astrong Number");
      }
      else
      {
        System.out.println(orgnum+"is Not Astrong Number");
      }
  }
}