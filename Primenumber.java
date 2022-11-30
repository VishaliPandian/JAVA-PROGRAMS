import java.util.*;

public class Primenumber {
    public static void main(String[] args) {
      int n=89,i,flag=0;
      int m=n/2;
      if(n==0  || n==1)
      {
        System.out.println("is not a prime number");
      }
      else
      {
        for(i=2;i<n;i++)//(can use m or n here m to check the 1st half)
        {
          if(n%i==0)
          {
            System.out.println("It is not a prime number");
            flag=1;
            break;
          }
        }
      }
      if(flag==0)
      {
        System.out.println("It is a prime number");
      }
      
      
}
  
}