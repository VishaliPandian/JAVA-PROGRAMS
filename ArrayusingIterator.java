import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class ArrayusingIterator
{
  public static void main(String[] args)
  {
    int n,n1;
    ArrayList<Integer> iob=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n: ");
    n=sc.nextInt();
    System.out.println("Enter "+ n +" inumbers:");
    for(int g=0;g<n;g++)
    {
      n1=sc.nextInt();
      iob.add(n1);
    }
    System.out.println(iob);
    for(int j:iob)
    {
      System.out.println(j);
    }
    System.out.println("Using Iterator");
    Iterator<Integer> it=iob.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
    }
  }
}