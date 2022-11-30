public class TrywithmultipletryMultiplecatch
{
  public static void main(String[] args)
  {
    int a=10,b=2,c=1;
    int ar[]={1,2,3,4,5,6};
    try
    
    {
      c=a/b;
      
    }
    catch(ArithmeticException e)//sub class exception
    {
      e.printStackTrace();
    }
    try
    {
      ar[6]=34;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      e.printStackTrace();
    }
    finally
    {
      System.out.println("finally blocks executed ");
    }
  }
}