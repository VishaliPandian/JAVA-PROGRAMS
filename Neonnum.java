import java.util.Scanner;
import java.lang.*;
public class Neonnum {

  public static void main(String[] args)
  {
    int num,sqr,d,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr num:");
    num=sc.nextInt();
    sqr=num*num;
    System.out.println("Sqare of"+num+"is"+sqr);
    while(sqr>0)
    {
      d=sqr%10;
      sum=sum+d;
      sqr=sqr/10;
    }
    System.out.println("sum is"+sum);
    if(sum==num)
    {
      System.out.println(num+"is Neon number");
    }
    else
    {
      System.out.println(num+"is Not Neon number");
    }
  }

}