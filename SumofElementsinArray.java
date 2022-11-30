import java.util.*;
import java.util.Scanner;

public class SumofElementsinArray
{
    public static void main(String[] args)
    {
      int[] arr={1,2,3,4,5};
      int sumofarr=0;
      for(int i=0;i<arr.length;i++)
      {
        sumofarr=sumofarr+arr[i];
      }
      System.out.println(sumofarr);
    }
}
      /*int fnum,sum=0;
      Scanner sc =new Scanner(System.in);
      fnum=sc.nextInt();
      int lnum=fnum+2;
      for(int i=fnum;i<=lnum;i++)
      {
          sum=sum+i;
      }
      System.out.println(sum);
  }
}*/