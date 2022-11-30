import java.util.*;

public class Factorial {
    public static void main(String[] args) {
      int fact=1;
      int n=15,i;
      if(n==1 || n==2)
      {
        System.out.println("Factorial of "+n+" is "+n);
      }
      else
      {
        for(i=n;i>0;i--)
        {
          fact=fact*i;
        }
      }
      System.out.println("Factorial of "+n+" is "+fact);
  }
}