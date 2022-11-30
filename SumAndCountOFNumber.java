import java.util.*;

public class SumAndCountOFNumber {
    public static void main(String[] args) {
      //int n=99855;
      int n,count=0,sum=0,a=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("NUMBER: "+n);
      while(n!=0)
      {
        a=n%10;
        sum=sum+a;
        n=n/10;
        count++;
      }
      System.out.println("COUNT OF DIGITS: "+count);
      System.out.println("SUM OF DIGITS: "+sum);
      
    }
}