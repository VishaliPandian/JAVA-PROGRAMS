import java.util.*;
import java.util.Scanner;
public class PrimenumberCheckBasedOnRemainderCount {
    public static void main(String[] args) {
      int num,i,rem;
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("PRIME CHECK:");
      System.out.println("Enter the number:");
      num=sc.nextInt();
      if(num==0 || num==1)
      {
        System.out.println(num+" is not a prime number");
      }
      else
      {
       for(i=1;i<=num;i++)
       {
         rem=num%i;
         if(rem==0)
         {
           count=count+1;
         }
       }
       if(count==2)
       {
         System.out.println(num+" is a prime number");
       }
       else
       {
         System.out.println(num+" is a not prime number");
       }
      }
}
  
}