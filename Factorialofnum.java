import java.util.Scanner;
public class Factorialofnum {

  public static void main(String[] args)
  {
    int num,fact=1,i;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter num:");
    num=sc.nextInt();
    for(i=1;i<=num;i=i+1)//for(i=num;i>0;i=i-1)
    {
      fact=fact*i;
    }
    System.out.println(fact);
  }

}