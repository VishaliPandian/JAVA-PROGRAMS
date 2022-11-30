import java.util.Scanner;


public class primeornot {
   public static void main(String args[]) {
      int  n=7,i,rem=0,count=0;
      if(n==0 || n==1)
      {
        System.out.println(n+" is not a prime number");
      }
      else
      {
        for(i=1;i<=n;i++)
        {
          rem=n%i;
          if(rem==0)
          {
            count=count+1;
          }
        }
        if(count==2)
        {
          System.out.println(n+" is a prime number");
        }
        else{
          System.out.println(n+" is not a prime number");
        }
      }
   }
}
