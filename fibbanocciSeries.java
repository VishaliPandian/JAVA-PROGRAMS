import java.util.*;

public class fibbanocciSeries {
    public static void main(String[] args) {
      int a=1000,b=2000,c=30000,n=10;
      for(int i=1;i<=n;i++)
      {
        System.out.print(a+", ");
        a=b;
        b=c;
        c=a+b;
      }
  }
}