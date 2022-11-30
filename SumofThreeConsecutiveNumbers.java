import java.util.*;
import java.util.Scanner;

public class SumofThreeConsecutiveNumbers {
    public static void main(String[] args) {
      int fnum,sum=0;
      Scanner sc =new Scanner(System.in);
      fnum=sc.nextInt();
      int lnum=fnum+2;
      for(int i=fnum;i<=lnum;i++)
      {
          sum=sum+i;
      }
      System.out.println(sum);
  }
}